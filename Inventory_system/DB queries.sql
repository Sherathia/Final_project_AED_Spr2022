select * from login_cred

create table login (username varchar(200) ,password varchar(200));

insert into login values("Deep","Deep123");

select * from login;


Create table FinalProj_Users 
(
Name varchar(200),
Username varchar(200),
Password varchar(200),
EmailID varchar(200),
Country varchar(200),
Enterprise varchar(200),
Organization varchar(200),
Contact varchar(200));

select * from FinalProj_Users;

insert into FinalProj_Users values("Admin","Admin12","Admin12", "admin@gmail.com","US","Item1" , "Admin",7676);

update FinalProj_Users
set Organization ="Admin"
where username = "aesha16";
commit;

truncate table FinalProj_Users;

create table FinalProj_Enterprise
(
Name varchar(200),
Country varchar(200),
Create_datetime date);


create table FinalProj_Network
(
Name varchar(200),
Create_datetime date);

