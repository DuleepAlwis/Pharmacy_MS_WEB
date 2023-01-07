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
  `medicine_id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `quantity` VARCHAR(45) NULL,
  `price` VARCHAR(45) NULL,
  `image` VARCHAR(45) NULL,
  PRIMARY KEY (`medicine_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`user_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`user_tb` (
  `user_id` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `mobile` VARCHAR(45) NULL,
  `otp` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`purchase_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`purchase_tb` (
  `purchase_id` INT NOT NULL,
  `quantity` VARCHAR(45) NULL,
  `price` VARCHAR(45) NULL,
  `discount` VARCHAR(45) NULL,
  `total_price` VARCHAR(45) NULL,
  `type` VARCHAR(45) NULL,
  `received` VARCHAR(45) NULL,
  PRIMARY KEY (`purchase_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`order_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`order_tb` (
  `order_id` INT NOT NULL,
  `code` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `district` VARCHAR(45) NULL,
  `user_id` INT NULL,
  `mobile` VARCHAR(45) NULL,
  `purchase_id_fk` INT NULL,
  PRIMARY KEY (`order_id`),
  UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE,
  INDEX `pruchase_id_fk_idx` (`purchase_id_fk` ASC) VISIBLE,
  CONSTRAINT `user_id_fk`
    FOREIGN KEY (`order_id`)
    REFERENCES `pharmacy_db`.`user_tb` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `pruchase_id_fk`
    FOREIGN KEY (`purchase_id_fk`)
    REFERENCES `pharmacy_db`.`purchase_tb` (`purchase_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`supplier_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`supplier_tb` (
  `supplier_id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `district` VARCHAR(45) NULL,
  `mobile` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`supplier_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`supplier_medicine_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`supplier_medicine_tb` (
  `supplier_medicine_id` INT NOT NULL,
  `supplier_id_fk` INT NULL,
  `medicine_id_fk` INT NULL,
  `date_supplied` VARCHAR(45) NULL,
  `units` VARCHAR(45) NULL,
  `amount_cost` VARCHAR(45) NULL,
  PRIMARY KEY (`supplier_medicine_id`),
  INDEX `supplier_id_fk_idx` (`supplier_id_fk` ASC) VISIBLE,
  INDEX `medicine_id_fk_idx` (`medicine_id_fk` ASC) VISIBLE,
  CONSTRAINT `supplier_id_fk`
    FOREIGN KEY (`supplier_id_fk`)
    REFERENCES `pharmacy_db`.`supplier_tb` (`supplier_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `medicine_id_fk`
    FOREIGN KEY (`medicine_id_fk`)
    REFERENCES `pharmacy_db`.`medicine_tb` (`medicine_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`purchase_medicine_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`purchase_medicine_tb` (
  `purchase_medicine_id` INT NOT NULL,
  `amount` VARCHAR(45) NULL,
  `quantity` INT NULL,
  `date` VARCHAR(45) NULL,
  `purchase_id` INT NULL,
  `medicine_id` INT NULL,
  PRIMARY KEY (`purchase_medicine_id`),
  INDEX `purchase_id_fk_idx` (`purchase_id` ASC) VISIBLE,
  INDEX `medicine_id_fk_idx` (`medicine_id` ASC) VISIBLE,
  CONSTRAINT `purchase_id_fk`
    FOREIGN KEY (`purchase_id`)
    REFERENCES `pharmacy_db`.`purchase_tb` (`purchase_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `medicine_id_fk2`
    FOREIGN KEY (`medicine_id`)
    REFERENCES `pharmacy_db`.`medicine_tb` (`medicine_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `pharmacy_db`.`order_medicine_tb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_db`.`order_medicine_tb` (
  `order_medicine_id` INT NOT NULL,
  `order_id` INT NULL,
  `medicine_id` INT NULL,
  `quantity` INT NULL,
  PRIMARY KEY (`order_medicine_id`),
  INDEX `fk2_medicine_idx` (`medicine_id` ASC) VISIBLE,
  INDEX `fk2_order_idx` (`order_id` ASC) VISIBLE,
  CONSTRAINT `fk2_medicine`
    FOREIGN KEY (`medicine_id`)
    REFERENCES `pharmacy_db`.`medicine_tb` (`medicine_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk2_order`
    FOREIGN KEY (`order_id`)
    REFERENCES `pharmacy_db`.`order_tb` (`order_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

Create table IF NOT EXISTS `pharmacy_db`.`system_props`(
prop_id int,
prop_key varchar(255),
prop_value varchar(255),
enabled boolean,
primary key(prop_id)
);
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
