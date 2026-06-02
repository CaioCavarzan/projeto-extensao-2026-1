-- 1. visões do excel -- 

-- 1.1 planilha de clientes (juntando pf e pj em uma única lista)
select 
    isnull(pj.razao_social, pf.nome) as [nome do cliente],
    isnull(pj.cnpj, pf.cpf) as [cpf ou cnpj],
    case when pf.cpf is not null then 'pf' else 'pj' end as [tipo cliente],
    fa.descricao as [fonte de aquisição],
    p.email as email,
    p.telefone as telefone,
    p.logradouro + ', ' + p.nr_imovel as endereco,
    cid.nome as cidade,
    cid.uf_codigo as estado,
    p.cep_codigo as cep
from clientes c
inner join pessoas p on c.pessoa_codigo = p.codigo
left join pessoafisica pf on c.pessoa_codigo = pf.cliente_codigo
left join pessoajuridica pj on c.pessoa_codigo = pj.cliente_codigo
left join fonteaquisicao fa on c.fonte_codigo = fa.codigo
inner join ceps cep on p.cep_codigo = cep.nr
inner join cidades cid on cep.cidade_codigo = cid.codigo;

-- 1.2 planilha de funcionários
select 
    f.pessoa_codigo as cod,
    isnull(pf.nome, p.email) as nome, -- usando e-mail caso não tenha pf atrelado
    f.cargo as cargo,
    f.salario as salario,
    p.email as email,
    p.telefone as telefone,
    cid.nome as cidade,
    cid.uf_codigo as estado
from funcionarios f
inner join pessoas p on f.pessoa_codigo = p.codigo
left join pessoafisica pf on p.codigo = pf.cliente_codigo -- se funcionário foi cadastrado como pf
inner join ceps cep on p.cep_codigo = cep.nr
inner join cidades cid on cep.cidade_codigo = cid.codigo;

-- 1.3 planilha de tintas (mostrando o e-mail e cnpj do fornecedor)
select 
    t.codigo as cod,
    t.descricao as descricao,
    t.cor as cor,
    t.tipo as tipo,
    t.acabamento as acabamento,
    t.ref_fornecedor as [ref fornecedor],
    p.email as [email fornecedor],
    f.cnpj as [cnpj fornecedor],
    t.valor_unit as [valor unit r$],
    t.estoque as [estoque atual kg]
from tintas t
inner join fornecedores f on t.fornecedor_codigo = f.pessoa_codigo
inner join pessoas p on f.pessoa_codigo = p.codigo;

-- 1.4 planilha de ordens de serviço (trazendo o status mais recente)
select 
    os.nr_os as [número os],
    isnull(pj.razao_social, pf.nome) as cliente,
    os.data_entrada as [data de entrada],
    os.valor_os as [valor da os],
    os.prioridade as prioridade,
    usu_p.email as [usuario registro],
    statusatual.status as [status atual]
from ordensdeservico os
inner join clientes c on os.cliente_codigo = c.pessoa_codigo
left join pessoafisica pf on c.pessoa_codigo = pf.cliente_codigo
left join pessoajuridica pj on c.pessoa_codigo = pj.cliente_codigo
inner join usuarios u on os.usuario_codigo = u.funcionario_codigo
inner join pessoas usu_p on u.funcionario_codigo = usu_p.codigo
outer apply (
    -- subquery mágica para pegar o status mais recente desta os
    select top 1 s.status 
    from os_status os_s
    inner join statusos s on os_s.status_codigo = s.codigo
    where os_s.os_codigo = os.nr_os
    order by os_s.data_hora desc
) as statusatual;

-- 1.5 planilha de produção diária (o chão de fábrica)
select 
    prod.codigo as [codigo producao],
    prod.cronograma_codigo as [cronograma id],
    ts.tipo + ' da peça ' + cast(prod.peca_codigo as varchar) as [serviço e peça],
    prod.data_execucao as [data execução],
    prod.qtd_produzida as [qtd produzida],
    prod.qtd_defeito as [qtd defeito],
    prod.observacao as obs,
    usu_p.email as [funcionario registro]
from producao prod
inner join tiposervico ts on prod.tipo_servico_codigo = ts.codigo
inner join usuarios u on prod.usuario_codigo = u.funcionario_codigo
inner join pessoas usu_p on u.funcionario_codigo = usu_p.codigo
order by prod.data_execucao desc;

-- 2. relatórios de gestão --

-- relatório a: qualidade da produção (índice de defeitos por serviço)
-- descobre qual etapa do serviço (jato ou pintura) está estragando mais peças.
select 
    ts.tipo as [tipo de serviço],
    sum(prod.qtd_produzida) as [total produzido],
    sum(prod.qtd_defeito) as [total com defeito],
    cast((sum(prod.qtd_defeito) * 100.0) / nullif(sum(prod.qtd_produzida + prod.qtd_defeito), 0) as decimal(5,2)) as [% de perda]
from producao prod
inner join tiposervico ts on prod.tipo_servico_codigo = ts.codigo
group by ts.tipo;

-- relatório b: faturamento e volume por cliente (curva abc)
-- quem são os clientes que mais dão dinheiro para a fenix?
select 
    isnull(pj.razao_social, pf.nome) as cliente,
    count(os.nr_os) as [quantidade de os],
    sum(os.valor_os) as [valor total comprado (r$)]
from ordensdeservico os
inner join clientes c on os.cliente_codigo = c.pessoa_codigo
left join pessoafisica pf on c.pessoa_codigo = pf.cliente_codigo
left join pessoajuridica pj on c.pessoa_codigo = pj.cliente_codigo
group by isnull(pj.razao_social, pf.nome)
order by sum(os.valor_os) desc;

-- relatório c: alerta de estoque crítico de tintas
-- lista apenas as tintas que estão com menos de 10 kg no estoque para o setor de compras agir rápido.
select 
    t.codigo as codigo,
    t.descricao as tinta,
    p.email as [email fornecedor],
    t.estoque as [estoque restante (kg)],
    t.valor_unit as [preço de reposição (r$)]
from tintas t
inner join fornecedores f on t.fornecedor_codigo = f.pessoa_codigo
inner join pessoas p on f.pessoa_codigo = p.codigo
where t.estoque < 10.00
order by t.estoque asc;