create database account;
use account;
create table account (
firstname varchar(30),
lastname varchar(30),
email varchar(50),
password varchar(30),
birthday varchar(30),
gender varchar(6),
phone double,
height int,
weight int,
activityrate varchar(10),
primary key (email)
);
insert into account values ('zahraa','haj hasan','zahraa@hotmail.com','zahraa130','12/1/2000','female',03558430,178,69);
select * from account;