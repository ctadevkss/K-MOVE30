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
VALUES ('10001', '���� �ڱ��ϴ� Java���α׷���', '������', 27000);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10002', '���� ������ ����� ����', '������', 20000);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10003', '������ ���� ���� 2007',  '����', 19000);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10004', '���� ���� �������� �����϶�', '������', 18500);

INSERT INTO goodsinfo(gcode, title, writer, price)
VALUES ('10005', 'Introduction to Algorithm', '��ӽ� �ڸ�', 42000);


