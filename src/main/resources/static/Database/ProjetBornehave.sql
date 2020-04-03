DROP DATABASE IF EXISTS bornehave;
CREATE DATABASE bornehave;

USE bornehave;

CREATE TABLE employee(
	
	employee_id int NOT NULL AUTO_INCREMENT,
    emp_firstname varchar(50) NOT NULL,
    emp_lastname varchar(50) NOT NULL,
    emp_birthdate varchar(15),
    title varchar(50) NOT NULL,
    emp_startdate varchar(15),
    emp_enddate varchar(15),
    salary int NOT NULL,
    note varchar(100),
    emp_telephone varchar(11) NOT NULL,
    postalcode varchar(4) NOT NULL,
    city varchar(25) NOT NULL,
    streetname varchar(40) NOT NULL,
    streetnumber int NOT NULL,
	e_email varchar(100) NOT NULL,
    PRIMARY KEY(employee_id)
	
);

CREATE TABLE kid(
	
	kid_id int NOT NULL AUTO_INCREMENT,
    kid_firstname varchar(50) NOT NULL,
    kid_lastname varchar(50) NOT NULL,
    kid_birthdate varchar(15),
    kid_startdate varchar(11) DEFAULT NULL,
    kid_enddate varchar(11) DEFAULT NULL,
    kid_note varchar(50),
    PRIMARY KEY(kid_id)
    
	
);


CREATE TABLE guardian(

	guardian_id int NOT NULL AUTO_INCREMENT,
	guardian_firstname varchar(50) NOT NULL,
	guardian_lastname varchar(50) NOT NULL,
	parenttelephone varchar(11) NOT NULL,
	postalcode varchar(4) NOT NULL,
	streetname varchar(40) NOT NULL,
	streetnumber varchar(10) NOT NULL,
    city varchar(25) NOT NULL,
    g_mail varchar(100) NOT NULL,
    note varchar(100),
    mykid_id int,
	PRIMARY KEY(guardian_id),
    FOREIGN KEY (mykid_id) REFERENCES kid(kid_id)

);

CREATE TABLE contact(

	contact_id int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(contact_id)
);



INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber, city, salary, note, e_email) VALUES ('Marianne', 'Hansen', '1977-3-22', 'Fuldtid', '1995-3-22', '2020-3-22', '+4551524911', '4000', 'Roskildevej', 11, 'Roskilde', 160, '', 'MarianneH@roskildebornehave.dk');
INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber, city, salary, note, e_email) VALUES ('Sigurd', 'Mortensen', '1972-3-22', 'Deltid', '1997-2-23', '2020-3-22', '+4574954723', '4000', 'Ugandavej', 27, 'Roskilde',160, 'In charge of playground', 'SigurdM@roskildebornehave.dk');
INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber, city, salary, note, e_email) VALUES ('Mathilde', 'Larsen', '1971-3-31', 'Fuldtid', '1993-3-22', '2020-3-22', '+4547392732', '2450', 'Finansvej', 11, 'København S', 210, '', 'MathildeL@roskildebornehave.dk');
INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber, city, salary, note, e_email) VALUES ('Sandra', 'Madsen', '1969-3-22', 'Leder', '1993-3-22', '2020-3-22', '+4546837494', '4000', 'Mindevej', 12, 'Roskilde', 300, 'In charge of schedules', 'SandraM@roskildebornehave.dk');

INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Rasmus', 'Sørensen',  '2016-3-22', '', '', '');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Bodil', 'Larsen', '2016-5-22', '2019-6-22', '2021-6-21', 'Bodil ate sand');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Mathias', 'Petersen', '2015-10-23', '2019-5-28', '2021-5-21', '');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Niels', 'Madsen', '2015-2-6', '2019-5-20', '2021-5-21', 'Niels is allergic to tomato');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Mette', 'Jørgensen', '2016-6-4', '2019-5-22', '2021-5-21', '');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Sylvester', 'Nielsen','2016-8-22', '', '', '');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Silke', 'Nielsen', '2016-3-22', '2019-5-22', '2021-5-21', '');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Emil', 'Petersen', '2016-7-22', '', '', '');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Mathilde', 'Hansen', '2016-1-22', '2019-9-22', '2021-9-5', '');
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, kid_enddate, kid_note) VALUES ('Mikkel', 'Gregersen', '2016-8-22', '2019-2-22', '2021-2-17', '');

INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4546837494', 'Bettina', 'Sørensen', 'BettinaS@roskildebornehave.dk', '2450', 'Ingolfsvej', '12', 'København S', 'Picks up afer 16:00');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4598347698', 'Sara', 'Larsen', 'SaraL@roskildebornehave.dk', '4000', 'Milanovej', '2', 'Roskilde', '');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4584938574', 'Claus', 'Petersen', 'ClausP@roskildebornehave.dk', '2665', 'Harbovej', '24', 'Vallensbæk Strand', '');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4598348576', 'Lars', 'Madsen', 'LarsM@roskildebornehave.dk', '4000', 'Sydlandsvej', '85', 'Roskilde', 'Remember their kid is allergic to tomatos');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4584958424', 'Martin', 'Jørgensen', 'MartinJ@roskildebornehave.dk', '4000', 'Metrovej', '27', 'Roskilde', 'Picks up early');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4585697385', 'Erik', 'Nielsen', 'ErikN@roskildebornehave.dk', '2750', 'Midsommervej', '54', 'Ballerup', '');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4584753853', 'Frederikke', 'Petersen', 'FrederikkeP@roskildebornehave.dk', '2450', 'Sylvestervej', '12', 'København S', '');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4584578635', 'Jolly', 'Hansen', 'JollyH@roskildebornehave.dk', '2750', 'Nordvej', '59', 'Ballerup', '');
INSERT INTO guardian(parenttelephone, guardian_firstname, guardian_lastname, g_mail, postalcode, streetname, streetnumber, city, note) VALUES ('+4548586734', 'Simone', 'Gregersen', 'SimoneG@roskildebornehave.dk', '4000', 'Mindevej', '12', 'Roskilde', 'Not avaliable on the phone between 13:00-14:00');

-- TEST --
/*
SELECT CONCAT('C ', kid_firstname, ' ', kid_lastname, ' | ', 'G: ', guardian_firstname, ' ', guardian_lastname, ' | ', ' [CID', kid_id, ' GID', guardian_id, ']', ' | ', ' Status: ', IF(kid_startdate is null, 'On waitlist','Active'))
FROM kid INNER JOIN guardian ON guardian_id = kid_id
INTO OUTFILE 'D:\\Data\\kidnamesdata.txt'
LINES TERMINATED BY '\r\n';
*/

-- CHILDLIST -- 
/*
SELECT CONCAT('C', kid_id, ' | G', guardian_id, ' | ', kid_firstname, ' | ', kid_lastname, ' | ', kid_gender, ' | ', kid_startdate, ' | ', kid_enddate, ' | ', kid_birthdate, ' | ', kid_note, ' | ', ' Status: ', IF(kid_startdate = '', 'On waitlist','Active'))
FROM kid INNER JOIN guardian ON guardian_id = kid_id
INTO OUTFILE 'D:\\Data\\kiddata.txt'
LINES TERMINATED BY '\r\n';
*/

	
-- GUARDIAN CONTACT -- 
/*
SELECT CONCAT('G', guardian_id, ' | ', parenttelephone, ' | ', g_mail, ' | ', streetname, ' | ', streetnumber, ' | ', postalcode, ' | ', city)
FROM guardian
INTO OUTFILE 'D:\\Data\\guardiancontact.txt'
LINES TERMINATED BY '\r\n';
*/

-- EMPLOYEE CONTACT --
/*
SELECT CONCAT('E', employee_id, ' | ', emp_telephone, ' | ', e_email, ' | ', streetname, ' | ', streetnumber, ' | ', postalcode, ' | ', city)
FROM employee
INTO OUTFILE 'D:\\Data\\employeecontact.txt'
LINES TERMINATED BY '\r\n';
*/

-- EMPLOYEE LIST --
/*
SELECT CONCAT('E', employee_id, ' | ', emp_firstname, ' | ', emp_lastname, ' | ', gender, ' | ', emp_startdate, ' | ', emp_enddate, ' | ', emp_birthdate, ' | ', note, ' | ', title, ' | ', salary, 'kr/hour')
FROM employee
INTO OUTFILE 'D:\\Data\\employeelist.txt'
LINES TERMINATED BY '\r\n';
*/

-- GUARDIAN LIST -- 
/*
SELECT CONCAT('G', guardian_id, ' | ', 'C', kid_id, ' | ', guardian_firstname, ' | ', guardian_lastname, ' | ', gender, ' | ', note)
FROM guardian INNER JOIN kid ON kid_id = guardian_id
INTO OUTFILE 'D:\\Data\\guardianlist.txt'
LINES TERMINATED BY '\r\n';
*/


