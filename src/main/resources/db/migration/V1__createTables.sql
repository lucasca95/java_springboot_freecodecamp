DROP TABLE IF EXISTS appusers_orders, appuser;
CREATE TABLE appuser(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(15) NOT NULL,
    last_name VARCHAR(15) NOT NULL,
    email VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR NOT NULL,
    type INT NOT NULL
);
INSERT INTO appuser(
    first_name,
    last_name,
    email,
    password,
    type
)VALUES
('Abuela','Norma','abuelanorma@test.com','123456789',0),
('Abuela','Julia','abuelajulia@test.com','123456789',0),
('Abuelo','Pedro','abuelopedro@test.com','123456789',0),
('Juan','Perez','juanperez@test.com','123456789',1),
('Lucas','Camino','lucascamino@test.com','123456789',1);
