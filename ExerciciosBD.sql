-- Ex 01 --
create database sprint1;

use sprint1;

create table Atleta
(
idAtleta int primary key auto_increment,
nome varchar(40),
modalidade varchar(40),
qtdMedalha int
);

insert into Atleta(nome, modalidade, qtdMedalha) values 
	('Nathan Rodrigo', 'Tênis', 998),
	('Luiz Nisom', 'Natação', 10),
	('Augusto Cesar', 'Futebol', 8),
	('Pedro Rocha', 'Futebol', 11),
	('Bruno Ryu', 'Natação', 20),
	('Prof Vivian', 'Futebol', 50);
    
select * from Atleta;
update Atleta set qtdMedalha = 1 where idAtleta = 1;
update Atleta set qtdMedalha = 20 where idAtleta in (2, 3);
update Atleta set nome = "Bin do Santa" where idAtleta = 4;
alter table Atleta add column dtNasc date;
update Atleta set dtNasc = '1990-06-23' where idAtleta = 1; 
update Atleta set dtNasc = '1999-07-22' where idAtleta = 2;
update Atleta set dtNasc = '1998-08-10' where idAtleta = 3;
update Atleta set dtNasc = '1980-05-07' where idAtleta = 4;
update Atleta set dtNasc = '1790-12-20' where idAtleta = 5;
update Atleta set dtNasc = '1800-01-23' where idAtleta = 6;

delete from Atleta where idAtleta = 5;

select * from Atleta where modalidade != 'Natação';
select * from Atleta where qtdMedalha >= 3;
alter table Atleta modify column modalidade varchar(60);
desc Atleta;
truncate table Atleta;

-- Ex 02 --

use sprint1;

create table Musica(
idMusica int primary key auto_increment,
titulo varchar(40),
artista varchar(40),
genero varchar(40)
);


insert into Musica(titulo, artista, genero) values
	('Fim de Semana no Rio', 'Teto', 'Trap'),
	('Juicy', 'DojaCat', 'Pop'),
	('More', 'KD/A', 'K-Pop'),
	('Enemy', 'Imagine Dragons', 'Rock'),
	('Bones', 'Imagine Dragons', 'Rock'),
	('Need to Know', 'DojaCat', 'Pop'),
	('Vida Louca', 'Mc Poze', 'Trap'),
	('No Below', 'Speedy Ortiz', 'Rock'),
	('Paranoid', 'Black Sabbath', 'Rock'),
	('Counting Stars', 'One Republic', 'Pop');
    
select * from Musica;
alter table Musica add column curtidas int;
update Musica set curtidas = 10 where idMusica = 1;
update Musica set curtidas = 11	where idMusica = 2;
update Musica set curtidas = 20	where idMusica = 3;
update Musica set curtidas = 23	where idMusica = 4;
update Musica set curtidas = 21 where idMusica = 5;
update Musica set curtidas = 26	where idMusica = 6;
update Musica set curtidas = 89	where idMusica = 7;
update Musica set curtidas = 100 where idMusica = 8;
update Musica set curtidas = 74	where idMusica = 9;
update Musica set curtidas = 62	where idMusica = 10;

alter table Musica modify column artista varchar(80);

update Musica set curtidas = 20 where idMusica = 1;
update Musica set curtidas = 30 where idMusica in (2, 3);
update Musica set titulo = 'Worlds' where idMusica = 5;
delete from Musica where idMusica = 4;
select * from Musica where genero != 'funk';
select * from Musica where curtidas != 20;
desc Musica;
truncate Musica;

-- Ex 03 --

use sprint1;

create table Filme
(
idFilme int primary key auto_increment,
titulo varchar(50),
genero varchar(40),
diretor varchar(40)
);

insert into Filme(titulo, genero, diretor) values
	('Truque de Mestre', 'Crime', 'Louis Leterrier'),
	('Até o ultimo homem', 'Drama', 'Mel Gibson'),
	('A Paixão de Cristo', 'Drama', 'Mel Gibson'),
	('Homem-Aranha: Sem Volta para Casa', 'Ação', 'Jon Watts'),
	('Missão Impossível', 'Ação', 'Brian De Palma'),
	('Central de Inteligência', 'Comédia', 'Rawson Marshall Thurber'),
	('Velozes e Furiosos 10', 'Ação', 'Louis Leterrier');
    
select * from Filme;

alter table Filme add column protagonista varchar(50);
update Filme set protagonista = "Jesse Eisenberg" where idFilme = 1;
update Filme set protagonista = "Andrew Garfield" where idFilme = 2;
update Filme set protagonista = "Jim Caviezel" where idFilme = 3; 
update Filme set protagonista = "Tom Holland" where idFilme = 4; 
update Filme set protagonista = "Tom Cruise" where idFilme = 5; 
update Filme set protagonista = "Dwayne Johnson" where idFilme = 6;
update Filme set protagonista = "Vin Diesel" where idFilme = 7; 

alter table Filme modify column diretor varchar(150);
update Filme set diretor = "Christopher Nolan" where idFilme = 5;
update Filme set diretor = "Christopher Nolan" where idFilme in (2, 7);
update Filme set titulo = "Sete Anos no Tibet" where idFilme = 6;
delete from Filme where idFilme = 3;
select * from Filme where genero != 'drama';
select * from Filme where genero = "suspense";
desc Filme;
truncate Filme;

-- Ex 04 --

use sprint1;

create table Professor
(idProfessor int primary key auto_increment,
nome varchar(50),
especialidade varchar(40),
dtNasc date
);

insert into Professor(nome, especialidade, dtNasc) values
	('Vivian', 'Banco de Dados', '1984-10-12'),
	('Yoshi', 'Algoritimos', '1981-05-07'),
	('Fernanda', 'Pesquisa e Inovação', '1995-09-10'),
	('Thiago', 'Socioemocional', '1987-10-11'),
	('Dan', 'Socioemocional', '1983-05-15'),
	('Vera', 'Socioemocional', '1980-06-06'),
	('Chola', 'Arquitetura Computacional', '1967-08-07'),
	('Monica', 'Tecnologia da Informação', '1970-07-14');

select * from Professor;
alter table Professor add column funcao varchar(50), add constraint checknome check(funcao in ('monitor', 'assistente', 'titular'));
update Professor set funcao = "titular" where idProfessor = 1;
update Professor set funcao = "titular" where idProfessor = 2;
update Professor set funcao = "titular" where idProfessor = 3;
update Professor set funcao = "titular" where idProfessor = 4;
update Professor set funcao = "titular" where idProfessor = 5;
update Professor set funcao = "titular" where idProfessor = 6;
update Professor set funcao = "titular" where idProfessor = 7;
update Professor set funcao = "titular" where idProfessor = 8;

insert into Professor(nome, especialidade, dtNasc, funcao) values
	('Emily', 'Tecnologia da Informação', '1995-05-25', 'monitor');

delete from Professor where idProfessor = 5;
select * from Professor where funcao = "titular";
select especialidade, dtNasc from Professor where funcao = "monitor";
update Professor set dtNasc = '2001-05-13' where idProfessor = 3;
truncate Professor;


