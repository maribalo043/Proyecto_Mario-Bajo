INSERT INTO categorias (nombre) VALUES ('Mini');
INSERT INTO categorias (nombre) VALUES ('Guajes');
INSERT INTO categorias (nombre) VALUES ('Promesas');
INSERT INTO categorias (nombre) VALUES ('Estrellas');
INSERT INTO categorias (nombre) VALUES ('Ok Masters');

INSERT INTO partidos (resultado,pista,categoria_id) VALUES ('6-1','hola que tal',1);
INSERT INTO partidos (resultado,pista,categoria_id) VALUES ('6-2','hola que tal',1);
INSERT INTO partidos (resultado,pista,categoria_id) VALUES ('6-3','hola que tal',2);
INSERT INTO partidos (resultado,pista,categoria_id) VALUES ('6-4','hola que tal',2);

INSERT INTO equipos (nombre,email_Contacto,numero_Telefono_Contacto,categoria_id) VALUES ('Jaimitos','skaskhca',698585856,5);
INSERT INTO equipos (nombre,email_Contacto,numero_Telefono_Contacto,categoria_id) VALUES ('Pepitos','vksvdvljs',696969699,5);

INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1234567A','Mario',1234,'XL',false,1);
INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1234567B','Mario',1234,'XL',false,1);
INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1234567C','Mario',1234,'XL',true,1);
INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1234567D','Mario',1234,'XL',false,1);

INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1234587D','Mario',1234,'XL',false,2);
INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1234564D','Mario',1234,'XL',false,2);
INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1634567D','Mario',1234,'XL',true,2);
INSERT INTO jugadores (dni, nombre, numero_Seguro,talla_Camiseta,portero,equipo_id) VALUES ('1234527D','Mario',1234,'XL',false,2);
