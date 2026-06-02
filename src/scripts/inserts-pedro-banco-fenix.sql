use banco_fenix
go

SET DATEFORMAT ymd; 
go

-- 1. Domínio e Status (Carga Inicial)

-- 1.1 UFs
insert into Ufs (sigla, nome) values 
('AC', 'Acre'), ('AL', 'Alagoas'), ('AP', 'Amapá'), ('AM', 'Amazonas'),
('BA', 'Bahia'), ('CE', 'Ceará'), ('ES', 'Espírito Santo'), ('GO', 'Goiás'),
('MA', 'Maranhão'), ('MT', 'Mato Grosso'), ('MS', 'Mato Grosso do Sul'),
('MG', 'Minas Gerais'), ('PA', 'Pará'), ('PB', 'Paraíba'), ('PR', 'Paraná'),
('PE', 'Pernambuco'), ('PI', 'Piauí'), ('RJ', 'Rio de Janeiro'),
('RN', 'Rio Grande do Norte'), ('RS', 'Rio Grande do Sul'), ('RO', 'Rondônia'),
('RR', 'Roraima'), ('SC', 'Santa Catarina'), ('SP', 'São Paulo'),
('SE', 'Sergipe'), ('TO', 'Tocantins'), ('DF', 'Distrito Federal');
go

-- 1.2 Fonte de Aquisição (O banco vai gerar IDs 1 a 4)
insert into FonteAquisicao (descricao) values 
('Google'), ('Site'), ('Indicação'), ('Outros');
go

-- 1.3 Tipo de Serviço (O banco vai gerar IDs 1=Jato, 2=Pintura)
insert into TipoServico (tipo) values ('Jato'), ('Pintura');
go

-- 1.4 Status do Sistema (Regras solicitadas)
insert into StatusOs (status) values 
('Criada'), ('Aguardando execução'), ('Concluída'), ('Pausada'), ('Cancelada');
go

insert into StatusPecas (status) values 
('Pendente'), ('Aguardando execução'), ('Pausada'), ('Executada'), ('Cancelada');
go

insert into StatusCronograma (status) values 
('Agendado'), ('Parcialmente executado'), ('Concluído'), ('Declinado');
go

-- 2. Localização (Cidades e CEPs)

-- Cidades (IDs gerados: 1=SJR Preto, 2=Bady Bassitt, 3=Mirassol)
insert into Cidades (nome, uf_codigo) values
('São José do Rio Preto', 'SP'),
('Bady Bassitt', 'SP'),
('Mirassol', 'SP');
go

insert into Ceps (nr, cidade_codigo) values
('15081500', 1), ('15081501', 1), ('15081502', 1), ('15081694', 1), ('15081695', 1),
('12011500', 1), ('13081501', 1), ('14071502', 1),
('12011504', 1), ('13081305', 1), ('14071709', 1),
('15081503', 2), ('16091503', 2),
('11051503', 3), ('18391503', 3), ('14071203', 3);
go



-- 3. Atores do Sistema (Pessoas, Funcionários, Usuários, Clientes e Fornecedores)


-- 3.1 Pessoas Base (O banco gerará IDs de 1 a 16 nesta ordem exata)
insert into Pessoas (email, telefone, cep_codigo, logradouro, nr_imovel) values
-- Funcionários (IDs 1 a 6)
('mariaeugenia@gmail.com', '17991947256', '15081500', 'Rua Orlando', '1234'),        
('josearnaldo@gmail.com', '17996587256', '15081501', 'Rua Peixonauta', '4321'),      
('carlosroberto@gmail.com', '17991944589', '15081502', 'Rua das Paineiras', '520'),  
('carlamagnus@gmail.com', '17998957556', '15081503', 'Rua Quincas Borcas', '123'),   
('adalbertosilva@gmail.com', '17995647725', '15081694', 'Rua Capital Inicial', '589'), 
('joaquimbarbosa@gmail.com', '17996348826', '15081695', 'Rua dos Bandeirantes', '5410'), 
-- Clientes (IDs 7 a 12)
('comercial@vaievem.com', '17991569842', '12011500', 'Rua Floriano Peixoto', '5698'), 
('comercial@ladeia.com', '17996559820', '13081501', 'Rua Jucelino Kubitschek', '254'),
('luizalmeida@gmail.com', '17991944305', '14071502', 'Rua Dom Casmurro', '3258'),    
('comercial@acoprime.com', '17997965842', '16091503', 'Rua Maria Jorge', '425'),     
('comercial@brazilmetais.com', '17993591842', '11051503', 'Rua Fernanco Henrique Cardoso', '8492'), 
('robertoeugenio@outlook.com', '17997965964', '18391503', 'Rua Getúlio Vargas', '2368'), 
-- Fornecedores (IDs 13 a 16)
('comercial@epristintas.com', '17995357758', '12011504', 'Rua Machado De Assis', '259'), 
('comercial@realsi.com', '1730565395', '13081305', 'Rua Governador Gregório', '354'),    
('adm@novar.com', '17991532305', '14071709', 'Rua Bem Vindo', '5843'),                   
('vendas@brasilcoat.com', '1730313395', '14071203', 'Rua Logoa Cristal', '652');         
go

