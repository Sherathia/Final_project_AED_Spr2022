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


select * from FinalProj_Users;


create table FinalProj_Organization
(
OrgName varchar(200),
OrgType varchar(200));

select * from FinalProj_Users;

update FinalProj_Users
set Organization="Admin"
where name ="Admin";

insert into FinalProj_Organization values("ABC","Clothing","US","Warehouse","Boston","12-Dec-22");

drop table FinalProj_AdminRequests;
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
Requester varchar(200),
RequestedDate varchar(200),
ApprovalDate varchar(200),
status varchar(200),
Comments varchar(200),
Attrib1 varchar(200),
Attrib2 varchar(200));


create table FinalProj_FoodmarketRequests
(
RequestID varchar(200),
quantity varchar(200),
Description varchar(200),
Requester varchar(200),
RequestedDate varchar(200),
ApprovalDate varchar(200),
status varchar(200),
Comments varchar(200),
Attrib1 varchar(200),
Attrib2 varchar(200));

create table FinalProj_ClothingRequests
(
RequestID varchar(200),
quantity varchar(200),
Description varchar(200),
Requester varchar(200),
RequestedDate varchar(200),
ApprovalDate varchar(200),
status varchar(200),
Comments varchar(200),
Attrib1 varchar(200),
Attrib2 varchar(200));

insert into FinalProj_ClothingRequests
values("1","200","Men clothes required","NDRF","01-01-2022",null,null,null,null,null);


create table FinalProj_ClothingItems
(
StoreName varchar(200),
MenApparel varchar(200),
WomenApparel varchar(200),
KidsApparel varchar(200),
Lastupdated varchar(200)
);

insert into FinalProj_ClothingItems
values("GAP","500","370","760","16-08-2021");
insert into FinalProj_ClothingItems
values("LS","145","500","350","10-03-2022");

insert into FinalProj_FoodmarketRequests
values("4","200","Water required","Medical","16-08-2021",null,null,null,null,null);

insert into FinalProj_FoodmarketRequests
values("2","50","Food Packets required","Voluntary","16-08-2021",null,null,null,null,null);

insert into FinalProj_AdminRequests
values("2","Deep","US","Medical","Blood Bank",null,null,null,"Deep","15-08-2021",
null,"CREATED",null,null,null);


create table FinalProj_FoodmarketItems
(
StoreName varchar(200),
WaterCans varchar(200),
FoodPacket varchar(200),
Lastupdated varchar(200)
);

insert into FinalProj_FoodmarketItems values("Walmart","2400","5000",null);



