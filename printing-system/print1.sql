create table staff(
ID varchar(10),
Name varchar(20),
Email varchar(30),
UserName varchar(20),
File_Name varchar(20));

drop table staff

insert into staff(ID,Name,Email,File_Name)values
(1001,'alex','ale23@gmail.com','Register'),
(1100,'zaina','zyn2@gmail.com','Assignment'),
(1002,'sandy','san45@gmail.com','Marks'),
(1009,'diana','diana@gmail.com','Workshop'),
(1020,'sruthi','sru@23gmail.com','GradeBook'),
(1111,'SYRA','sya209@gmail.com','LabSheet'),
(1000,'dolly','doll@gmail.com','Disaster'),
(1030,'subha','sub@gmail.com','Seminar'),
(1050,'sreekumari','sreef@gmail.com','LAB1'),
(2010,'sairam','sai@gmail.com','Sheet'),
(2000,'syanth','sya@gmail.com','stu_calender'),
(2111,'iana','ian@gmail.com','LAB12'),
(2191,'cyan','cay@gmail.com','Practice_Lab'),
(2001,'vinayak','vyan@gmail.com','labsheet_1'),
(2314,'prannav','pran@gmail.com','2020_batch'),
(3000,'prabhakaran','s12@gmail.com','worksheet');



create table clerk(
ID varchar(10),
Name varchar(20),
Email varchar(30),
File_Name varchar(20),
File_id varchar(10),
cost varchar(20) ,
Staff_eligibility varchar(20) default 'eligible',
req_type varchar(10) ,
Paper_type varchar(10));
	 
	 
	
	 
insert into clerk(ID,Name,Email,File_Name,File_id,Staff_eligibility,req_type,Paper_type,cost) values
(1001,'alex','ale23@gmail.com','Register','f23id','eligible','personal','A4','30'),
(1100,'zaina','zyn2@gmail.com','Assignment','f34id','not eligible','official','A3','20'),
(1002,'sandy','san45@gmail.com','Marks','f56id','eligible','personal','A4','10'),
(1009,'diana','diana@gmail.com','Workshop','f123id','eligible','official','A3','12'),
(1020,'sruthi','sru@23gmail.com','GradeBook','f50id','not eligible','personal','A4','34'),
(1111,'SYRA','sya209@gmail.com','LabSheet','f90id','eligible','personal','A3','12'),
(1000,'dolly','doll@gmail.com','Disaster','f78id','eligible','official','A4','45'),
(1030,'subha','sub@gmail.com','Seminar','f11id','not eligible','personal','A3','12'),
(1050,'sreekumari','sreef@gmail.com','LAB1','f10id','eligible','official','A4','23'),
(2010,'sairam','sai@gmail.com','Sheet','f45id','not eligible','personal','A3','20'),
(2000,'syanth','sya@gmail.com','stu_calender','f22id','not eligible','official','A4','10'),
(2111,'iana','ian@gmail.com','LAB12','f111id','not eligible','personal','A3','30'),
(2191,'cyan','cay@gmail.com','Practice_Lab','f001id','eligible','personal','A4','11'),
(2001,'vinayak','vyan@gmail.com','labsheet_1','f999id','eligible','personal','A3','31'),
(2314,'prannav','pran@gmail.com','2020_batch','f33id','eligible','official','A4','23'),
(3000,'prabhakaran','s12@gmail.com','worksheet','f222id','not eligible','personal','A4','11');



create table deliver(
ID varchar(10),
staff_Name varchar(10),
staff_email varchar(20),
File_Name varchar(30),
delivered varchar(20));

insert into deliver(ID,staff_Name,staff_email,File_Name,delivered) values
(1001,'alex','ale23@gmail.com','Register','Yes'),
(1002,'sandy','san45@gmail.com','Marks','No'),
(1111,'SYRA','sya209@gmail.com','LabSheet','No'),
(1000,'dolly','doll@gmail.com','Disaster','Yes'),
(1050,'sreekumari','sreef@gmail.com','LAB1','No'),
(2191,'cyan','cay@gmail.com','Practice_Lab','YES'),
(2001,'vinayak','vyan@gmail.com','labsheet_1','YES'),
(2314,'prannav','pran@gmail.com','2020_batch','No');