-- 3.2 Funcionários & Usuários
insert into Funcionarios (pessoa_codigo, cargo, salario) values
(1, 'Secretária', 2500.00),
(2, 'Pintor', 3000.00),
(3, 'Jatiador', 3000.00),
(4, 'CEO', 5000.00),
(5, 'Aux de Pintor', 2000.00),
(6, 'Aux de Jatista', 2000.00);
go

insert into Usuarios (funcionario_codigo, login, senha, tipo_acesso) values
(1, 'maria01.fenix', 'fenix001', 'Secretária'),
(2, 'jose01.fenix', 'fenix002', 'Produção'),
(3, 'carlos01.fenix', 'fenix003', 'Produção'),
(4, 'carla01.fenix', 'fenix004', 'Admin');
go

-- 3.3 Clientes e Especializações
insert into Clientes (pessoa_codigo, fonte_codigo, prioridade) values
(7, 1, 1), (8, 2, 1), (9, 3, 2), (10, 3, 2), (11, 3, 1), (12, 3, 3);
go

insert into PessoaJuridica (cliente_codigo, cnpj, razao_social) values 
(7, '48687828000187', 'Vai e Vem LTDA'),
(8, '54687828000187', 'Ladeia LTDA'),
(10, '57536828000187', 'Aço Prime LTDA'),
(11, '54689728000158', 'Brazil Metais LTDA');
go

insert into PessoaFisica (cliente_codigo, cpf, nome) values
(9, '36602396881', 'Luiz'),
(12, '47705462881', 'Roberto');
go

-- 3.4 Fornecedores
insert into Fornecedores (pessoa_codigo, cnpj, status, prazo_pagamento) values  
(13, '48687828000158', 1, '30'),
(14, '54687828000193', 1, '15'),
(15, '54689728000145', 1, '45'),
(16, '57536828000127', 0, '60');
go


-- 4. Suprimentos (Tintas, Equipamentos e Insumos)


-- (IDs gerados de 1 a 7 para Tintas)
insert into Tintas (fornecedor_codigo, descricao, cor, tipo, acabamento, ref_fornecedor, estoque, valor_unit) values 
(13, 'Preto Semi Brilho Poliester', 'Preto Semi Brilho', 'Poliester', 'Semi Brilho', 'B123', 26.00, 48.90),
(13, 'Preto Poliester Fosco', 'Preto Fosco', 'Poliester', 'Fosco', 'B589', 25.00, 55.20),
(16, 'Aço Corten', 'Aço Corten', 'Poliester', 'Fosco', 'Z569', 37.00, 60.50),
(14, 'Branco Azulado Brilhante Hibrido', 'Branco Azulado', 'Hibrido', 'Brilhante', '15894', 2.00, 35.40),
(14, 'Amarelo Liso Brilhante', 'Amarelo', 'Poliester', 'Brilhante', '9846', 5.00, 52.56),
(15, 'Lilás Liso Brilhante', 'Rosa', 'Poliester', 'Brilhante', 'CLX5987', 8.00, 63.41),
(15, 'Branco Hibrido Brilhante Econ', 'Branco Total', 'Hibrido', 'Brilhante', 'CLX1367', 50.00, 39.80);
go


-- 5. Operações do Sistema (Ordens de Serviço, Peças, Fotos, Cronograma e Produção)


