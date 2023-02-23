DROP DATABASE if EXISTS olsok23;
CREATE DATABASE olsok23;
USE olsok23;

CREATE TABLE Worker (
id INT,
firstname VARCHAR(40),
lastname VARCHAR(40),
PRIMARY KEY(id)
);

INSERT INTO Worker VALUES (1, "Viivi", "Virta");
INSERT INTO Worker VALUES (2, "Ahmed", "Bakir");
INSERT INTO Worker VALUES (3, "Ville", "Mäki");
INSERT INTO Worker VALUES (4, "Mary", "Smith");