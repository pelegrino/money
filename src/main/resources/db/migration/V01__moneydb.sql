CREATE TABLE categoria (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT categoria (nome) VALUES ('Lazer');
INSERT categoria (nome) VALUES ('Alimentação');
INSERT categoria (nome) VALUES ('Supermercado');
INSERT categoria (nome) VALUES ('Farmácia');
INSERT categoria (nome) VALUES ('Outros');