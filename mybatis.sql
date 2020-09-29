create database mybatis;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `pwd` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `teacher` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `student` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `tid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fktid` (`tid`),
  CONSTRAINT `fktid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into teacher(id,name) values(1,'秦老师');
insert into student(id,name,tid) values(1,'小明',1);
insert into student(id,name,tid) values(2,'小红',1);
insert into student(id,name,tid) values(3,'小张',1);
insert into student(id,name,tid) values(4,'小李',1);
insert into student(id,name,tid) values(5,'小王',1);

CREATE TABLE BLOG(
    ID VARCHAR(50) NOT NULL COMMENT '博客ID',
    TITLE VARCHAR(100) NOT NULL COMMENT '博客标题',
    AUTHOR VARCHAR(30) NOT NULL COMMENT '博客作者',
    CREATE_TIME DATETIME NOT NULL COMMENT '创建时间',
    VIEWS INT(30) NOT NULL COMMENT '浏览量'
)ENGINE=INNODB DEFAULT CHARSET=UTF8