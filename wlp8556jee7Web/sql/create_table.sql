drop table DB2ADMIN.HELLO_WLP_MSG;
create table DB2ADMIN.HELLO_WLP_MSG (
 MSG_ID int GENERATED ALWAYS AS IDENTITY
 (START WITH 1 INCREMENT BY 1 NO CACHE),
 MSG char(20),
 UPDATED TIMESTAMP
);

alter table DB2ADMIN.HELLO_WLP_MSG add primary key(MSG_ID);
insert into DB2ADMIN.HELLO_WLP_MSG values(default, 'My name is WLP_USER!', default);
insert into DB2ADMIN.HELLO_WLP_MSG values(default, 'How are you?', default);
