
drop test.department;
drop test.emplyee;

create table test.department
(
	ID int primary key auto_increment,
	city varchar(50),
	post_code varchar(50)
);

CREATE TABLE test.EMPLOYEE
(
    ID          INT PRIMARY KEY AUTO_INCREMENT,
    FIRSTNAME   VARCHAR(30),
    LASTNAME    VARCHAR(30),
    TELEPHONE   VARCHAR(15),
    EMAIL       VARCHAR(30),
    CREATED     TIMESTAMP DEFAULT NOW(),
    DEPARTMENT_ID INT NOT NULL,
    FOREIGN KEY (DEPARTMENT_ID) REFERENCES TEST.department(ID) on delete cascade
);



