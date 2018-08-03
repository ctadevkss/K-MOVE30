create database webdb;

CREATE TABLE goodsinfo(
  gcode CHAR(5),
  title VARCHAR(50),
  writer VARCHAR(20),
  price int(8),
  PRIMARY KEY (gcode)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


show tables;

desc goodsinfo;

SELECT * FROM goodsinfo;

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10001', '뇌를 자극하는 Java프로그래밍', '김윤명', 27000);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10002', '좋은 사진을 만드는 노출', '정승익', 20000);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10003', '예제로 배우는 엑셀 2007',  '김대식', 19000);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10004', '지금 당장 경제공부 시작하라', '최진기', 18500);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10005', 'Introduction to Algorithm', '토머스 코멘', 42000);


