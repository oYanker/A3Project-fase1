# A3Project-fase1
Projeto da primeira fase de programação da universidade


CREATE TABLE `tb_amigos` (
  `id` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `telefone` int NOT NULL,
  `email` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `tb_ferramentas` (
  `id` int NOT NULL,
  `nome_ferramenta` varchar(45) NOT NULL,
  `valor` double NOT NULL,
  `marca` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
