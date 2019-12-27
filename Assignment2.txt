Create a table called Employee with the following Columns  and following Constrains :-

------------------------------------------------------------------------------------------------------------



//Assignment 1:

/EmployeeID should not be duplicate
/EmployeeName should not be null
/EmployeeAddress  :- should not be Newyork, London and Paris
/Salary : should be between 20000 and 30000
/CompanyAddress should be default as ASV Suntech Park

CREATE TABLE EMPLOYEE(
EmployeeID INTEGER PRIMARY KEY,
EmployeeName VARCHAR2(20) NOT NULL,
EmployeeAddress VARCHAR2(20) CONSTRAINT CITYDUP CHECK(EMPLOYEEADDRESS NOT IN ('NEWYORK','LONDON','PARIS')),
Salary INTEGER CONSTRAINT SALERR CHECK(SALARY BETWEEN 20000 AND 30000),
COMPANYADDRESS VARCHAR2(20) DEFAULT 'ASV SUNTECH PARK'
)


------insert two records


INSERT INTO EMPLOYEE VALUES(101,'GERALT','RIVIA',26500, DEFAULT);
INSERT INTO EMPLOYEE VALUES(102,'PRAKASH','CHENNAI',20500, DEFAULT);
SELECT * FROM EMPLOYEE


//Salary Table

EmployeeID  :- should not be duplicate
Employee PF  :- should not be negative
Employee HRA :- should not be negative

CREATE TABLE SALARY(
EMPLOYEEID INTEGER PRIMARY KEY,
EMPLOYEEPF INTEGER CONSTRAINT PFNEG CHECK(EMPLOYEEPF>0),
EMPLOYEEHRA INTEGER CONSTRAINT HRNEG CHECK(EMPLOYEEHRA>0)
)



The Salary Table must match EmployeeID.





Assignment 2:


Create a table with two columns and enforce the integrity.
*Think what will be the required integrity to be enforced on CID , CitizenDOB and CitizenDOD
Table :- Citizen
Columns
	CID
	CitizenDOB
	CitizenDOD ( Date of Death )

create TABLE CITIZEN(
CID INTEGER PRIMARY KEY,
DOB DATE NOT NULL,
DOD DATE NOT NULL,
CONSTRAINT INVALIDDOD CHECK(DOB<DOD)
)

