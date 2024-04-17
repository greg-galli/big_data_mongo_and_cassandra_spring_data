// Keyspace has to be created so that the table can be created by Spring Data Cassandra
CREATE KEYSPACE IF NOT EXISTS petanque WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};

-- TODO : Not needed anymore, as the table is created by Spring Data Cassandra
-- CREATE TABLE IF NOT EXISTS petanque.joueur (
--                                                uuid uuid PRIMARY KEY,
--                                                nbMatchsJouees int,
--                                                nbMatchsGagnees int,
--                                                scoreMoyen double,
--                                                nbBoulesLancees int,
--                                                nbCarreaux int
-- );
