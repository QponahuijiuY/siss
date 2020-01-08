
CREATE DATABASE /*!32312 IF NOT EXISTS*/sims /*!40100 DEFAULT CHARACTER SET utf8 */;

USE sims;

/*Table structure for table grade */

DROP TABLE IF EXISTS grade;

CREATE TABLE grade (
  id varchar(11) NOT NULL UNIQUE default '000',
  name varchar(20) NOT NULL,
  credit double NOT NULL,
  num int NOT NULL,
  teacher varchar(20) NOT NULL,
  status varchar(6) not null,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


/*Table structure for table student */

DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id char(10) NOT NULL,
  name varchar(20) NOT NULL,
  grade varchar(4) NOT NULL,
  department varchar(20) NOT NULL,
  cla varchar(8) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table test*/

DROP TABLE IF EXISTS test;

CREATE TABLE test (
  id char(10) NOT NULL unique,
  teacher varchar(20) NOT NULL,
  course varchar(20) not null,
  className varchar(20) not null,
  testTime varchar(30) not null,
  place varchar(50) not null,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table message */

DROP TABLE IF EXISTS message;

CREATE TABLE message (
  name varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  id char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  message varchar(200) NOT NULL,
  status char(4) NOT NULL,
  messageTime datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table guestbook*/

DROP TABLE IF EXISTS guestbook;

CREATE TABLE guestbook (
  name varchar(20) not null,
  tel varchar(15) not null,
  text varchar(200) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table user */

DROP TABLE IF EXISTS user;

CREATE TABLE user (
  username varchar(16) NOT NULL,
  password varchar(20) NOT NULL,
  PRIMARY KEY (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table user */

insert  into user(username,password) values ('admin','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
