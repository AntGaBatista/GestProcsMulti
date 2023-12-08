
CREATE DATABASE "processosDb"
    WITH 
    OWNER = "AGAQVHC"
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
	
	drop table tbProcessos;
	create table tbProcessos(
	idReg char(256) not null ,
		idProc char(256) not null primary key,
		relName char(256) not null,
		status char(1) not null 
	);
	

	insert into tbProcessos Values ('01','1222000BRA','Antonio Batista','A');