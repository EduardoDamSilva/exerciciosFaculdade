create database venda;

use venda;

create table cliente (
idCliente int primary key auto_increment,
nome varchar(45),
email varchar(45),
logradouro varchar(45),
numero int,
complemento varchar(45),
fkIndicador int,
foreign key (fkIndicador) references cliente(idCliente)
);

create table venda(
idVenda int auto_increment,
total decimal(10, 2),
dataVenda date,
fkCliente int,
primary key(idVenda, fkCliente),
foreign key (fkCliente) references cliente(idCliente)
);

create table produto(
idProduto int primary key, 
nome varchar(45),
descricao varchar(100),
preco decimal(10, 2)
);

create table pedido(
idPedido int auto_increment,
quantidade int,
desconto varchar(45),
fkVenda int,
primary key(idPedido, fkVenda, fkCliente, fkProduto),
foreign key (fkVenda) references venda(idVenda),
fkCliente int,
foreign key (fkCliente) references cliente(idCliente),
fkProduto int,
foreign key (fkProduto) references produto(idProduto)
);

insert into cliente values 
	(null, 'Eduardo', 'eduardo@sptech.school','Praça Nami Jafet' , 55, 'Apto 4013', null),
	(null, 'Lucas', 'lucas@sptech.school','Rua da Ponte' , 199, 'Casa Amarela', 1),
	(null, 'Matheus', 'matheus@sptech.school', 'Rua da Ponte' , 199, 'Casa Amarela', 2),
	(null, 'Pedro', 'pedro@sptech.school', 'Av Haddock Lobo' , 955, 'Predio da Sptech', 1),
	(null, 'Gustavo', 'gustavo@sptech.school', 'Av Haddock Lobo' , 955, 'Predio da Sptech', 3);

insert into venda values
	(null, 100, '2022-10-27', 1),
	(null, 200, '2022-10-27', 1),
	(null, 110, '2022-10-27', 2),
	(null, 100, '2022-10-27', 2),
	(null, 10, '2022-10-27', 3),
	(null, 90, '2022-10-27', 3),
	(null, 105, '2022-10-27', 4),
	(null, 20, '2022-10-27', 4),
	(null, 40, '2022-10-27', 5),
	(null, 80, '2022-10-27', 5);
    
insert into produto values 
	(1, 'Camiseta Vermelha', 'Camiseta Vermelha', 50),
	(2, 'Calça Azul', 'Calça Azul', 40),
	(3, 'Tenis Nike', 'Tenis da Nike Preto', 429.90),
	(4, 'Tenis Adidas', 'Tenis da Adidas Preto', 529.90);

insert into pedido values 
	(null, 2, '0%', 1, 1, 1),
	(null, 5, '0%', 2, 1, 2),
	(null, 3, '9.34%', 3, 2, 2),
	(null, 2, '0', 4, 2, 1),
	(null, 1, '80%', 5, 3, 1),
	(null, 2, '10%', 6, 3, 1),
	(null, 1, '52%', 7, 4, 3),
	(null, 1, '80%', 8, 3, 3),
	(null, 1, '70%', 9, 3, 3),
	(null, 1, '40%', 10, 3, 2);

select * from cliente;
select * from venda;
select * from produto;
select * from pedido;

select * from cliente join venda on cliente.idCliente = venda.fkCliente;
select * from cliente join venda on cliente.idCliente = venda.fkCliente where cliente.nome = "Eduardo";
select * from cliente indicador join cliente indicado on indicador.idCliente = indicado.fkIndicador;
-- j-)
select * from cliente indicador join cliente indicado on indicador.idCliente = indicado.fkIndicador 
where indicador.nome = 'Eduardo' or indicado.fkIndicador = '1'; 

select * from cliente indicado 
join cliente indicador on indicado.fkIndicador = indicador.idCliente
join venda on indicado.idCliente = venda.fkCliente 
join pedido on venda.idVenda = pedido.fkVenda 
join produto on produto.idProduto = pedido.fkProduto;

select venda.dataVenda, produto.nome, pedido.quantidade from venda 
join pedido on venda.idVenda = pedido.fkVenda join produto on produto.idProduto = pedido.fkProduto;  

select produto.nome, produto.preco, sum(pedido.quantidade) from produto 
join pedido on produto.idProduto = pedido.fkProduto group by produto.nome;

insert into cliente values
	(null, 'Nathan', 'nathan@sptech.school', 'Av Haddock Lobo' , 955, 'Predio da Sptech', 1);
    
select * from cliente join venda on cliente.idCliente = venda.fkCliente
union
select * from cliente left join venda on cliente.idCliente = venda.fkCliente;

select min(produto.preco), max(produto.preco) from produto;
select sum(produto.preco), avg(produto.preco) from produto;

-- Codigo que não funcionou: select * from produto where preco > avg(produto.preco);
select count(nome) from produto where preco > 262.45;

-- s) Não entendi muito bem o que era para fazer aqui 
select sum(produto.preco) from produto;

select sum(produto.preco) * pedido.quantidade as Total from produto 
join pedido on produto.idProduto = pedido.idPedido join venda on  venda.idVenda = pedido.fkVenda
where venda.idVenda = 1;
    




    
