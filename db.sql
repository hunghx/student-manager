create  database qlsv;
use qlsv;
create table Student(
                        id int primary key auto_increment,
                        name varchar(100) not null ,
                        phone varchar(11) unique ,
                        address varchar(255),
                        sex bit
);