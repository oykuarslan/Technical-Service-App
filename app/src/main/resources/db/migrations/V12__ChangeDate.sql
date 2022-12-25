CREATE TABLE sale_log (
	id SERIAL PRIMARY KEY,
	sale_date timestamp NOT NULL,
	credit_card VARCHAR(20)
);