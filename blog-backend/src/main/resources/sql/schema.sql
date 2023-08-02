CREATE TABLE IF NOT EXISTS `article`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `title` VARCHAR(40) NOT NULL,
   `summary` VARCHAR(300) NOT NULL,
   `body` BLOB NOT NULL,
   `renderBody` BLOB NOT NULL,
   `createTime` TIMESTAMP,
   `updateTime` TIMESTAMP,
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;