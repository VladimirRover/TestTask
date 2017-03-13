
DROP DATABASE IF EXISTS test;
CREATE DATABASE test;
USE test;
DROP TABLE IF EXISTS `test`.`users`;

CREATE TABLE users(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `isAdmin` BIT(7) DEFAULT NULL,
  `createDate` DATE NOT NULL DEFAULT CURRENT_DATE
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO users (id, name, age, isAdmin, createDate) VALUES(1, 'Goga', 26, TRUE , '2017-03-13 13:55:37.0');
INSERT INTO users (id, name, age, isAdmin, createDate) VALUES(2, 'Givi', 27, FALSE , '2017-03-13 13:56:37.0');
INSERT INTO users (id, name, age, isAdmin, createDate) VALUES(3, 'Ashot', 32, FALSE , '2017-03-13 13:57:37.0');
INSERT INTO users (id, name, age, isAdmin, createDate) VALUES(4, 'Frunzik', 25, FALSE , '2017-03-13 13:58:37.0');
