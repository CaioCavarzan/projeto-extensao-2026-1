create database banco_fenix2
go

use banco_fenix2
go

-- 1. tabelas independentes (sem chaves estrangeiras)

create table Ufs 
(
    sigla  char(2)     not null,
    nome   varchar(50) not null,

	-- Restri��es -- 
	constraint pk_ufs   primary key	 (sigla),
    constraint uq_ufs_nome unique    (nome)
)
go

create table FonteAquisicao 
(
    codigo	  int identity(1,1)  not null,
    descricao varchar     (100)  not null,

	-- Restri��es -- 
	constraint pk_fonte_aquisicao   primary key	 (codigo)
)
go

create table TipoServico 
(
    codigo int identity(1,1)   not null,
    tipo   varchar     (50)    not null

	-- Restri��es -- 
	constraint pk_tipo_servico   primary key   (codigo),
    constraint uq_tiposerv_tipo  unique        (tipo)
)
go

create table StatusOs 
(
    codigo int identity(1,1)   not null,
    status varchar     (25)    not null

	-- Restri��es -- 
	constraint pk_status_os      primary key(codigo),
    constraint uq_status_os_nome unique     (status)
)
go

create table StatusPecas 
(
    codigo int identity(1,1)   not null,
    status varchar     (25)    not null

	-- Restri��es -- 
	constraint pk_status_pecas      primary key   (codigo),
    constraint uq_status_pecas_nome unique        (status)
)
go

create table StatusCronograma 
(
    codigo int identity(1,1)   not null,
    status varchar     (25)    not null

	-- Restri��es -- 
	constraint pk_status_cronograma   primary key   (codigo),
    constraint uq_status_crono_nome   unique        (status)
)
go

-- 2. tabelas de localiza��o 

create table Cidades 
(
    codigo    int identity(1,1)   not null,
    nome      varchar     (40)    not null,
    uf_codigo char        (2)     not null,

	-- Restri��es --
	constraint pk_cidades     primary key  (codigo),
    constraint fk_cidades_ufs foreign key  (uf_codigo) references Ufs(sigla)
)
go

create table Ceps 
(
    nr            char(10)     not null,
    cidade_codigo int          not null,

    -- Restri��es --
    constraint pk_ceps         primary key (nr),
    constraint fk_ceps_cidades foreign key (cidade_codigo) references Cidades(codigo)
)
go


-- 3. entidades base (pessoas e telefones)

create table Pessoas 
(
    codigo     int identity not null,
    email      varchar(150),
    cep_codigo char   (10)  not null,        
    logradouro varchar(100),
    nr_casa    varchar(10) ,
    telefone   varchar(20),

    -- Restri��es --
    constraint pk_pessoas       primary key (codigo),
    constraint uq_pessoas_email unique      (email),
    constraint fk_pessoas_ceps  foreign key (cep_codigo) references Ceps(nr)
)
go

-- 4. heran�a (clientes, funcion�rios e fornecedores)

create table Clientes 
(
    pessoa_codigo int not null,           
    fonte_codigo  int,
    observacao    varchar(300),  
    complemento   varchar(100),
    prioridade    int,

    -- Restri��es --
    constraint pk_clientes         primary key (pessoa_codigo),
    constraint fk_clientes_pessoas foreign key (pessoa_codigo) references Pessoas(codigo),
    constraint fk_clientes_fonte   foreign key (fonte_codigo)  references FonteAquisicao(codigo)
)
go

create table PessoaFisica 
(
    cliente_codigo int         not null,
    cpf            char(11)    not null,
    nome           varchar(50) not null,
    observacao     varchar(300),

    -- Restri��es --
    constraint pk_pessoafisica     primary key (cliente_codigo),
    constraint uq_pessoafisica_cpf unique      (cpf),
    constraint fk_pf_clientes      foreign key (cliente_codigo) references Clientes(pessoa_codigo)
)
go

create table PessoaJuridica 
(
    cliente_codigo int          not null,
    cnpj           char(14)     not null,
    razao_social   varchar(200) not null,
    nome_fantasia  varchar(200),
    ie             varchar(50),

    -- Restri��es --
    constraint pk_pessoajuridica      primary key (cliente_codigo),
    constraint uq_pessoajuridica_cnpj unique      (cnpj),
    constraint fk_pj_clientes         foreign key (cliente_codigo) references Clientes(pessoa_codigo)
)
go

