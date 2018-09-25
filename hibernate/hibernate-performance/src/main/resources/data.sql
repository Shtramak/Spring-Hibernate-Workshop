truncate table ACCOUNT;
truncate table CLIENT;

insert into CLIENT (ID_CLIENT, AGE, NAME) values (1, 21, 'John Doe');
insert into CLIENT (ID_CLIENT, AGE, NAME) values (2, 27, 'Jane Doe');

insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (1000, 'USD',1);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (2000, 'USD',1);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (1200, 'USD',1);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (11000, 'USD',1);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (10200, 'USD',1);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (10100, 'USD',1);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (10300, 'USD',1);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (1000, 'USD',2);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (1000, 'USD',2);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (1000, 'USD',2);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (1000, 'USD',2);
insert into ACCOUNT (AMOUNT, CURRENCY, CLIENT_ID) values (1000, 'USD',2);