-- 5.1 Ordens de Serviço (Gerando IDs de 1 a 8)
insert into OrdensDeServico (cliente_codigo, usuario_codigo, data_entrada, valor_os, prioridade) values
(8, 1, '2026-05-04', 3230.00, 1),
(7, 1, '2026-05-04', 3530.00, 1),
(9, 1, '2026-05-04', 771.00, 2),
(8, 1, '2026-05-05', 3060.00, 1),
(9, 1, '2026-05-06', 270.00, 2),
(10, 1, '2026-05-06', 605.00, 2),
(12, 1, '2026-05-07', 260.00, 3),
(11, 1, '2026-05-08', 10760.00, 1);
go

-- 5.2 Peças (Gerando IDs de 1 a 16)
insert into Pecas (os_codigo, tinta_codigo, descricao_peca, qdt_total, data_entrada, urgencia, prazo_entrega, valor_total_peca, data_finalizacao) values
(1, 1, 'Tombos', 2, '2026-05-04', 'Normal', '2026-05-14', 700.00, NULL),
(1, 1, 'Torre', 1, '2026-05-05', 'Normal', '2026-05-14', 880.00, '2026-05-13'),
(1, 7, 'Looping', 3, '2026-05-05', 'Normal', '2026-05-14', 1650.00, NULL),
(2, 5, 'Brinquedos', 5, '2026-05-04', 'Normal', '2026-05-14', 2750.00, NULL),
(2, 6, 'Gira-Giras', 4, '2026-05-04', 'Normal', '2026-05-07', 280.00, NULL),
(2, 5, 'Escadas', 10, '2026-05-05', 'Normal', '2026-05-07', 500.00, NULL),
(3, 1, 'Portas', 7, '2026-05-04', 'Normal', '2026-05-07', 315.00, NULL),
(3, 4, 'Janelas', 12, '2026-05-06', 'Urgente', '2026-05-05', 456.00, NULL),
(4, 1, 'Rodinha', 2, '2026-05-05', 'Normal', '2026-05-14', 540.00, NULL),
(4, 3, 'Mini-Torre', 4, '2026-05-05', 'Normal', '2026-05-14', 2520.00, NULL),
(5, 7, 'Cadeiras', 27, '2026-05-06', 'Urgente', '2026-05-05', 270.00, NULL),
(6, 7, 'Guarda-Corpos', 13, '2026-05-06', 'Normal', '2026-05-09', 455.00, NULL),
(6, 2, 'Corrimões', 6, '2026-05-06', 'Normal', '2026-05-09', 150.00, NULL),
(7, 2, 'Mesa de Alumínio', 2, '2026-05-07', 'Muito urgente', '2026-05-06', 260.00, '2026-05-13'),
(8, 7, 'Gradils', 100, '2026-05-08', 'Normal', '2026-05-18', 9500.00, NULL),
(8, 7, 'Guarda-Corpos', 45, '2026-05-08', 'Urgente', '2026-05-09', 1260.00, NULL);
go

-- 5.3 Fotos
insert into Fotos (peca_codigo, foto) values 
(1, 'FotoEx0AA.png'), (1, 'FotoEx0AB.png'), (1, 'FotoEx0AC.png'),
(2, 'FotoEx0BA.png'), (2, 'FotoEx0BB.png'),
(3, 'FotoEx0CA.png'), (4, 'FotoEx1AA.png'),
(5, 'FotoEx1BA.png'), (6, 'FotoEx1CA.png'),
(7, 'FotoEx2AA.png'), (8, 'FotoEx2BA.png'),
(9, 'FotoEx3AA.png'), (10, 'FotoEx2BA.png'),
(11, 'FotoEx4AA.png'), (12, 'FotoEx5AA.png'),
(13, 'FotoEx2BA.png'), (14, 'FotoEx6AA.png'),
(15, 'FotoEx7AA.png'), (16, 'FotoEx7BA.png');
go

-- 5.4 Peças vs Tipos de Serviço
insert into Pecas_TipoServico (tipo_servico_codigo, peca_codigo) values 
(1, 1), (2, 1), (1, 2), (2, 2), (1, 3), (2, 3),
(1, 4), (2, 4), (1, 5), (2, 5), (1, 6), (2, 6),
(1, 7), (2, 7), (1, 8), (2, 8), (1, 9), (2, 9),
(1, 10), (2, 10), (1, 11),
(1, 12), (2, 12), (1, 13), (2, 13),
(2, 14), (2, 15), (1, 16), (2, 16);
go

