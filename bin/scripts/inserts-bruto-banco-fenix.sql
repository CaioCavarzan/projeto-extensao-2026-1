use banco_fenix
go

-- Força o padrão de datas para evitar erros de conversão
SET DATEFORMAT ymd; 
go

-- 1. Tabelas Independentes

insert into Ufs (sigla, nome) values 
('AC', 'Acre'), ('AL', 'Alagoas'), ('AP', 'Amapá'), ('AM', 'Amazonas'),
('BA', 'Bahia'), ('CE', 'Ceará'), ('DF', 'Distrito Federal'), ('ES', 'Espírito Santo'),
('GO', 'Goiás'), ('MA', 'Maranhão'), ('MT', 'Mato Grosso'), ('MS', 'Mato Grosso do Sul'),
('MG', 'Minas Gerais'), ('PA', 'Pará'), ('PB', 'Paraíba'), ('PR', 'Paraná'),
('PE', 'Pernambuco'), ('PI', 'Piauí'), ('RJ', 'Rio de Janeiro'), ('RN', 'Rio Grande do Norte'),
('RS', 'Rio Grande do Sul'), ('RO', 'Rondônia'), ('RR', 'Roraima'), ('SC', 'Santa Catarina'),
('SP', 'São Paulo'), ('SE', 'Sergipe'), ('TO', 'Tocantins');
go

insert into FonteAquisicao (descricao) values 
('Google Ads'), ('Facebook'), ('Instagram'), ('Indicação'), 
('Feira de Eventos'), ('E-mail Marketing'), ('Site Corporativo'), 
('Telemarketing'), ('Outdoor'), ('Revista Especializada');
go

insert into TipoServico (tipo) values 
('Jateamento Abrasivo'), ('Pintura Eletrostática'), ('Polimento Industrial'), 
('Limpeza Química'), ('Tratamento Anticorrosivo'), ('Solda Especial'), 
('Corte a Laser'), ('Inspeção de Qualidade'), ('Embalagem Padrão'), ('Envernizamento');
go

insert into StatusOs (status) values 
('Criada'), ('Em Orçamento'), ('Aprovada'), ('Aguardando Peças'), 
('Em Execução'), ('Pausada'), ('Concluída'), ('Faturada'), ('Paga'), ('Cancelada');
go

insert into StatusPecas (status) values 
('Aguardando Entrada'), ('Na Fila'), ('Em Jateamento'), ('Em Pintura'), 
('Em Secagem'), ('Retrabalho'), ('Aprovada GQ'), ('Refugo'), ('Pronta'), ('Expedida');
go

insert into StatusCronograma (status) values 
('Rascunho'), ('Planejado'), ('Equipe Alocada'), ('Iniciado'), 
('Atrasado'), ('Pausado'), ('Adiantado'), ('Concluído'), ('Cancelado'), ('Arquivado');
go

-- 2. Localização

-- Cidades (IDs 1 a 10)
insert into Cidades (nome, uf_codigo) values
('São Paulo', 'SP'), ('Campinas', 'SP'), ('Rio de Janeiro', 'RJ'), 
('Belo Horizonte', 'MG'), ('Curitiba', 'PR'), ('Joinville', 'PR'), 
('Porto Alegre', 'RS'), ('Goiânia', 'GO'), ('Brasília', 'DF'), ('Salvador', 'BA');
go

-- CEPs (IDs textuais de 1 a 10)
insert into Ceps (nr, cidade_codigo) values
('01000-001', 1), ('13000-002', 2), ('20000-003', 3), ('30000-004', 4), 
('80000-005', 5), ('89200-006', 6), ('90000-007', 7), ('74000-008', 8), 
('70000-009', 9), ('40000-010', 10);
go


-- 3. Atores do Sistema


-- 40 Pessoas para cobrir Clientes, Funcionários e Fornecedores
insert into Pessoas (email, telefone, cep_codigo, logradouro, nr_imovel) values

