INSERT INTO COMPOSITORES(CODIGO, NOMBRE, NACIONALIDAD, FECHA_NACIMIENTO) VALUES
(1,'Robert Preston', 'EEUU', null),
(2,'William Sorento', 'EEUU', '1951-10-23'),
(3,'Philippe Cocu', 'Francia', '1922-03-14'),
(4,'Nacho Cano','España', '1964-01-09'),
(5,'Giorgio Moroder', 'Italia', '1952-05-25');

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
