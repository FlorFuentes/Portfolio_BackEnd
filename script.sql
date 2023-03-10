-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema PortfolioArgPrograma_DataBase
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema PortfolioArgPrograma_DataBase
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PortfolioArgPrograma_DataBase` DEFAULT CHARACTER SET utf8 ;
USE `PortfolioArgPrograma_DataBase` ;

-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Usuario` (
  `ID` INT NOT NULL,
  `Nombre_Usuario` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Experiencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Experiencia` (
  `ID` INT NOT NULL,
  `Descripcion` VARCHAR(200) NOT NULL,
  `Fecha` DATE NOT NULL,
  `Puesto` VARCHAR(45) NOT NULL,
  `Usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Usuario_ID`),
  INDEX `fk_Experiencia_Usuario1_idx` (`Usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Experiencia_Usuario1`
    FOREIGN KEY (`Usuario_ID`)
    REFERENCES `PortfolioArgPrograma_DataBase`.`Usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Educacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Educacion` (
  `ID` INT NOT NULL,
  `Descripcion` VARCHAR(100) NOT NULL,
  `Institucion` VARCHAR(45) NOT NULL,
  `ImgDiploma` VARCHAR(45) NULL,
  `Usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Usuario_ID`),
  INDEX `fk_Educacion_Usuario1_idx` (`Usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Educacion_Usuario1`
    FOREIGN KEY (`Usuario_ID`)
    REFERENCES `PortfolioArgPrograma_DataBase`.`Usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Habilidades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Habilidades` (
  `ID` INT NOT NULL,
  `Porcentaje` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Usuario_ID`),
  INDEX `fk_Habilidades_Usuario1_idx` (`Usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Habilidades_Usuario1`
    FOREIGN KEY (`Usuario_ID`)
    REFERENCES `PortfolioArgPrograma_DataBase`.`Usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Proyectos` (
  `ID` INT NOT NULL,
  `Descripcion` VARCHAR(200) NOT NULL,
  `Link` VARCHAR(200) NOT NULL,
  `Titulo` VARCHAR(45) NOT NULL,
  `Usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Usuario_ID`),
  INDEX `fk_Proyectos_Usuario1_idx` (`Usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Proyectos_Usuario1`
    FOREIGN KEY (`Usuario_ID`)
    REFERENCES `PortfolioArgPrograma_DataBase`.`Usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Redes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Redes` (
  `ID` INT NOT NULL,
  `Link` VARCHAR(200) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Usuario_ID`),
  INDEX `fk_Redes_Usuario1_idx` (`Usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Redes_Usuario1`
    FOREIGN KEY (`Usuario_ID`)
    REFERENCES `PortfolioArgPrograma_DataBase`.`Usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Banner`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Banner` (
  `ID` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Titulo` VARCHAR(45) NOT NULL,
  `Imagen` VARCHAR(200) NOT NULL,
  `Usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Usuario_ID`),
  INDEX `fk_Banner_Usuario1_idx` (`Usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Banner_Usuario1`
    FOREIGN KEY (`Usuario_ID`)
    REFERENCES `PortfolioArgPrograma_DataBase`.`Usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioArgPrograma_DataBase`.`Acerca_de_Mi`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioArgPrograma_DataBase`.`Acerca_de_Mi` (
  `ID` INT NOT NULL,
  `FotoPerfil` VARCHAR(200) NOT NULL,
  `SobreMi` TEXT NOT NULL,
  `Usuario_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Usuario_ID`),
  INDEX `fk_Acerca_de_Mi_Usuario1_idx` (`Usuario_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Acerca_de_Mi_Usuario1`
    FOREIGN KEY (`Usuario_ID`)
    REFERENCES `PortfolioArgPrograma_DataBase`.`Usuario` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
