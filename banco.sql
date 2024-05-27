CREATE DATABASE IF NOT EXISTS emprestimodeferramentas;
USE emprestimodeferramentas;
DROP TABLE IF EXISTS tb_amigos;
CREATE TABLE tb_amigos (
id INTEGER NOT NULL,
nome VARCHAR(100),
telefone INTEGER,
PRIMARY KEY(id)
);
