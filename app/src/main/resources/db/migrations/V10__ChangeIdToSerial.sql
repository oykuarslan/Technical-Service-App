CREATE TABLE sale (
	id serial PRIMARY KEY, 
	note VARCHAR(100) NOT NULL,
	price INT NOT NULL,
	sale_status BOOLEAN NOT NULL
);
