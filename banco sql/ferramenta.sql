CREATE DATABASE IF NOT EXISTS db_ferramenta;
USE db_ferramenta;
DROP TABLE IF EXISTS tb_ferramenta;
CREATE TABLE tb_ferramenta (
id INTEGER NOT NULL,
nome VARCHAR(100),
valor INTEGER,
marca VARCHAR(100),
PRIMARY KEY(id)
);
