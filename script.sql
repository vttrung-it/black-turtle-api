CREATE SCHEMA `black-turtle-api` ;


-- user
CREATE TABLE `black-turtle-api`.`user` (
                                           `id` INT NOT NULL,
                                           `username` VARCHAR(45) NOT NULL,
                                           `phone_number` VARCHAR(45) NULL,
                                           `full_name` VARCHAR(45) NOT NULL,
                                           `email` VARCHAR(45) NOT NULL,
                                           `address` VARCHAR(45) NULL,
                                           PRIMARY KEY (`id`));

-- category_sp
CREATE TABLE `black-turtle-api`.`category_sp` (
                                                  `id` INT NOT NULL,
                                                  `name` VARCHAR(45) NOT NULL,
                                                  `description` VARCHAR(250) NOT NULL,
                                                  PRIMARY KEY (`id`));

-- category_color
CREATE TABLE `black-turtle-api`.`category_color` (
                                                     `id` INT NOT NULL,
                                                     `name` VARCHAR(45) NOT NULL,
                                                     `code_color` VARCHAR(45) NOT NULL,
                                                     `description` VARCHAR(45) NOT NULL,
                                                     PRIMARY KEY (`id`));

-- category_link
CREATE TABLE `black-turtle-api`.`category_link` (
                                                    `id` INT NOT NULL,
                                                    `name` VARCHAR(45) NOT NULL,
                                                    `image` VARCHAR(500) NOT NULL,
                                                    `link` VARCHAR(255) NOT NULL,
                                                    `description` VARCHAR(45) NOT NULL,
                                                    PRIMARY KEY (`id`));

-- add role in table user and foreign key table role
ALTER TABLE `black-turtle-api`.`user`
    ADD COLUMN `role_name` VARCHAR(45) NOT NULL AFTER `address`;


-- test insert data

INSERT INTO `black-turtle-api`.`category_sp` (`id`, `name`, `description`) VALUES ('1', 'name', 'description');
INSERT INTO `black-turtle-api`.`category_color` (`id`, `name`, `code_color`, `description`) VALUES ('1', 'name1', 'code_color_1', 'description');
INSERT INTO `black-turtle-api`.`category_link` (`id`, `name`, `image`, `link`, `description`) VALUES ('1', 'name1', 'image1', 'link1', 'description1');
INSERT INTO `black-turtle-api`.`user` (`id`, `username`, `phone_number`, `full_name`, `email`, `address`) VALUES ('1', 'ADMIN', '082263126', 'Full Name', 'email@vn.vn', 'Address');
