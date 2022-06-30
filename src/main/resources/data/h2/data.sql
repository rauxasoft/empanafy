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

INSERT INTO GENEROS(CODIGO, NAME, OBSERVACIONES) VALUES
(1,'FUNK',null),
(2,'ACOUSTIC','Propuesto por Abdoulaye'),
(3,'ROCK',null),
(4,'Metal','pendiente de ser aceptado...'),
(5,'SOUL',null),
(6,'Electrónica',null),
(7,'Flamenco',null),
(8,'Clásica',null);

INSERT INTO CANCIONES (ISMN,TITULO,FECHA_CREACION, CODIGO_GENERO, EXPLICITA, DURACION) VALUES
('83244345T','Before I Forget','2019-01-01', 4, TRUE, 3700),
('35465553R','One Nation Under a Groove', '1978-10-05',1,TRUE, 3900),
('20344543L','Sunny', '1965-10-05',5,FALSE, 4660),
('38244435W','SuperExito 2019', '1820-02-22',8,FALSE, 3445),
('35446332D','SuperExito 2020', '1820-02-22',8,FALSE, 3655),
('19234345Q','SuperExito 2021', '1820-02-22',8,FALSE, 55677),
('89777934P','Moonlight Sonata', '1820-02-22',8,FALSE, 7833),
('26734432Q','Himno del F.C. Barcelona', '1961-02-11',2,FALSE, 5933);