-- Clientes PF (IDs 1 a 10)
('cliente1@email.com', '11900000001', '01000-001', 'Rua Alfa', '101'),
('cliente2@email.com', '11900000002', '13000-002', 'Rua Beta', '102'),
('cliente3@email.com', '11900000003', '20000-003', 'Rua Gama', '103'),
('cliente4@email.com', '11900000004', '30000-004', 'Rua Delta', '104'),
('cliente5@email.com', '11900000005', '80000-005', 'Rua Epsilon', '105'),
('cliente6@email.com', '11900000006', '89200-006', 'Rua Zeta', '106'),
('cliente7@email.com', '11900000007', '90000-007', 'Rua Eta', '107'),
('cliente8@email.com', '11900000008', '74000-008', 'Rua Theta', '108'),
('cliente9@email.com', '11900000009', '70000-009', 'Rua Iota', '109'),
('cliente10@email.com','11900000010', '40000-010', 'Rua Kappa', '110'),

-- Clientes PJ (IDs 11 a 20)

('empresa1@email.com', '11900000011', '01000-001', 'Av Um', '201'),
('empresa2@email.com', '11900000012', '13000-002', 'Av Dois', '202'),
('empresa3@email.com', '11900000013', '20000-003', 'Av Tres', '203'),
('empresa4@email.com', '11900000014', '30000-004', 'Av Quatro', '204'),
('empresa5@email.com', '11900000015', '80000-005', 'Av Cinco', '205'),
('empresa6@email.com', '11900000016', '89200-006', 'Av Seis', '206'),
('empresa7@email.com', '11900000017', '90000-007', 'Av Sete', '207'),
('empresa8@email.com', '11900000018', '74000-008', 'Av Oito', '208'),
('empresa9@email.com', '11900000019', '70000-009', 'Av Nove', '209'),
('empresa10@email.com','11900000020', '40000-010', 'Av Dez', '210'),

-- Funcionarios (IDs 21 a 30)

('func1@email.com',    '11900000021', '01000-001', 'Travessa A', '301'),
('func2@email.com',    '11900000022', '13000-002', 'Travessa B', '302'),
('func3@email.com',    '11900000023', '20000-003', 'Travessa C', '303'),
('func4@email.com',    '11900000024', '30000-004', 'Travessa D', '304'),
('func5@email.com',    '11900000025', '80000-005', 'Travessa E', '305'),
('func6@email.com',    '11900000026', '89200-006', 'Travessa F', '306'),
('func7@email.com',    '11900000027', '90000-007', 'Travessa G', '307'),
('func8@email.com',    '11900000028', '74000-008', 'Travessa H', '308'),
('func9@email.com',    '11900000029', '70000-009', 'Travessa I', '309'),
('func10@email.com',   '11900000030', '40000-010', 'Travessa J', '310'),

-- Fornecedores (IDs 31 a 40)

('forn1@email.com',    '11900000031', '01000-001', 'Distrito Industrial 1', '401'),
('forn2@email.com',    '11900000032', '13000-002', 'Distrito Industrial 2', '402'),
('forn3@email.com',    '11900000033', '20000-003', 'Distrito Industrial 3', '403'),
('forn4@email.com',    '11900000034', '30000-004', 'Distrito Industrial 4', '404'),
('forn5@email.com',    '11900000035', '80000-005', 'Distrito Industrial 5', '405'),
('forn6@email.com',    '11900000036', '89200-006', 'Distrito Industrial 6', '406'),
('forn7@email.com',    '11900000037', '90000-007', 'Distrito Industrial 7', '407'),
('forn8@email.com',    '11900000038', '74000-008', 'Distrito Industrial 8', '408'),
('forn9@email.com',    '11900000039', '70000-009', 'Distrito Industrial 9', '409'),
('forn10@email.com',   '11900000040', '40000-010', 'Distrito Industrial 10','410');
go

-- 10 Clientes PF (Pessoas de 1 a 10)
insert into Clientes (pessoa_codigo, fonte_codigo, prioridade) values
(1, 1, 1), (2, 2, 2), (3, 3, 3), (4, 4, 1), (5, 5, 2), 
(6, 6, 3), (7, 7, 1), (8, 8, 2), (9, 9, 3), (10, 10, 1);
go

