create database petshop;
use petshop;

create table pet(
idPet int,
tipoAnimal varchar(45),
nome varchar(45),
raca varchar(45),
dtNasc date,
fkPet int,
foreign key (fkPet) references cliente(idCliente),
primary key (fkPet, idPet)
);

create table cliente(
idCliente int primary key auto_increment,
nome varchar(45),
sobrenome varchar(45),
telefoneFixo varchar(45),
telefoneCelular varchar(45),
logradouro varchar(100),
numero int,
bairro varchar(45),
cidade char(2)
);

insert into cliente values 
	(null, 'Eduardo', 'Silva','(11)9090-9090', '(11)91234-1231', 'Av. Haddock Lobo', 55, 'Consolação', 'SP'),
	(null, 'Nathan', 'Silva','(11)9090-9090', '(11)91234-1231', 'Av. Haddock Lobo', 55, 'Consolação', 'SP');
    
insert into pet values
	(1, 'Gato', 'Bladeinho', 'korat', '2010-05-13', 1),
	(2, 'Cachorro', 'Thor', 'Husky Siberiano', '2015-05-13', 1),
	(1, 'Peixe', 'Garen', 'Betao', '2022-05-13', 2);
    
select * from pet;
select * from cliente;

alter table cliente modify nome varchar(50);

desc cliente;

select * from pet where tipoAnimal = 'Gato';    
select nome, dtNasc from pet;
select * from pet order by nome;
select * from cliente order by bairro desc;
select * from pet where nome like 'T%';
select * from cliente where sobrenome = 'Silva';
update cliente set telefoneFixo = '(11)9999-9999' where idCliente = 1;
select * from cliente;

select * from pet p join cliente c on p.fkPet = c.idCliente;
select * from pet p join cliente c on p.fkPet = c.idCliente where idCliente = 1;

delete from pet where idPet = 1 and fkpet = 1;

select * from pet;

drop table pet;
drop table cliente;

-- Ex 02
create database gastoIndividual;
use gastoIndividual;

create table pessoa(
idPessoa int auto_increment primary key,
nome varchar(45),
dtNasc date,
profissao varchar(45)
);

create table gasto(
idGasto int,
dataGasto date,
valor decimal(10, 2),
descricao varchar(45),
fkGasto int,
primary key (idGasto, fkGasto),
foreign key (fkGasto) references pessoa(idPessoa)
);

insert into pessoa values
	(null, 'Eduardo', '2001-05-13', 'Desenvolvedor'),
    (null, 'Pamela', '2002-03-28', 'Biologa Marinha');
    
insert into gasto values
	(1, '2022-09-22', 1000, 'Mensalidade Faculdade', 2),
	(2, '2022-09-05', 55, 'NetFlix', 2),
    (3, '2022-09-05', 300, 'Depilação', 2),
    (1, '2022-09-19', 360, 'Headset', 1),
    (2, '2022-09-10', 33, 'NetFlix', 1);
    
select * from gasto;
select * from pessoa;
select * from pessoa where profissao = 'Desenvolvedor';
select * from pessoa join gasto on fkGasto = idPessoa;
select * from pessoa p join gasto g on g.fkGasto = p.idPessoa where p.nome = 'Pamela';

update pessoa set profissao = 'Bióloga Marinha' where idPessoa = 2;
delete from pessoa where idPessoa = 1;

-- Ex 03

create database praticaFuncionario;
use praticaFuncionario;

create table setor(
	idSetor int auto_increment primary key,
    nome varchar(45),
    numeroAndar char(2)
);

create table funcionario(
	idFuncionario int primary key auto_increment,
	nome varchar(45),
    telefone varchar(45),
    salario varchar(45),
    fkFuncionario int,
    foreign key (fkFuncionario) references setor(idSetor)
);

create table acompanhante(
	idAcompanhante int,
    nome varchar(45),
    relacao varchar(45),
    dtNasc date,
    fkAcompanhante int,
    primary key (idAcompanhante, fkAcompanhante),
    foreign key (idAcompanhante) references funcionario(idFuncionario)
);

insert into setor values
	(null, 'Administrativo', '01'),
    (null, 'Finaceiro', '02'),
    (null, 'Recursos Humanos', '03');

insert into funcionario values 
	(1, 'Eduardo', '(11)99999-9999', '10000', 2),
    (2, 'Pamela', '(11)99999-9999', '10000', 1),
    (3, 'Larissa', '(11)99999-9999', '10000', 1),
    (4, 'Eduardo', '(11)99999-9999', '10000', 2),
    (5, 'Paulo', '(11)99999-9999', '10000', 3),    
    (6, 'Binho','(11)99999-9999', '5000', 3);

insert into acompanhante values
	(1, 'Fabiam', 'Irmão', '2001-05-13', 1),
	(2, 'Roberta', 'Amiga', '2001-05-13', 2),
	(3, 'Carlos', 'Irmão', '2001-05-13', 3);
    
    
select * from acompanhante;
select * from funcionario;
select * from setor;

select * from setor s join funcionario f on fkFuncionario = idSetor; 
select * from setor s join funcionario f on fkFuncionario = idSetor where s.idSetor = 1;
select * from acompanhante a join funcionario f on fkAcompanhante = idFuncionario;

select f.nome, a.* from funcionario f join acompanhante a on fkFuncionario = idAcompanhante;

select * from funcionario f join acompanhante a join setor s on fkFuncionario = idAcompanhante = idSetor;

-- Ex 04

create database treinador;
use treinador;

create table treinador(
idTreinador int auto_increment primary key,
nome varchar(45),
telefone varchar(45),
email varchar(45),
fkTreinadorNovato int,
foreign key (fkTreinadorNovato) references treinador(idTreinador)
) auto_increment = 100;

create table nadador (
idNadador int auto_increment primary key,
nome varchar(45),
estado char(2),
dtNasc date,
fkNadador int,
foreign key (fkNadador) references treinador(idTreinador)
) auto_increment = 10;



insert into nadador values
	(null, 'Binho', 'SP', '2001-05-30', 100),
	(null, 'Dudola', 'SP', '2001-05-30', 101),
	(null, 'Ig', 'RJ', '2001-06-30', 102),
	(null, 'Melancia', 'BH', '2001-09-23', 100);
    
insert into treinador values
	(null, 'Brandão', '(11)99088-9023', 'fernado.brandao@sptech.school', null),
	(null, 'Taiza', '(11)99088-9023', 'taiza@sptech.school', null),
	(null, 'Vivian', '(11)99238-2391', 'vivian.silva@sptech.school', null),
    (null, 'Paulo', '(11)90391-2389', 'paulo.silva@sptech.scholl', null);
    
    update treinador set fkTreinadorNovato = 100 where idTreinador = 101;
    update treinador set fkTreinadorNovato = 102 where idTreinador = 103;

select * from treinador;
select * from nadador;
select * from treinador t join nadador n on t.idTreinador = n.fkNadador;
select * from treinador t join nadador n on t.idTreinador = n.fkNadador where t.nome = 'Brandão';
select * from treinador t join treinador tr on tr.idTreinador = t.fkTreinadorNovato;
select * from treinador t join treinador tr on tr.idTreinador = t.fkTreinadorNovato where t.nome = 'Taiza';
select * from treinador t join treinador tr on tr.idTreinador = t.fkTreinadorNovato join nadador n on n.fkNadador = t.idTreinador;
select * from treinador t join treinador tr on tr.idTreinador = t.fkTreinadorNovato join nadador n on n.fkNadador = t.idTreinador where tr.nome = 'Brandão';
 