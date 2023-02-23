CREATE USER IF NOT EXISTS olsodbuser@localhost IDENTIFIED BY 'olsopass';

GRANT SELECT, INSERT, UPDATE, DELETE ON olsok23.* TO olsodbuser@localhost;