insert into PessoaFisica (cliente_codigo, cpf, nome) values
(1, '11111111111', 'Ana Souza'), (2, '22222222222', 'Bruno Lima'), 
(3, '33333333333', 'Carla Dias'), (4, '44444444444', 'Diego Alves'), 
(5, '55555555555', 'Elisa Rocha'), (6, '66666666666', 'Fábio Costa'), 
(7, '77777777777', 'Gabriela Luz'), (8, '88888888888', 'Henrique Paz'), 
(9, '99999999999', 'Igor Mendes'), (10,'10101010101', 'Júlia Nery');
go

-- 10 Clientes PJ (Pessoas de 11 a 20)
insert into Clientes (pessoa_codigo, fonte_codigo, prioridade) values
(11, 1, 1), (12, 2, 2), (13, 3, 3), (14, 4, 1), (15, 5, 2), 
(16, 6, 3), (17, 7, 1), (18, 8, 2), (19, 9, 3), (20, 10, 1);
go

insert into PessoaJuridica (cliente_codigo, cnpj, razao_social) values 
(11, '11111111000111', 'Indústria Alpha LTDA'), (12, '22222222000122', 'Metalúrgica Beta S.A.'),
(13, '33333333000133', 'Estruturas Gama LTDA'), (14, '44444444000144', 'Delta Usinagem'),
(15, '55555555000155', 'Epsilon Peças EPP'),  (16, '66666666000166', 'Zeta Logística S.A.'),
(17, '77777777000177', 'Eta Montagens LTDA'), (18, '88888888000188', 'Theta Industrial'),
(19, '99999999000199', 'Iota Engenharia'),    (20, '10101010000100', 'Kappa Ferramentaria');
go

-- 10 Funcionários (Pessoas de 21 a 30)
insert into Funcionarios (pessoa_codigo, cargo, salario) values
(21, 'Pintor', 3500.00), (22, 'Jatista', 3200.00), (23, 'Auxiliar', 2000.00), 
(24, 'Inspetor GQ', 4500.00), (25, 'Líder Prod', 6000.00), (26, 'Almoxarife', 2800.00), 
(27, 'Comprador', 4000.00), (28, 'Vendedor', 3500.00), (29, 'Assistente ADM', 2500.00), 
(30, 'Gerente', 8000.00);
go

insert into Usuarios (funcionario_codigo, login, senha, tipo_acesso) values
(21, 'user.21', 'hash123', 'Producao'), (22, 'user.22', 'hash123', 'Producao'), 
(23, 'user.23', 'hash123', 'Producao'), (24, 'user.24', 'hash123', 'Qualidade'), 
(25, 'user.25', 'hash123', 'Lideranca'),(26, 'user.26', 'hash123', 'Estoque'), 
(27, 'user.27', 'hash123', 'Compras'),  (28, 'user.28', 'hash123', 'Vendas'), 
(29, 'user.29', 'hash123', 'Admin'),    (30, 'user.30', 'hash123', 'Gerencia');
go

-- 10 Fornecedores (Pessoas de 31 a 40)
insert into Fornecedores (pessoa_codigo, cnpj, status, prazo_pagamento) values  
(31, '11000000000101', 1, '15 Dias'), (32, '22000000000102', 1, '30 Dias'),
(33, '33000000000103', 1, '45 Dias'), (34, '44000000000104', 1, '60 Dias'),
(35, '55000000000105', 0, 'À Vista'), (36, '66000000000106', 1, '15 Dias'),
(37, '77000000000107', 1, '30 Dias'), (38, '88000000000108', 1, '45 Dias'),
(39, '99000000000109', 1, '60 Dias'), (40, '10000000000110', 0, 'À Vista');
go


-- 4. Suprimentos