create table Funcionarios 
(
    pessoa_codigo int not null,   
    salario       decimal(18,2),
    cargo         varchar(50),

    -- Restri��es --
    constraint pk_funcionarios         primary key (pessoa_codigo),
    constraint fk_funcionarios_pessoas foreign key (pessoa_codigo) references Pessoas(codigo),
    constraint ck_funcionarios_salario check       (salario >= 0)
)
go

create table Fornecedores 
(
    pessoa_codigo   int         not null,    
    cnpj            char   (14) not null,
    status          varchar(50),
    prazo_pagamento varchar(50),

    -- Restri��es --
    constraint pk_fornecedores         primary key (pessoa_codigo),
    constraint uq_fornecedores_cnpj    unique      (cnpj),
    constraint fk_fornecedores_pessoas foreign key (pessoa_codigo) references Pessoas(codigo)
)
go


-- 5. opera��o (estoque, os, pe�as e cronograma)

create table Tintas 
(
    codigo            int identity not null,
    fornecedor_codigo int          not null,
    descricao         varchar(200),
    cor               varchar(50),
    tipo              varchar(50),
    acabamento        varchar(50),
    ref_fornecedor    varchar(100),
    estoque           decimal(10, 2) default 0,
    valor_unit        decimal(18, 2),

    -- Restri��es --
    constraint pk_tintas              primary key (codigo),
    constraint fk_tintas_fornecedores foreign key (fornecedor_codigo) references Fornecedores(pessoa_codigo),
    constraint ck_tintas_valor        check       (valor_unit >= 0),
    constraint ck_tintas_estoque      check       (estoque >= 0)
)
go

create table OrdensDeServico 
(   
    nr_os                 int identity,
    cliente_codigo        int      not null,
    funcionario_codigo    int      not null,
    data_entrada          datetime default getdate(),
    valor_os              decimal(18, 2),
    prioridade            int,
    data_criacao          datetime default getdate(),
    ultima_alteracao      datetime,
    funcionario_alteracao int,

    -- Restri��es --
    constraint pk_ordens_servico  primary key (nr_os),
    constraint fk_os_clientes     foreign key (cliente_codigo)        references Clientes(pessoa_codigo),
    constraint fk_os_funcionarios foreign key (funcionario_codigo)    references Funcionarios(pessoa_codigo),
    constraint fk_os_funcalt      foreign key (funcionario_alteracao) references Funcionarios(pessoa_codigo),
    constraint ck_os_valor        check       (valor_os >= 0)
)
go

create table Pecas 
(
    codigo                int identity not null,
    os_codigo             int          not null,
    tinta_codigo          int          not null,         
    servico_codigo        int,          
    funcionario_codigo    int,
    descricao_peca        varchar(300),
    qdt_total             int,
    data_entrada          datetime,
    urgencia              varchar(50),
    prazo_entrega         date,
    data_limite           date,
    valor_item            decimal(18,2),
    data_finalizacao      datetime,
    nr_ose                varchar(50),
    score_prioridade      decimal(6,2),
    ultima_alteracao      datetime, 
    funcionario_alteracao int,      

    -- Restri��es --
    constraint pk_pecas              primary key (codigo),
    constraint fk_pecas_os           foreign key (os_codigo)             references OrdensDeServico(nr_os),
    constraint fk_pecas_tintas       foreign key (tinta_codigo)          references Tintas(codigo),
    constraint fk_pecas_servico      foreign key (servico_codigo)        references TipoServico(codigo),
    constraint fk_pecas_funcalt      foreign key (funcionario_codigo)    references Funcionarios(pessoa_codigo),
    constraint ck_pecas_valor        check       (valor_item >= 0),
    constraint ck_pecas_urgencia     check       (urgencia in ('muito urgente', 'urgente', 'normal', 'nao urgente')),
    constraint ck_pecas_qtd          check       (qdt_total > 0),
    constraint fk_pecas_funcalt_alt  foreign key (funcionario_alteracao) references Funcionarios(pessoa_codigo)
)
go

create table Fotos 
(
    codigo      int identity not null,
    peca_codigo int          not null,
    foto        varbinary(MAX),
    
    -- Restri��es --
    constraint pk_fotos       primary key (codigo),
    constraint fk_fotos_pecas foreign key (peca_codigo) references Pecas(codigo)
)
go

