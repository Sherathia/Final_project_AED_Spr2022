Table Creation Scripts


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


create table FinalProj_Enterprise
(
Name varchar(200),
Country varchar(200),
Create_datetime varchar2(200));


create table FinalProj_Network
(
Name varchar(200),
Create_datetime date);

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
Attrib2 varchar(200));


create table FinalProj_Organization
(
OrgName varchar(200),
OrgType varchar(200),
Country varchar(200),
Enterrpise varchar(200),
Location varchar(200),
Create_datetime varchar(200));


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


create table FinalProj_FoodmarketItems
(
StoreName varchar(200),
WaterCans varchar(200),
FoodPacket varchar(200),
Lastupdated varchar(200)
);


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


create table FinalProj_ClothingItems
(
StoreName varchar(200),
MenApparel varchar(200),
WomenApparel varchar(200),
KidsApparel varchar(200),
Lastupdated varchar(200)
);

create table FinalProj_TransportRequests
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

create table FinalProj_Vehicles
(
StoreName varchar(200),
Ambulance varchar(200),
Truck varchar(200),
Travel varchar(200),
Lastupdated varchar(200)
);

create table FinalProj_HospitalRequests
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