-- 5.5 Cronograma (Gerando IDs de 1 a 41)
insert into Cronograma (tipo_servico_codigo, peca_codigo, qtd_planejado, data_planejada, usuario_codigo, observacao, data_criacao) values 
(1, 1, 2, '2026-05-12', 1, NULL, '2026-05-10'),
(1, 2, 1, '2026-05-12', 1, NULL, '2026-05-10'),
(2, 15, 33, '2026-05-12', 1, NULL, '2026-05-10'),
(2, 2, 1, '2026-05-13', 1, NULL, '2026-05-10'),
(1, 7, 5, '2026-05-13', 1, NULL, '2026-05-10'),
(1, 9, 1, '2026-05-13', 1, NULL, '2026-05-10'),
(1, 13, 3, '2026-05-13', 1, NULL, '2026-05-10'),
(2, 14, 2, '2026-05-13', 1, NULL, '2026-05-10'),
(2, 15, 33, '2026-05-13', 1, NULL, '2026-05-10'),
(2, 1, 1, '2026-05-14', 1, NULL, '2026-05-10'),
(1, 7, 2, '2026-05-14', 1, 'Declinado', '2026-05-10'),
(1, 13, 3, '2026-05-14', 1, NULL, '2026-05-10'),
(2, 15, 34, '2026-05-14', 1, 'Parcialmente executado', '2026-05-10'),
(2, 1, 1, '2026-05-15', 1, NULL, '2026-05-10'),
(1, 3, 3, '2026-05-15', 1, NULL, '2026-05-10'),
(2, 7, 7, '2026-05-15', 1, NULL, '2026-05-10'),
(1, 16, 45, '2026-05-15', 1, NULL, '2026-05-10'),
(2, 3, 2, '2026-05-18', 1, NULL, '2026-05-10'),
(2, 16, 22, '2026-05-18', 1, NULL, '2026-05-10'),
(2, 3, 1, '2026-05-19', 1, NULL, '2026-05-10'),
(1, 4, 3, '2026-05-19', 1, NULL, '2026-05-10'),
(1, 4, 2, '2026-05-19', 1, NULL, '2026-05-10'),
(2, 9, 1, '2026-05-19', 1, NULL, '2026-05-10'),
(2, 16, 23, '2026-05-19', 1, NULL, '2026-05-10'),
(2, 4, 5, '2026-05-20', 1, NULL, '2026-05-10'),
(1, 5, 4, '2026-05-20', 1, NULL, '2026-05-10'),
(2, 5, 4, '2026-05-20', 1, NULL, '2026-05-10'),
(1, 6, 5, '2026-05-20', 1, NULL, '2026-05-10'),
(1, 9, 1, '2026-05-20', 1, NULL, '2026-05-10'),
(1, 6, 5, '2026-05-21', 1, NULL, '2026-05-10'),
(2, 6, 10, '2026-05-21', 1, NULL, '2026-05-10'),
(1, 8, 12, '2026-05-21', 1, NULL, '2026-05-10'),
(2, 9, 1, '2026-05-21', 1, NULL, '2026-05-10'),
(2, 8, 12, '2026-05-22', 1, NULL, '2026-05-10'),
(1, 10, 4, '2026-05-22', 1, NULL, '2026-05-10'),
(1, 11, 27, '2026-05-22', 1, NULL, '2026-05-10'),
(2, 10, 3, '2026-05-25', 1, NULL, '2026-05-10'),
(1, 12, 13, '2026-05-25', 1, NULL, '2026-05-10'),
(2, 12, 13, '2026-05-25', 1, NULL, '2026-05-10'),
(2, 10, 1, '2026-05-26', 1, NULL, '2026-05-10'),
(2, 13, 6, '2026-05-28', 1, NULL, '2026-05-10');
go

