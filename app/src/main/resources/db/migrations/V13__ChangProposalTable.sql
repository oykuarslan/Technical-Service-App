CREATE TABLE proposal (
	id SERIAL PRIMARY KEY,
	note VARCHAR(100) NOT NULL,
	price INT NOT NULL,
	proposal_date DATE NOT NULL,
	state BOOLEAN NOT NULL
);