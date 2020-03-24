DROP DATABASE IF EXISTS bornehave;
CREATE DATABASE bornehave;

USE bornehave;


CREATE TABLE employee(
	
	employee_id int NOT NULL AUTO_INCREMENT,
    emp_firstname varchar(50) NOT NULL,
    emp_lastname varchar(50) NOT NULL,
    emp_birthdate DATE NOT NULL,
    title varchar(50) NOT NULL,
    emp_startdate DATE NOT NULL,
    emp_enddate DATE NOT NULL,
    emp_telephone varchar(11) NOT NULL,
    postalcode varchar(4) NOT NULL,
    streetname varchar(40) NOT NULL,
    streetnumber int NOT NULL,
    PRIMARY KEY(employee_id)
	
);

CREATE TABLE kid(
	
	kid_id int NOT NULL AUTO_INCREMENT,
    kid_firstname varchar(50) NOT NULL,
    kid_lastname varchar(50) NOT NULL,
    kid_birthdate DATE NOT NULL,
    kid_startdate DATE NOT NULL,
    parenttelephone varchar(11) NOT NULL,
    parent_firstname varchar(50) NOT NULL,
    parent_lastname varchar(50) NOT NULL,
    postalcode varchar(4) NOT NULL,
    streetname varchar(40) NOT NULL,
    streetnumber int NOT NULL,
    PRIMARY KEY(kid_id)
	
);




INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber) VALUES ('Marianne', 'Hansen', '1977-3-22', 'Fuldtid', '1995-3-22', '2020-3-22', '+4551524911', '2665', 'Vemmetoftevej', 11);
INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber) VALUES ('Sigurd', 'Mortensen', '1972-3-22', 'Deltid', '1997-2-23', '2020-3-22', '+4574954723', '4000', 'Ugandavej', 27);
INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber) VALUES ('Mathilde', 'Larsen', '1971-3-31', 'Fuldtid', '1993-3-22', '2020-3-22', '+4547392732', '2440', 'Finansvej', 11);
INSERT INTO employee (emp_firstname, emp_lastname, emp_birthdate, title, emp_startdate, emp_enddate, emp_telephone, postalcode, streetname, streetnumber) VALUES ('Sandra', 'Madsen', '1969-3-22', 'Leder', '1993-3-22', '2020-3-22', '+4546837494', '2665', 'Vemmetoftevej', 12);

INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Rasmus', 'Sørensen', '2016-3-22', '2019-5-22', '+4546837494', 'Bettina', 'Sørensen', '2450', 'Ingolfsvej', 12);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Bodil', 'Larsen', '2016-5-22', '2019-6-22', '+4598347698', 'Sara', 'Larsen', '4000', 'Milanovej', 2);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Mathias', 'Petersen', '2015-10-23', '2019-5-28', '+4584938574', 'Claus', 'Petersen', '2665', 'Harbovej', 24);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Niels', 'Madsen', '2015-2-6', '2019-5-20', '+4598348576', 'Lars', 'Madsen', '2420', 'Sydlandsvej', 85);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Mette', 'Jørgensen', '2016-6-4', '2019-5-22', '+4584958424', 'Martin', 'Jørgensen', '2660', 'Metrovej', 27);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Sylvester', 'Nielsen', '2016-8-22', '2019-4-22', '+4585697385', 'Erik', 'Nielsen', '2525', 'Midsommervej', 54);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Silke', 'Nielsen', '2016-3-22', '2019-5-22', '+4547954738', 'Erik', 'Nielsen', '2525', 'Midsommervej', 54);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Emil', 'Petersen', '2016-7-22', '2019-2-22', '+4584753853', 'Frederikke', 'Petersen', '2450', 'Sylvestervej', 12);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Mathilde', 'Hansen', '2016-1-22', '2019-9-22', '+4584578635', 'Jolly', 'Hansen', '2640', 'Nordvej', 59);
INSERT INTO kid (kid_firstname, kid_lastname, kid_birthdate, kid_startdate, parenttelephone, parent_firstname, parent_lastname, postalcode, streetname, streetnumber) VALUES ('Mikkel', 'Gregersen', '2016-8-22', '2019-2-22', '+4548586734', 'Simone', 'Gregersen', '2660', 'Mindevej', 12);


SELECT CONCAT('kidnames.add("', kid_firstname, ' ', kid_lastname, '") ')
FROM kid ORDER BY kid_id
INTO OUTFILE 'D:\\Data\\kidnamesdata.txt'
LINES TERMINATED BY '\r\n';

SELECT CONCAT('parentnames.add("', parent_firstname, ' ', parent_lastname, '") ')
FROM kid ORDER BY kid_id
INTO OUTFILE 'D:\\Data\\parentnamesdata.csv'
LINES TERMINATED BY '\r\n';

