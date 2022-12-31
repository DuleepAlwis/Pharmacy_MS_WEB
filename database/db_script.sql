-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema pharmacy_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pharmacy_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pharmacy_db` DEFAULT CHARACTER SET utf8 ;
USE `pharmacy_db` ;

-- -----------------------------------------------------
-- Table `pharmacy_db`.`medicine_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`medicine_tb` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `quantity` VARCHAR(45) NULL,
  `price` VARCHAR(45) NULL,
  `image` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`user_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`user_tb` (
  `id` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `mobile` VARCHAR(45) NULL,
  `otp` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`order_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`order_tb` (
  `id` INT NOT NULL,
  `code` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `district` VARCHAR(45) NULL,
  `user_id` INT NULL,
  `mobile` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE,
  CONSTRAINT `user_id_fk`
    FOREIGN KEY (`id`)
    REFERENCES `pharmacy_db`.`user_tb` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`purchase_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`purchase_tb` (
  `id` INT NOT NULL,
  `medicine_id` INT NULL,
  `quantity` VARCHAR(45) NULL,
  `price` VARCHAR(45) NULL,
  `discount` VARCHAR(45) NULL,
  `total_price` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `medicine_id_fk_idx` (`medicine_id` ASC) VISIBLE,
  CONSTRAINT `medicine_id_fk`
    FOREIGN KEY (`medicine_id`)
    REFERENCES `pharmacy_db`.`medicine_tb` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

create table IF NOT EXISTS `pharmacy_db`.`system_props`(
id int primary key,
property varchar(255),
value varchar(255),
enable boolean
);

create table IF NOT EXISTS `pharmacy_db`.`suppliers`(
id int primary key,
name varchar(255),
email varchar(255),
mobileno varchar(255),
address varchar(255)
);

create table IF NOT EXISTS `pharmacy_db`.`medicine_supplier`(
id int primary key,
supplier int,
item int,
supplied_date date,
CONSTRAINT `supplier_fk`
    FOREIGN KEY (`supplier`)
    REFERENCES `pharmacy_db`.`suppliers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
CONSTRAINT `medicine_fk`
    FOREIGN KEY (`item`)
    REFERENCES `pharmacy_db`.`medicine_tb` (`id`)
    ON DELETE NO ACTION
)    
    

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
