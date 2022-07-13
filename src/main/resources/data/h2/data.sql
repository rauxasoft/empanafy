INSERT INTO COMPOSITORES(CODIGO, NOMBRE, NACIONALIDAD) VALUES
(1,'Robert Preston', 'EEUU'),
(2,'William Sorento', 'EEUU'),
(3,'Philippe Cocu', 'Francia'),
(4,'Nacho Cano','España'),
(5,'Giorgio Moroder', 'Italia');

INSERT INTO INTERPRETES(CODIGO, NOMBRE, NACIONALIDAD) VALUES
(1,'Pablo Donoso','Mexico'),
(2,'Carla Brunna','Italia'),
(3,'Walter O','EEUU'),
(4,'Wendy Díaz','Puerto Rico'),
(5,'Walter Peralta','Mexico');

INSERT INTO GENEROS(CODIGO, NAME, OBSERVACIONES) VALUES
(1,'FUNK',null),
(2,'ACOUSTIC','Propuesto por Abdoulaye'),
(3,'ROCK',null),
(4,'Metal','pendiente de ser aceptado...'),
(5,'SOUL',null),
(6,'Electrónica',null),
(7,'Flamenco',null),
(8,'Clásica',null);

INSERT INTO CANCIONES (ISMN,TITULO,FECHA_CREACION, CODIGO_GENERO, EXPLICITA, DURACION, CODIGO_COMPOSITOR, CODIGO_INTERPRETE) VALUES
('83244345T','Before I Forget','2019-01-01', 4, TRUE, 3700, 1, 1),
('35465553R','One Nation Under a Groove', '1978-10-05',1,TRUE, 3900, 2, 3),
('20344543L','Sunny', '1965-10-05',5,FALSE, 4660, 1, 1),
('38244435W','SuperExito 2019', '1820-02-22',8,FALSE, 3445, 3, 4),
('35446332D','SuperExito 2020', '1820-02-22',8,FALSE, 3655, 3, 3),
('19234345Q','SuperExito 2021', '1820-02-22',8,FALSE, 55677, 2, 4),
('89777934P','Moonlight Sonata', '1820-02-22',8,FALSE, 7833, 1, 4),
('26734432Q','Himno del F.C. Barcelona', '1961-02-11',2,FALSE, 5933, 3, 3);

-- *********************************************************************************************
--
-- DATOS DE EJEMPLO DE OTRAS TABLAS QUE SE QUITARAN EN UN FUTURO
--
-- *********************************************************************************************

INSERT INTO EQUIPOS (CODIGO, NOMBRE, CIUDAD, N_CHAMPIONS) VALUES 
(100,'R.C.D. Espanyol','Cornellá',0),
(101,'F.C. Barcelona','Barcelona',5);

INSERT INTO JUGADORES (DNI, NOMBRE, DORSAL, MOTE, DEMARCACION, CODIGO_EQUIPO) VALUES
('45665123R','Guzmán Bravo',3,'El Bruto','CENTRAL',100),
('25443123K','Walter Gimeno',9,null,'DELANTERO',100),
('12993234L','Honorio Martín',2,'La bala','LATERAL',101),
('47622372T','Alexander Díaz',10,'El zurdo','LATERAL',101),
('29838223F','Fernando Mordientes',1,null,'PORTERO',101),
('28933762E','José Ramón Alestanco',2,'Tarzán','DEFENSA',101);

INSERT INTO INCIDENCIAS(CODIGO, FECHA, OBSERVACIONES) VALUES
(1000,'2020-10-22','Se colgó el Eclipse.'),
(1001,'2020-10-23','Se colgó el ordenador.'),
(1002,'2020-10-24','Fallo en el ascensor.');

INSERT INTO PRODUCTOS (CODIGO, NOMBRE, FAMILIA, PRECIO, DESCATALOGADO) VALUES
(100,'Impresora Laser HP 2p','HARDWARE',350.5,FALSE),
(101,'Ordenador desktop LACER D-20','HARDWARE',350.0,TRUE),
(102,'Avant Antivirus v.2','SOFTWARE',40.0,FALSE),
(103,'Funda Portátil 220 * 10 (negra)','CONSUMIBLE',80.0,FALSE),
(104,'Funda Portátil 220 * 10 (roja)','CONSUMIBLE',107.0,FALSE),
(105,'Funda Portátil 220 * 10 (verde)','CONSUMIBLE',102.0,FALSE),
(106,'Funda Portátil 220 * 10 (azul)','CONSUMIBLE',105.0,FALSE),
(107,'Avant Antivirus v.7','SOFTWARE',70.0,FALSE),
(108,'Fundation Software EDITION','SOFTWARE',102.0,FALSE),
(109,'Estuche ratón (madera)','CONSUMIBLE',470.0,FALSE);
