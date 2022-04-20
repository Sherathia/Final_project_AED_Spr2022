select * from finalproj_enterprise;
select * from finalproj_network;

create table FinalProj_Enterprise
(
Name varchar(200),
Country varchar(200),
Create_datetime varchar(200));

create table FinalProj_Organization
(
OrgName varchar(200),
OrgType varchar(200),
Country varchar(200),
Enterrpise varchar(200),
Location varchar(200),
Create_datetime varchar(200));

select * from FinalProj_Organization;

create table FinalProj_Users
(Name varchar(200),
UserName varchar(200),
Contact varchar(200),
Location varchar(200),
Email varchar(200),
Password varchar(200),
Organization varchar(200),
Enterprise varchar(200),
Network varchar(200)
)

create table FinalProj_Organization
(
OrgName varchar(200),
OrgType varchar(200));

select * from FinalProj_Organization;

insert into FinalProj_Organization values("ABC","Clothing","US","Warehouse","Boston","12-Dec-22");

insert into finalproj_enterprise values ("