-- 10 Tintas (ID fornecedor 31 a 40)
insert into Tintas (fornecedor_codigo, descricao, cor, tipo, acabamento, estoque, valor_unit) values 
(31, 'Epóxi Pó Premium', 'Branco', 'Epóxi', 'Brilhante', 100.5, 45.90),
(32, 'Poliéster Industrial', 'Preto', 'Poliéster', 'Fosco', 85.0, 52.30),
(33, 'Híbrido Texturizado', 'Cinza', 'Híbrido', 'Texturizado', 40.2, 38.50),
(34, 'Verniz Protetivo', 'Incolor', 'Verniz', 'Transparente', 20.0, 80.00),
(35, 'Epóxi Zinco', 'Azul', 'Epóxi', 'Fosco', 15.5, 60.20),
(36, 'Poliéster Alta Camada', 'Vermelho', 'Poliéster', 'Brilhante', 60.0, 55.00),
(37, 'Híbrido Antimicrobiano', 'Verde', 'Híbrido', 'Semi-Brilho', 25.0, 75.90),
(38, 'Tinta Alta Temperatura', 'Prata', 'Silicone', 'Metálico', 10.0, 120.00),
(39, 'Epóxi Piso Resistente', 'Amarelo', 'Epóxi', 'Fosco', 30.0, 48.00),
(40, 'Poliuretano Marítimo', 'Branco', 'PU', 'Brilhante', 50.0, 95.50);
go

-- 5. Operações do Sistema

-- 10 Ordens de Serviço (Clientes 1 a 10, Usuário 21)
insert into OrdensDeServico (cliente_codigo, usuario_codigo, data_entrada, valor_os, prioridade) values
(1, 21, '2026-06-01', 1500.00, 1), (2, 21, '2026-06-02', 2300.50, 2),
(3, 21, '2026-06-03', 850.00,  3), (4, 21, '2026-06-04', 4200.00, 1),
(5, 21, '2026-06-05', 980.00,  2), (6, 21, '2026-06-06', 1150.00, 3),
(7, 21, '2026-06-07', 3400.00, 1), (8, 21, '2026-06-08', 560.00,  2),
(9, 21, '2026-06-09', 7200.00, 3), (10,21, '2026-06-10', 890.00,  1);
go

-- 10 Peças (OS 1 a 10, Tinta 1 a 10). Respeitando o check: 'urgente', 'normal', etc. em minúsculo conforme DDL atual
insert into Pecas (os_codigo, tinta_codigo, descricao_peca, qdt_total, data_entrada, urgencia, prazo_entrega, valor_total_peca) values
(1, 1, 'Estrutura Metálica A', 10, '2026-06-01', 'normal', '2026-06-10', 1500.00),
(2, 2, 'Chassi de Máquina', 5,   '2026-06-02', 'urgente', '2026-06-08', 2300.50),
(3, 3, 'Tubulações Leves', 20,   '2026-06-03', 'nao urgente', '2026-06-15', 850.00),
(4, 4, 'Painel Elétrico', 15,    '2026-06-04', 'muito urgente', '2026-06-06', 4200.00),
(5, 5, 'Portões Industriais', 8, '2026-06-05', 'normal', '2026-06-12', 980.00),
(6, 6, 'Carenagem Frontal', 12,  '2026-06-06', 'urgente', '2026-06-10', 1150.00),
(7, 7, 'Suportes de Motor', 50,  '2026-06-07', 'nao urgente', '2026-06-20', 3400.00),
(8, 8, 'Exaustores', 4,          '2026-06-08', 'normal', '2026-06-15', 560.00),
(9, 9, 'Plataforma Nível', 2,    '2026-06-09', 'muito urgente', '2026-06-12', 7200.00),
(10,10,'Grades de Proteção', 30, '2026-06-10', 'normal', '2026-06-18', 890.00);
go

-- 10 Fotos (Peças 1 a 10)
insert into Fotos (peca_codigo, foto) values 
(1, 'base64_foto1_dummy_data'), (2, 'base64_foto2_dummy_data'),
(3, 'base64_foto3_dummy_data'), (4, 'base64_foto4_dummy_data'),
(5, 'base64_foto5_dummy_data'), (6, 'base64_foto6_dummy_data'),
(7, 'base64_foto7_dummy_data'), (8, 'base64_foto8_dummy_data'),
(9, 'base64_foto9_dummy_data'), (10,'base64_foto10_dummy_data');
go