create table Pecas_TipoServico  -- Observação: Adicionada em 28/04, estava dentre as associações, porém, deve ser criada antes de produção e cronograma
(
    tipo_servico_codigo int not null,
    peca_codigo         int not null,

    -- Restri��es --
    constraint pk_pecas_tiposervico primary key (tipo_servico_codigo, peca_codigo),
    constraint fk_pts_servico       foreign key (tipo_servico_codigo) references TipoServico(codigo),
    constraint fk_pts_peca          foreign key (peca_codigo)         references Pecas(codigo)
)
go

create table Cronograma
(
    codigo                int identity not null,
    tipo_servico_codigo   int          not null,
    peca_codigo           int          not null, 
    data_planejada        date,
    qtd_planejado         int,
    funcionario_codigo    int,
    obs                   varchar(300),
    prioridade            int,
    data_criacao          datetime default getdate(), 
    ultima_alteracao      datetime,                   
    funcionario_alteracao int,                        

    -- Restrições --
    constraint pk_cronograma              primary key (codigo),
    constraint fk_cronograma_funcionarios foreign key (funcionario_codigo)               references Funcionarios(pessoa_codigo),
    constraint fk_crono_pts               foreign key (tipo_servico_codigo, peca_codigo) references Pecas_TipoServico(tipo_servico_codigo, peca_codigo),
    constraint fk_crono_funcalt           foreign key (funcionario_alteracao)            references Funcionarios(pessoa_codigo),
    constraint ck_crono_qtd               check       (qtd_planejado > 0)
)
go


-- 6. produ��o e associa��es (n:n)

create table Producao 
(
    codigo              int identity not null,
    cronograma_codigo   int          not null,
    peca_codigo         int          not null,         
    tipo_servico_codigo int          not null, 
    data_execucao       datetime default getdate(),
    qtd_produzida       int,
    qtd_defeito         int      default 0,
    observacao          varchar(255),
    status              boolean,

    -- Restrições --
    constraint pk_producao            primary key (codigo),
    constraint fk_producao_cronograma foreign key (cronograma_codigo) references Cronograma(codigo),
    constraint fk_producao_pts        foreign key (tipo_servico_codigo, peca_codigo) references Pecas_TipoServico(tipo_servico_codigo, peca_codigo),
    constraint ck_prod_qtd            check (qtd_produzida >= 0),
    constraint ck_prod_defeito        check (qtd_defeito >= 0)
)
go

create table Producao_Funcionarios
(
    producao_codigo    int not null,
    funcionario_codigo int not null,
    funcao             varchar(100),

    -- Restri��es --
    constraint pk_producao_funcionarios primary key (producao_codigo, funcionario_codigo),
    constraint fk_pf_producao           foreign key (producao_codigo)    references Producao(codigo),
    constraint fk_pf_func               foreign key (funcionario_codigo) references Funcionarios(pessoa_codigo)
)
go

create table Os_Status 
(
    os_codigo     int not null,
    status_codigo int,
    data_hora     datetime default getdate(),
    
    -- Restrições --
    constraint pk_os_status       primary key (os_codigo, status_codigo),
    constraint fk_osstatus_os     foreign key (os_codigo)     references OrdensDeServico(nr_os),
    constraint fk_osstatus_status foreign key (status_codigo) references StatusOs(codigo)
)
go

create table Pecas_Status
(
    peca_codigo        int not null,
    status_peca_codigo int,
    data_hora          datetime default getdate(),
    
    -- Restrições --
    constraint pk_pecas_status      primary key (peca_codigo, status_peca_codigo),
    constraint fk_pecastatus_peca   foreign key (peca_codigo)        references Pecas(codigo),
    constraint fk_pecastatus_status foreign key (status_peca_codigo) references StatusPecas(codigo)
)
go

create table Cronograma_Status
(
    cronograma_codigo        int not null,
    status_cronograma_codigo int not null,
    data_hora                datetime default getdate(),

    -- Restrições --
    constraint pk_cronograma_status  primary key (cronograma_codigo, status_cronograma_codigo),
    constraint fk_cronostatus_crono  foreign key (cronograma_codigo)        references Cronograma(codigo),
    constraint fk_cronostatus_status foreign key (status_cronograma_codigo) references StatusCronograma(codigo)
)
go