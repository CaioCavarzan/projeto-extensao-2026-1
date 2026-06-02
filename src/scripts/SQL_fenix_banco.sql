create database banco_fenix
go

use banco_fenix
go

-- 1. Tabelas independentes (sem chaves estrangeiras)

create table Ufs 
(
    sigla  char(2)     not null,
    nome   varchar(50) not null,

	-- Restricoes -- 
	constraint pk_ufs      primary key (sigla),
    constraint uq_ufs_nome unique      (nome)  -- Não pode haver duplicidade de nomes de Ufs
)
go

create table FonteAquisicao 
(
    codigo	  int identity     not null,
    descricao varchar     (50)         , -- Pode ser null

	-- Restricoes -- 
	constraint pk_fonte_aquisicao   primary key	 (codigo)
)
go

create table TipoServico 
(
    codigo int identity     not null,
    tipo   varchar     (50) not null,

	-- Restricoes -- 
	constraint pk_tipo_servico   primary key   (codigo),
    constraint uq_tiposerv_tipo  unique        (tipo)   -- Não pode haver duplicidade de tipos
)
go

create table StatusOs 
(
    codigo int identity     not null,
    status varchar     (25) not null,

	-- Restricoes -- 
	constraint pk_status_os      primary key(codigo),
    constraint uq_status_os_nome unique     (status) --Não pode haver duplicidade de status da OS
)
go

create table StatusPecas 
(
    codigo int identity     not null,
    status varchar     (25) not null,

	-- Restricoes -- 
	constraint pk_status_pecas      primary key   (codigo),
    constraint uq_status_pecas_nome unique        (status) -- Não pode haver duplicidade de status da peça
)
go

create table StatusCronograma 
(
    codigo int identity     not null,
    status varchar     (25) not null,

	-- Restricoes -- 
	constraint pk_status_cronograma   primary key   (codigo),
    constraint uq_status_crono_nome   unique        (status) -- Não pode haver duplicidade de status do cronograma
)
go

-- 2. Tabelas de localizacao

create table Cidades 
(
    codigo    int identity     not null,
    nome      varchar     (40) not null,
    uf_codigo char        (2)  not null, -- Chave estrangeira ligada à sigla da Uf

	-- Restricoes --
	constraint pk_cidades     primary key  (codigo),
    constraint fk_cidades_ufs foreign key  (uf_codigo) references Ufs(sigla)
)
go

create table Ceps 
(
    nr            char(10) not null, -- Numero do CEP, chave primária
    cidade_codigo int      not null, -- Chave estrangeira ligada ao código de Cidade

    -- Restricoes --
    constraint pk_ceps         primary key (nr),
    constraint fk_ceps_cidades foreign key (cidade_codigo) references Cidades(codigo)
)
go


-- 3. Entidades base

create table Pessoas 
(
    codigo     int identity not null,
    email      varchar(150)         , -- Pode ser null
    telefone   varchar(20)          , -- Pode ser null
    cep_codigo char   (10)  not null, -- Chave estrangeira ligada ao "numero (nr)" na tabela de Ceps    
    logradouro varchar(100)         , -- Pode ser null
    nr_imovel  varchar(8)           , -- Pode ser null

    -- Restricoes --
    constraint pk_pessoas       primary key (codigo),
    constraint uq_pessoas_email unique      (email) ,  -- Não pode haver duplicidade de e-mails
    constraint fk_pessoas_ceps  foreign key (cep_codigo) references Ceps(nr)
)
go

-- 4. Herancas

create table Clientes 
(
    pessoa_codigo int not null, -- Chave estrangeira de Pessoa           
    fonte_codigo  int not null, -- Chave estrangeira de FonteAquisicao
    observacao    varchar(300), -- Pode ser null
    prioridade    int         , -- Pode ser null

    -- Restricoes --
    constraint pk_clientes         primary key (pessoa_codigo),
    constraint fk_clientes_pessoas foreign key (pessoa_codigo) references Pessoas       (codigo),
    constraint fk_clientes_fonte   foreign key (fonte_codigo)  references FonteAquisicao(codigo)
)
go

