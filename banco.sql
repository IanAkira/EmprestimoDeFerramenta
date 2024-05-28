##cria Banco de dados emprestimodeferramentas
CREATE DATABASE IF NOT EXISTS emprestimodeferramentas;
##cria tb_amigos
USE emprestimodeferramentas;
DROP TABLE IF EXISTS tb_amigos;
CREATE TABLE tb_amigos (
id INTEGER NOT NULL,
nome VARCHAR(100),
telefone INTEGER,
PRIMARY KEY(id)
);



##cria tb_ferramentas
use emprestimodeferramentas;
DROP TABLE IF EXISTS tb_ferramentas;
create table tb_ferramentas (
id integer not null,
nome varchar(100),
marca varchar(100),
valor integer,
primary key(id)
);



##cria tb_Emprestimos
use emprestimodeferramentas;
DROP TABLE IF EXISTS tb_Emprestimos;
create table tb_Emprestimos (
id integer not null,
nomeAmigo varchar(100),
NomeDaFerramenta varchar(100),
data DATE,
idFerramenta integer,
primary key(id)
);



##cria tb_Devolucao
use emprestimodeferramentas;
DROP TABLE IF EXISTS tb_Devolucao;
create table tb_Devolucao (
id integer not null,
nomeAmigo varchar(100),
NomeDaFerramenta varchar(100),
data DATE,
idFerramenta integer,
primary key(id)
);
