-- Inserir dados para estúdios
INSERT INTO estudios(nome) VALUES ('Warner Bros.');
INSERT INTO estudios(nome) VALUES ('Disney');

-- Inserir dados para gêneros
INSERT INTO generos(nome) VALUES ('Aventura');
INSERT INTO generos(nome) VALUES ('Comédia');

-- Inserir dados para filmes
INSERT INTO filmes(titulo, sinopse, ano_lancamento, estudio_id, genero_id)
VALUES ('Harry Potter e a Pedra Filosofal', 'Um jovem bruxo descobre seu destino na escola de magia de Hogwarts', 2001, 1, 1);

INSERT INTO filmes(titulo, sinopse, ano_lancamento, estudio_id, genero_id)
VALUES ('Toy Story', 'Brinquedos ganham vida quando os humanos não estão olhando', 1995, 2, 2);