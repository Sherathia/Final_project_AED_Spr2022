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

select distinct Enterrpise from FinalProj_Organization where Country ="US";

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
);

delete from FinalProj_Users where username <>"Admin";



create table FinalProj_Organization
(
OrgName varchar(200),
OrgType varchar(200));

select * from FinalProj_Users;

update FinalProj_Users
set Organization="Admin"
where name ="Admin";

insert into FinalProj_Organization values("ABC","Clothing","US","Warehouse","Boston","12-Dec-22");


create table FinalProj_AdminRequests
(
RequestID varchar(200),
Name varchar(200),
Network varchar(200),
Enterprise varchar(200),
Organization varchar(200),
quantity varchar(200),
Description varchar(200),
Location varchar(200),
RequestedDate varchar(200),
ApprovalDate varchar(200),
status varchar(200),
Comments varchar(200),
Attrib1 varchar(200),
Attrib2 varchar(200))








