CREATE SCHEMA `blog` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE `blog`.`user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NULL DEFAULT NULL,
  `mobile` VARCHAR(15) NULL,
  `email` VARCHAR(50) NULL,
  `intro` TINYTEXT NULL DEFAULT NULL,
  `userImg` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `uq_mobile` (`mobile` ASC),
  UNIQUE INDEX `uq_email` (`email` ASC) );

CREATE TABLE `blog`.`post` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `authorId` BIGINT NOT NULL,
  `title` VARCHAR(75) NOT NULL,
  `summary` TINYTEXT NULL,
  `published` TINYINT(1) NOT NULL DEFAULT 0,
  `createdAt` DATETIME NOT NULL,
  `updatedAt` DATETIME NULL DEFAULT NULL,
  `publishedAt` DATETIME NULL DEFAULT NULL,
  `content` TEXT NULL DEFAULT NULL,
  `coverImg` VARCHAR(75) DEFAULT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `blog`.`post_comment` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `postId` BIGINT NOT NULL,
  `title` VARCHAR(100) NOT NULL,
  `published` TINYINT(1) NOT NULL DEFAULT 0,
  `createdAt` DATETIME NOT NULL,
  `publishedAt` DATETIME NULL DEFAULT NULL,
  `content` TEXT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_comment_post` (`postId` ASC),
  CONSTRAINT `fk_comment_post`
    FOREIGN KEY (`postId`)
    REFERENCES `blog`.`post` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `blog`.`category` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(75) NOT NULL,
  `metaTitle` VARCHAR(100) NULL DEFAULT NULL,
  `content` TEXT NULL DEFAULT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `blog`.`post_category` (
  `postId` BIGINT NOT NULL,
  `categoryId` BIGINT NOT NULL,
  PRIMARY KEY (`postId`, `categoryId`),
  INDEX `idx_pc_category` (`categoryId` ASC),
  INDEX `idx_pc_post` (`postId` ASC),
  CONSTRAINT `fk_pc_post`
    FOREIGN KEY (`postId`)
    REFERENCES `blog`.`post` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pc_category`
    FOREIGN KEY (`categoryId`)
    REFERENCES `blog`.`category` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `blog`.`tag` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(75) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `blog`.`post_tag` (
  `postId` BIGINT NOT NULL,
  `tagId` BIGINT NOT NULL,
  PRIMARY KEY (`postId`, `tagId`),
  INDEX `idx_pc_tag` (`tagId` ASC),
  INDEX `idx_pc_post` (`postId` ASC),
  CONSTRAINT `fk_pc_tag`
    FOREIGN KEY (`tagId`)
    REFERENCES `blog`.`tag` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);