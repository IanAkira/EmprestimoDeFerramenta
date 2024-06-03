##cria Banco de dados emprestimodeferramentas
CREATE DATABASE IF NOT EXISTS emprestimodeferramentas;

##utiliza o Banco de dados emprestimodeferramentas
USE emprestimodeferramentas;

##exclui tb_amigos
DROP TABLE IF EXISTS tb_amigos;

##cria tb_amigos
CREATE TABLE tb_amigos (
    id INTEGER NOT NULL,
    nome VARCHAR(100),
    telefone INTEGER,
    PRIMARY KEY(id)
);


##utiliza o Banco de dados emprestimodeferramentas
use emprestimodeferramentas;

##exclui tb_ferramentas
DROP TABLE IF EXISTS tb_ferramentas;

##cria tb_ferramentas
create table tb_ferramentas (
    id integer not null,
    nome varchar(100),
    marca varchar(100),
    valor integer,
    primary key(id)
);


##utiliza o Banco de dados emprestimodeferramentas
use emprestimodeferramentas;

##exclui tb_emprestimos
DROP TABLE IF EXISTS tb_emprestimos;

##cria tb_emprestimos
create table tb_emprestimos (
    id integer not null,
    nome varchar(100),
    nomeDaFerramenta varchar(100),
    data varchar(100),
    idFerramenta integer,
    primary key(id)
);


##utiliza o Banco de dados emprestimodeferramentas
use emprestimodeferramentas;

##exclui tb_devolucao
DROP TABLE IF EXISTS tb_devolucao;

##cria tb_devolucao
    create table tb_devolucao (
    id integer not null,
    nomeAmigo varchar(100),
    nomeDaFerramenta varchar(100),
    data varchar(100),
    idFerramenta integer,
    primary key(id)
);