create table PessoaFisica 
(
    cliente_codigo int         not null, -- Chave estrangeira de Cliente
    cpf            char   (11) not null, -- Exatamente apenas os números sem máscara no banco: se possível, fazer máscara no front-end
    nome           varchar(50) not null,

    -- Restricoes --
    constraint pk_pessoafisica     primary key (cliente_codigo),
    constraint uq_pessoafisica_cpf unique      (cpf), -- Não poder haver duplicidade de cpf
    constraint fk_pf_clientes      foreign key (cliente_codigo) references Clientes(pessoa_codigo)
)
go

create table PessoaJuridica 
(
    cliente_codigo int          not null, -- Chave estrangeira de Cliente
    cnpj           char   (14)  not null, -- Tem exatamente 14 numeros, caso necessário, fazer máscara no front-end
    razao_social   varchar(200) not null, -- Pode ser null
    nome_fantasia  varchar(100)         , -- Pode ser null
    ie             varchar(14)          , -- Inscrição Estadual, caso necessário, máscara no front-end

    -- Restricoes --
    constraint pk_pessoajuridica      primary key (cliente_codigo),
    constraint uq_pessoajuridica_cnpj unique      (cnpj), -- Não pode haver duplicidade de cnpj
    constraint fk_pj_clientes         foreign key (cliente_codigo) references Clientes(pessoa_codigo)
)
go

create table Funcionarios 
(
    pessoa_codigo int not null , -- Chave estrangeira de Pessoa
    salario       decimal(18,2), -- Pode ser null
    cargo         varchar(50)  , -- Pode ser null

    -- Restricoes --
    constraint pk_funcionarios         primary key (pessoa_codigo),
    constraint fk_funcionarios_pessoas foreign key (pessoa_codigo) references Pessoas(codigo),
    constraint ck_funcionarios_salario check       (salario >= 0) -- Restricao para que o salario não possa ser negativo
)
go

create table Usuarios 
(
    funcionario_codigo int          not null, -- Chave estrangeira de Funcionário
    login              varchar(150) not null, 
    senha              varchar(100) not null,
    tipo_acesso        varchar(30)  not null,

    -- Restrições --
    constraint pk_usuarios              primary key (funcionario_codigo), 
    constraint uq_usuarios_login        unique      (login), -- Não pode haver duplicidade de login
    constraint fk_usuarios_funcionarios foreign key (funcionario_codigo) references Funcionarios(pessoa_codigo)
)
go

create table Fornecedores 
(
    pessoa_codigo   int         not null, -- Chave estrangeira de Pessoa
    cnpj            char   (14) not null,
    status          bit         not null, -- 1 para Ativo, 0 para Inativo
    prazo_pagamento varchar(50) not null,

    -- Restricoes --
    constraint pk_fornecedores         primary key (pessoa_codigo),
    constraint uq_fornecedores_cnpj    unique      (cnpj), -- Não pode haver duplicidade de cnpj
    constraint fk_fornecedores_pessoas foreign key (pessoa_codigo) references Pessoas(codigo)
)
go


-- 5. Operacao (estoque, os, pecas e cronograma)

create table Tintas 
(
    codigo            int identity  not null           ,
    fornecedor_codigo int           not null           , -- Chave estrangeira ligada à tabela Fornecedores
    descricao         varchar(100)  not null           ,
    cor               varchar(50)                      ,
    tipo              varchar(50)                      ,
    acabamento        varchar(50)                      ,
    ref_fornecedor    varchar(100)                     , 
    estoque           decimal(10, 2) not null default 0,
    valor_unit        decimal(18, 2) not null          , 

    -- Restricoes --
    constraint pk_tintas              primary key (codigo),
    constraint fk_tintas_fornecedores foreign key (fornecedor_codigo) references Fornecedores(pessoa_codigo),
    constraint ck_tintas_valor        check       (valor_unit >= 0),  -- Restrição para que o valor unitário da tinta não possa ser negativo
    constraint ck_tintas_estoque      check       (estoque >= 0)      -- Restrição para que o estoque da tinta não possa ser negativo
)
go

