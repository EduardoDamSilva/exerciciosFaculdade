create database Continuada2;

use Continuada2;

create table Hotel(
	idHotel int primary key auto_increment,
    nome varchar(45),
    logradouro varchar(50),
    numero int,
    complemento varchar(20),
    fkFilial int, 
    foreign key (fkFilial) references Hotel(idHotel)
);

create table Quarto(
	idQuarto int primary key,
	nome varchar(45),
    andar int,
    tipo varchar(45),
    fkHotel int,
    constraint chkTipo check(tipo in ('casal' , 'solteiro')),
    foreign key (fkHotel) references Hotel(idHotel)
);

insert into Hotel values 
	(null, 'Hotel Summerville', 'Via Costeira Senador', 100, null, null),
	(null, 'Hotel Fairmont', 'Avenida Atlântica', 4240, null, null),
	(null, 'Hotel do Sol', 'Via dos Caiçaras', 13508, null, null),
	(null, 'Hotel Summerville II', 'Rua Agostinho Gomes', 1312, null, null),
	(null, 'Hotel Fairmont II', 'Via Costeira Senador', 123, null, null);
    
update hotel set fkFilial = 1 where idHotel = 4;
update hotel set fkFilial = 2 where idHotel = 5;

insert into Quarto values 
	(1, 'Quarto Summerville', 1, 'casal', 1),
	(2, 'Quarto Fairmont', 1, 'casal', 2),
	(3, 'Quarto Summerville II', 1, 'casal', 4),
	(4, 'Quarto Summerville II', 2, 'casal', 4),
	(5, 'Quarto Fairmont II', 1, 'solteiro', 1);
    
select * from Hotel;
select * from Quarto;

select * from hotel h join quarto q on q.fkHotel = h.idHotel;
select h.nome, q.* from hotel h join quarto q on q.fkHotel = h.idHotel where q.tipo = 'solteiro';
select * from hotel hm join hotel hf on hm.idHotel = hf.fkFilial;
select nome,andar  from quarto where nome like 'Q%';
update quarto set tipo = 'solteiro' where idQuarto = 1;
select * from Quarto;
delete from quarto where idQuarto = 5;

select * from hotel hm join hotel hf on hm.idHotel = hf.fkFilial join quarto q on hm.idHotel = q.fkHotel; 

drop database Continuada2;

    