-- 10 Peças vs Tipos de Serviço (Pareando ID a ID)
insert into Pecas_TipoServico (tipo_servico_codigo, peca_codigo) values 
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5), 
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10);
go

-- 10 Cronogramas
insert into Cronograma (tipo_servico_codigo, peca_codigo, data_planejada, qtd_planejado, usuario_codigo, data_criacao) values 
(1, 1, '2026-06-02', 5, 21, '2026-06-01'), (2, 2, '2026-06-03', 5, 22, '2026-06-02'),
(3, 3, '2026-06-04', 10,23, '2026-06-03'), (4, 4, '2026-06-05', 15,24, '2026-06-04'),
(5, 5, '2026-06-06', 4, 25, '2026-06-05'), (6, 6, '2026-06-07', 6, 26, '2026-06-06'),
(7, 7, '2026-06-08', 25,27, '2026-06-07'), (8, 8, '2026-06-09', 2, 28, '2026-06-08'),
(9, 9, '2026-06-10', 1, 29, '2026-06-09'), (10,10,'2026-06-11', 15,30, '2026-06-10');
go

-- 10 Produções Diárias
insert into Producao (cronograma_codigo, tipo_servico_codigo, peca_codigo, usuario_codigo, data_execucao, qtd_produzida, qtd_defeito, observacao) values 
(1, 1, 1, 21, '2026-06-02', 5, 0, 'Produção perfeita'),
(2, 2, 2, 22, '2026-06-03', 4, 1, 'Falha de aderência'),
(3, 3, 3, 23, '2026-06-04', 10,0, 'Tudo ok'),
(4, 4, 4, 24, '2026-06-05', 12,3, 'Ajuste de máquina necessário'),
(5, 5, 5, 25, '2026-06-06', 4, 0, 'Ok'),
(6, 6, 6, 26, '2026-06-07', 6, 0, 'Ok'),
(7, 7, 7, 27, '2026-06-08', 25,0, 'Ok'),
(8, 8, 8, 28, '2026-06-09', 2, 0, 'Lote finalizado'),
(9, 9, 9, 29, '2026-06-10', 1, 0, 'Peça pesada'),
(10,10,10,30, '2026-06-11', 15,0, 'Tudo ok');
go

-- 10 Ligações Produção vs Funcionários
insert into Producao_Funcionarios (producao_codigo, funcionario_codigo) values 
(1, 21), (2, 22), (3, 23), (4, 24), (5, 25), 
(6, 26), (7, 27), (8, 28), (9, 29), (10, 30);
go


-- 6. Auditorias N:N (Status)


-- 10 Status de OS
insert into Os_Status (os_codigo, status_codigo, data_hora) values 
(1, 1, '2026-06-01'), (2, 2, '2026-06-02'), (3, 3, '2026-06-03'),
(4, 4, '2026-06-04'), (5, 5, '2026-06-05'), (6, 6, '2026-06-06'),
(7, 7, '2026-06-07'), (8, 8, '2026-06-08'), (9, 9, '2026-06-09'),
(10, 10, '2026-06-10');
go

-- 10 Status de Peças
insert into Pecas_Status (peca_codigo, status_peca_codigo, data_hora) values 
(1, 1, '2026-06-01'), (2, 2, '2026-06-02'), (3, 3, '2026-06-03'),
(4, 4, '2026-06-04'), (5, 5, '2026-06-05'), (6, 6, '2026-06-06'),
(7, 7, '2026-06-07'), (8, 8, '2026-06-08'), (9, 9, '2026-06-09'),
(10, 10, '2026-06-10');
go

-- 10 Status de Cronogramas
insert into Cronograma_Status (cronograma_codigo, status_cronograma_codigo, data_hora) values 
(1, 1, '2026-06-01'), (2, 2, '2026-06-02'), (3, 3, '2026-06-03'),
(4, 4, '2026-06-04'), (5, 5, '2026-06-05'), (6, 6, '2026-06-06'),
(7, 7, '2026-06-07'), (8, 8, '2026-06-08'), (9, 9, '2026-06-09'),
(10, 10, '2026-06-10');
go