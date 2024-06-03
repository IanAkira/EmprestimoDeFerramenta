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



##cria tb_emprestimos
use emprestimodeferramentas;
DROP TABLE IF EXISTS tb_emprestimos;
create table tb_emprestimos (
id integer not null,
nome varchar(100),
nomeDaFerramenta varchar(100),
data varchar(100),
idFerramenta integer,
primary key(id)
);



##cria tb_devolucao
use emprestimodeferramentas;
DROP TABLE IF EXISTS tb_devolucao;
create table tb_devolucao (
id integer not null,
nomeAmigo varchar(100),
nomeDaFerramenta varchar(100),
data varchar(100),
idFerramenta integer,
primary key(id)
);