-- 5.6 Produção 
insert into Producao (cronograma_codigo, tipo_servico_codigo, peca_codigo, usuario_codigo, data_execucao, qtd_produzida, qtd_defeito, observacao) values 
(1, 1, 1, 2, '2026-05-12', 2, 0, NULL),
(2, 1, 2, 2, '2026-05-12', 1, 0, NULL),
(3, 2, 15, 2, '2026-05-12', 28, 5, 'defeito por causa de mal jateamento'),
(4, 2, 2, 2, '2026-05-13', 1, 0, NULL),
(5, 1, 7, 2, '2026-05-13', 4, 1, 'defeito por causa de limpeza inadequada'),
(6, 1, 9, 2, '2026-05-13', 1, 0, NULL),
(7, 1, 13, 2, '2026-05-13', 3, 0, NULL),
(8, 2, 14, 2, '2026-05-13', 2, 0, NULL),
(9, 2, 15, 2, '2026-05-13', 30, 3, 'defeito por causa de excesso de tinta'),
(10, 2, 1, 2, '2026-05-14', 1, 0, NULL),
(11, 1, 7, 2, '2026-05-14', 0, 0, 'Produção zerada - Serviço declinado'),
(12, 1, 13, 2, '2026-05-14', 3, 0, NULL),
(13, 2, 15, 2, '2026-05-14', 29, 0, NULL);
go

insert into Producao_Funcionarios (producao_codigo, funcionario_codigo) values 
(1, 3), (1, 6), (2, 3), (2, 6), (3, 2), (3, 5),
(4, 2), (4, 5), (5, 3), (5, 6), (6, 3), (6, 6),
(7, 3), (7, 6), (8, 2), (8, 5), (9, 2), (9, 5),
(10, 2), (10, 5), (11, 3), (11, 6), (12, 3), (12, 6),
(13, 2), (13, 5);
go

-- 6. Histtórico de auditoria (Status das OSs, Peças e Cronogramas)

-- OSs
insert into Os_Status (os_codigo, status_codigo, data_hora) values 
(1, 2, '2026-05-04'), (2, 2, '2026-05-04'), (3, 2, '2026-05-04'),
(4, 2, '2026-05-05'), (5, 2, '2026-05-06'), (6, 2, '2026-05-06'),
(7, 3, '2026-05-07'), (8, 2, '2026-05-08');
go

-- Peças
insert into Pecas_Status (peca_codigo, status_peca_codigo, data_hora) values 
(1, 2, '2026-05-04'), (2, 4, '2026-05-05'), (3, 2, '2026-05-05'),
(4, 2, '2026-05-04'), (5, 2, '2026-05-04'), (6, 2, '2026-05-05'),
(7, 2, '2026-05-04'), (8, 2, '2026-05-06'), (9, 2, '2026-05-05'),
(10, 2, '2026-05-05'), (11, 2, '2026-05-06'), (12, 2, '2026-05-06'),
(13, 2, '2026-05-06'), (14, 4, '2026-05-07'), (15, 2, '2026-05-08'),
(16, 2, '2026-05-08');
go

-- Cronograma 
insert into Cronograma_Status (cronograma_codigo, status_cronograma_codigo, data_hora) values 
(1, 3, '2026-05-12'), (2, 3, '2026-05-12'), (3, 3, '2026-05-12'),
(4, 3, '2026-05-13'), (5, 3, '2026-05-13'), (6, 3, '2026-05-13'),
(7, 3, '2026-05-13'), (8, 3, '2026-05-13'), (9, 3, '2026-05-13'),
(10, 3, '2026-05-14'), (11, 4, '2026-05-14'), (12, 3, '2026-05-14'),
(13, 2, '2026-05-14'), (14, 1, '2026-05-15'), (15, 1, '2026-05-15'),
(16, 1, '2026-05-15'), (17, 1, '2026-05-15'), (18, 1, '2026-05-18'),
(19, 1, '2026-05-18'), (20, 1, '2026-05-19'), (21, 1, '2026-05-19'),
(22, 1, '2026-05-19'), (23, 1, '2026-05-19'), (24, 1, '2026-05-19'),
(25, 1, '2026-05-20'), (26, 1, '2026-05-20'), (27, 1, '2026-05-20'),
(28, 1, '2026-05-20'), (29, 1, '2026-05-20'), (30, 1, '2026-05-21'),
(31, 1, '2026-05-21'), (32, 1, '2026-05-21'), (33, 1, '2026-05-21'),
(34, 1, '2026-05-22'), (35, 1, '2026-05-22'), (36, 1, '2026-05-22'),
(37, 1, '2026-05-25'), (38, 1, '2026-05-25'), (39, 1, '2026-05-25'),
(40, 1, '2026-05-26'), (41, 1, '2026-05-28');
go