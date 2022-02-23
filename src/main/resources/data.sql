CREATE TABLE estabelecimento (
  id BIGINT AUTO_INCREMENT NOT NULL,
   nome VARCHAR(255),
   cnpj VARCHAR(255),
   endereco VARCHAR(255),
   telefone INT,
   quantidade_vagas_motos INT,
   quantidade_vagas_carros INT,
   CONSTRAINT pk_estabelecimento PRIMARY KEY (id)
);