CREATE TABLE service (
	id SERIAL PRIMARY KEY,
	name VARCHAR NOT NULL,
	duration INT NOT NULL,
	desktop INT NOT NULL,
	mac INT NOT NULL,
	laptop INT NOT NULL
);

CREATE TABLE booking (
	id serial PRIMARY KEY, 
	note VARCHAR(300) NOT NULL,
	booking_date DATE NOT NULL
);

CREATE TABLE system_user(
	id SERIAL PRIMARY KEY,
	email VARCHAR(100) NOT NULL,
	name VARCHAR(100) NOT NULL,
	password VARCHAR(20) NOT NULL
);

CREATE TABLE role (
	id bigint NOT NULL PRIMARY KEY,
	name VARCHAR(100) NOT NULL
);

CREATE TABLE product (
	id bigint NOT NULL PRIMARY KEY,
	name VARCHAR(100) NOT NULL
);

CREATE TABLE proposal (
	id bigint NOT NULL PRIMARY KEY,
	note VARCHAR(100) NOT NULL,
	price INT NOT NULL,
	proposal_date DATE NOT NULL
);

CREATE TABLE sale (
	id bigint NOT NULL PRIMARY KEY, 
	note VARCHAR(100) NOT NULL,
	price INT NOT NULL,
	sale_status BOOLEAN NOT NULL
);

CREATE TABLE sale_Log( 
	id bigint NOT NULL PRIMARY KEY,
	credit_card VARCHAR(100) NOT NULL,
	sale_date DATE NOT NULL
);