create table OrdensDeServico 
(   
    nr_os          int identity not null ,
    cliente_codigo int      not null     , -- Chave estrangeira ligada à tabela Clientes
    usuario_codigo int      not null     , -- Chave estrangeira ligada à tabela Usuarios
    data_entrada   datetime not null     , 
    valor_os       decimal(18, 2)        ,
    prioridade     int                   ,

    -- Restricoes --
    constraint pk_ordens_servico primary key (nr_os),
    constraint fk_os_clientes    foreign key (cliente_codigo) references Clientes(pessoa_codigo),
    constraint fk_os_usuarios    foreign key (usuario_codigo) references Usuarios(funcionario_codigo),
    constraint ck_os_valor       check       (valor_os >= 0)  -- Restrição para que o valor da ordem de serviço não possa ser negativo
)
go

create table Pecas 
(
    codigo           int identity not null,
    os_codigo        int          not null, -- Chave estrangeira ligada à tabela OrdensDeServico
    tinta_codigo     int          not null, -- Chave estrangeira ligada à tabela Tintas
    ultima_alteracao datetime             ,   
    descricao_peca   varchar(300)         ,
    qdt_total        int                  , 
    data_entrada     datetime     not null, 
    urgencia         varchar(50)          ,
    prazo_entrega    date                 , 
    valor_total_peca decimal(18,2)        , 
    data_finalizacao datetime             ,
    nr_ose           varchar(50)          ,
    score_prioridade decimal(6,2)         ,    

    -- Restricoes --
    constraint pk_pecas          primary key (codigo),
    constraint fk_pecas_os       foreign key (os_codigo)    references OrdensDeServico(nr_os),
    constraint fk_pecas_tintas   foreign key (tinta_codigo) references Tintas(codigo),
    constraint ck_pecas_valor    check       (valor_total_peca >= 0),
    constraint ck_pecas_urgencia check       (urgencia in ('muito urgente', 'urgente', 'normal', 'nao urgente')),
    constraint ck_pecas_qtd      check       (qdt_total > 0)
)
go

create table Fotos 
(
    codigo      int identity not null,
    peca_codigo int          not null, -- Chave estrangeira ligada à tabela Pecas
    foto        varchar(MAX)         , -- Correção do Sérgio
    
    -- Restricoes --
    constraint pk_fotos      primary key (codigo),
    constraint fk_fotos_pecas foreign key (peca_codigo) references Pecas(codigo)
)
go

-- ORDEM CORRIGIDA: Pecas_TipoServico precisa vir ANTES de Cronograma e Produção
create table Pecas_TipoServico 
(
    tipo_servico_codigo int not null, 
    peca_codigo         int not null, 

    -- Restricoes --
    constraint pk_pecas_tiposervico primary key (tipo_servico_codigo, peca_codigo),
    constraint fk_pts_servico       foreign key (tipo_servico_codigo) references TipoServico(codigo), 
    constraint fk_pts_peca          foreign key (peca_codigo)         references Pecas(codigo)        
)
go

create table Cronograma
(
    codigo              int identity not null ,
    tipo_servico_codigo int          not null , -- Chave estrangeira ligada à tabela TipoServico
    peca_codigo         int          not null , -- Chave estrangeira ligada à tabela Pecas
    data_planejada      date                  ,
    qtd_planejado       int                   ,
    usuario_codigo      int          not null , -- Chave estrangeira ligada à tabela Usuarios
    observacao          varchar(200)          ,
    prioridade          int                   ,
    data_criacao        datetime     not null ,
    ultima_alteracao    datetime              ,
    usuario_alteracao   int                   ,

    -- Restricoes --
    constraint pk_cronograma          primary key (codigo),
    constraint fk_cronograma_usuarios foreign key (usuario_codigo)                   references Usuarios(funcionario_codigo),
    constraint fk_crono_pts           foreign key (tipo_servico_codigo, peca_codigo) references Pecas_TipoServico(tipo_servico_codigo, peca_codigo),
    constraint fk_crono_usualt        foreign key (usuario_alteracao)                references Usuarios(funcionario_codigo),
    constraint ck_crono_qtd           check       (qtd_planejado > 0)
)
go

