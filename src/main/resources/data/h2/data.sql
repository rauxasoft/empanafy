INSERT INTO GENEROS(CODIGO, NOMBRE, OBSERVACIONES) VALUES
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
('2673443sQ','Himno del F.C. Barcelona', '1961-02-11',2,FALSE, 5933);

INSERT INTO POKEMONES (NOMBRE) VALUES
('Snake'),
('Picatcho');

INSERT INTO PATITOS (NOMBRE_PATITO, COLOR) VALUES
('Freddy','Rosa'),
('Krugger','Negro'),
('Rufus','Azul');

INSERT INTO EQUIPOS (NOMBRE) VALUES
('F.C. Barcelona'),
('Real Madrid'),
('Real Club Deportivo Español'),
('Atlético de Madrid'),
('Real Sociedad'),
('Centro Deportivo Olmedo');

INSERT INTO ALUMNOS (NOMBRE, ORDENADOR) VALUES
('alumno 1','MAC'),
('alumno 2','PC'),
('alumno 3','PC'),
('alumno 4','PC'),
('alumno 5','PC'),
('alumno 6','MAC'),
('alumno 7','IBM'),
('alumno 8','MAC'),
('alumno 9','PC'),
('alumno 10','PC'),
('alumno 11','PC'),
('alumno 12','MAC');