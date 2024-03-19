CREATE TABLE IF NOT EXISTS STUDENTS (
ID int(6) NOT NULL PRIMARY KEY AUTO_INCREMENT,
NAME varchar(30) NOT NULL,
DOB varchar(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS SUBJECTS (
ID int(6) NOT NULL PRIMARY KEY AUTO_INCREMENT,
NAME varchar(30) NOT NULL,
TEACHER varchar(20) NOT NULL
);

INSERT INTO STUDENTS(name,dob) VALUES ('NEHA','27-08-1989');
INSERT INTO STUDENTS(name,dob) VALUES ('ABHI','13-07-1984');
INSERT INTO STUDENTS(name,dob) VALUES ('SHIKHA','07-05-1989');
INSERT INTO STUDENTS(name,dob) VALUES ('MALU','02-08-1989');