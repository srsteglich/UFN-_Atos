create table projeto1
(
	ISBN varchar(22) PRIMARY key,	
	nome VARCHAR(50) not null,
	categoria VARCHAR(30) not null,
	quantidade int
)


CREATE TABLE usuarios
(
	id serial PRIMARY KEY,
	nome VARCHAR(50) not null,
	email VARCHAR(50) not null,
	senha BYTEA
)



Select * from projeto1

