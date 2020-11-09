-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema estacionamentoeveris
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema estacionamentoeveris
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `estacionamentoeveris` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `estacionamentoeveris` ;

-- -----------------------------------------------------
-- Table `estacionamentoeveris`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `estacionamentoeveris`.`cliente` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `telefone` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `estacionamentoeveris`.`veiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `estacionamentoeveris`.`veiculo` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `modelo` VARCHAR(255) NULL DEFAULT NULL,
  `placa` VARCHAR(255) NULL DEFAULT NULL,
  `id_cliente` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK51wamqvn3rnkypgbphagexdvw` (`id_cliente` ASC) VISIBLE,
  CONSTRAINT `FK51wamqvn3rnkypgbphagexdvw`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `estacionamentoeveris`.`cliente` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `estacionamentoeveris`.`ticket_pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `estacionamentoeveris`.`ticket_pagamento` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `hora_entrada` TIME NULL DEFAULT NULL,
  `hora_saida` TIME NULL DEFAULT NULL,
  `preco_fracao` DOUBLE NOT NULL,
  `total_pagamento` DOUBLE NOT NULL,
  `id_veiculo` BIGINT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FKfsc5bfdts9f4vi3vv4aqo68t2` (`id_veiculo` ASC) VISIBLE,
  CONSTRAINT `FKfsc5bfdts9f4vi3vv4aqo68t2`
    FOREIGN KEY (`id_veiculo`)
    REFERENCES `estacionamentoeveris`.`veiculo` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
