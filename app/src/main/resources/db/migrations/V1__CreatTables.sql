/*

CREATE TABLE service (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL, 
	primary key (id)
);

CREATE TABLE serviceDevice (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	duration varchar(100) NOT NULL, 
	primary key (id)
);

create table booking (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	note varchar(300) NOT NULL,
	bookingDate DATE NOT NULL,
	primary key (id)
)

create table systemUser(
	id bigint(20) NOT NULL AUTO_INCREMENT,
	email varchar(100) NOT NULL,
	name varchar(100) NOT NULL,
	password varchar(20) NOT NULL,
	primary key (id)
)

CREATE TABLE role (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL, 
	primary key(id)
)

create table product (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,	 
	primary key (id)
)

create table proposal (
	id bigint(20) not null AUTO_INCREMENT,
	note varchar(100) not null,
	price int(10) not null,
	proposalDate DATE not null,
	primary key (id)
)

CREATE TABLE sale (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	note varchar(100) not null,
	price int(10) not null,
	saleStatus boolean not null,
	primary key (id)
)

CREATE TABLE saleLog 
	id bigint(20) not null AUTO_INCREMENT,
	creditCard varchar(100) not null,
	saleDate DATE not null,
	PRIMARY KEY (id)
*/