create table Producao 
(
    codigo              int identity not null ,
    cronograma_codigo   int          not null , -- Chave estrangeira ligada à tabela Cronograma
    tipo_servico_codigo int          not null , -- Chave estrangeira ligada à tabela TipoServico
    peca_codigo         int          not null , -- Chave estrangeira ligada à tabela Pecas
    usuario_codigo      int          not null , -- Chave estrangeira ligada à tabela Usuarios
    data_execucao       datetime     not null , 
    qtd_produzida       int                   ,
    qtd_defeito         int      default 0    ,
    observacao          varchar(max)          ,

    -- Restricoes --
    constraint pk_producao            primary key (codigo),
    constraint fk_producao_cronograma foreign key (cronograma_codigo)                references Cronograma(codigo),
    constraint fk_producao_pts        foreign key (tipo_servico_codigo, peca_codigo) references Pecas_TipoServico(tipo_servico_codigo, peca_codigo),
    constraint fk_producao_usuarios   foreign key (usuario_codigo)                   references Usuarios(funcionario_codigo),
    constraint ck_prod_qtd            check       (qtd_produzida >= 0),
    constraint ck_prod_defeito        check       (qtd_defeito >= 0)
)
go

-- 6. Associações (N:N) restantes

create table Producao_Funcionarios
(
    producao_codigo    int not null, -- Chave estrangeira ligada à tabela Producao
    funcionario_codigo int not null, -- Chave estrangeira ligada à tabela Funcionarios

    -- Restricoes --                                
    constraint pk_producao_funcionarios primary key (producao_codigo, funcionario_codigo),
    constraint fk_pf_producao           foreign key (producao_codigo)    references Producao(codigo),
    constraint fk_pf_func               foreign key (funcionario_codigo) references Funcionarios(pessoa_codigo)
)
go

create table Os_Status 
(
    os_codigo     int      not null, -- Chave estrangeira ligada à tabela OrdensDeServico
    status_codigo int      not null, -- Chave estrangeira ligada à tabela StatusOs
    data_hora     datetime not null, 
    
    -- Restricoes --
    constraint pk_os_status       primary key (os_codigo, status_codigo), -- Fechamento do parêntese corrigido
    constraint fk_osstatus_os     foreign key (os_codigo)     references OrdensDeServico(nr_os),
    constraint fk_osstatus_status foreign key (status_codigo) references StatusOs(codigo)
)
go

create table Pecas_Status
(
    peca_codigo        int      not null, -- Chave estrangeira ligada à tabela Pecas
    status_peca_codigo int      not null, -- Chave estrangeira ligada à tabela StatusPecas
    data_hora          datetime not null, 
    
    -- Restricoes --
    constraint pk_pecas_status      primary key (peca_codigo, status_peca_codigo),
    constraint fk_pecastatus_peca   foreign key (peca_codigo)        references Pecas(codigo),
    constraint fk_pecastatus_status foreign key (status_peca_codigo) references StatusPecas(codigo)
)
go

create table Cronograma_Status
(
    cronograma_codigo        int      not null, -- Chave estrangeira ligada à tabela Cronograma
    status_cronograma_codigo int      not null, -- Chave estrangeira ligada à tabela StatusCronograma
    data_hora                datetime not null,
    observacao               varchar(300)     ,

    -- Restricoes --
    constraint pk_cronograma_status  primary key (cronograma_codigo, status_cronograma_codigo),
    constraint fk_cronostatus_crono  foreign key (cronograma_codigo)        references Cronograma(codigo),
    constraint fk_cronostatus_status foreign key (status_cronograma_codigo) references StatusCronograma(codigo)
)
go