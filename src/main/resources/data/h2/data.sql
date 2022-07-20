INSERT INTO COMPOSITORES(CODIGO, NOMBRE, APELLIDOS, NACIONALIDAD, FECHA_NACIMIENTO, FECHA_DEFUNCION) VALUES
(1,'Robert', 'Preston', 'EEUU', null, null),
(2,'William','Sorento', 'EEUU', '1951-10-23', null),
(3,'Philippe','Cocu', 'Francia', '1922-03-14', null),
(4,'Nacho','Cano Andrés','España', '1964-01-09', null),
(5,'Giorgio','Moroder', 'Italia', '1952-05-25', null);

INSERT INTO INTERPRETES(CODIGO, NOMBRE, APELLIDOS, NACIONALIDAD, FECHA_NACIMIENTO, FECHA_DEFUNCION) VALUES
(1,'Pablo','Donoso Carretero','Mexico', null, null),
(2,'Carla','Brunna','Italia', '1971-01-09', '1991-12-25'),
(3,'Walter','O','EEUU', '1980-01-20', null),
(4,'Wendy','Díaz','Puerto Rico', '1998-10-25', '2018-10-25'),
(5,'Walter','Peralta','Mexico', '1960-11-10', null);

INSERT INTO GENEROS(CODIGO, NAME, OBSERVACIONES) VALUES
(1,'FUNK',null),
(2,'ACOUSTIC','Propuesto por Abdoulaye'),
(3,'ROCK',null),
(4,'Metal','pendiente de ser aceptado...'),
(5,'SOUL',null),
(6,'Electrónica',null),
(7,'Flamenco',null),
(8,'Clásica',null);

INSERT INTO CANCIONES (ISMN,
					   TITULO,
					   FECHA_CREACION,
					   CODIGO_GENERO,
					   EXPLICITA,
					   INSTRUMENTAL,
					   PUNTUACION,
					   DURACION,
					   CODIGO_COMPOSITOR,
					   CODIGO_INTERPRETE,
					   OBSERVACIONES) VALUES
					   
('83244345T','Before I Forget','2019-01-01', 4, TRUE, FALSE, 7, 270, 1, 1, 'Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras nec enim quam. Nullam et sem id arcu fringilla vestibulum nec nec justo. Phasellus pulvinar id enim quis aliquam. Nunc ut posuere quam. In elementum dapibus eros at commodo. Morbi est est, mattis eget convallis cursus, commodo a purus. Phasellus consequat turpis in nibh egestas hendrerit. Etiam a facilisis nisi. Sed quis libero eget turpis molestie ornare. Phasellus tincidunt pharetra arcu sed elementum. Praesent arcu diam, vehicula sagittis tristique at, pulvinar sit amet dolor.'),
('35465553R','One Nation Under a Groove', '1978-10-05',1,TRUE, FALSE, 9, 180, 2, 3, 'Vestibulum eu luctus turpis. Curabitur feugiat lacus pulvinar convallis ornare. Vestibulum congue placerat augue, eget condimentum quam sollicitudin at. Aenean elit lorem, porttitor at blandit sed, elementum vel nulla. Nulla scelerisque mauris non neque rhoncus pretium. Vestibulum interdum commodo porta. Nunc quis facilisis mi, sed lobortis urna. Sed non efficitur magna. Donec lacus dui, rhoncus vitae interdum id, interdum non mi. Aliquam pretium lacinia erat vel rutrum. Maecenas pellentesque felis ut sagittis pulvinar. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae.'),
('20344543L','Sunny', '1965-10-05',5,FALSE, FALSE, 8, 185, 1, 1, 'Maecenas id odio eget nunc semper vehicula nec vel odio. Duis ut ante at libero euismod vehicula. Praesent nibh metus, pulvinar vitae vehicula et, rutrum sit amet nisi. Donec in nunc sed ex suscipit sodales in eu lacus. Sed arcu eros, fringilla vitae ipsum eu, aliquet gravida urna.'),
('38244435W','SuperExito 2019', '1820-02-22',8,FALSE, FALSE, 4, 119, 3, 4, 'Suspendisse ac sollicitudin nunc, eget blandit mauris. Maecenas in justo a ligula consequat sagittis at vel elit. Nunc varius metus erat, et molestie ipsum suscipit eu. Quisque aliquet laoreet dui, nec tristique odio fringilla quis. Nulla justo justo, suscipit ut ligula sed, scelerisque venenatis nisi. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. In eget orci nisi.'),
('35446332D','SuperExito 2020', '1820-02-22',8,FALSE, FALSE, 5, 456, 3, 3, null),
('19234345Q','SuperExito 2021', '1820-02-22',8,FALSE, FALSE, 5, 240, 2, 4, 'Nam vitae tincidunt ipsum, non luctus eros. Aenean non tristique odio. Fusce quis pulvinar nunc. Phasellus sagittis, lorem ac auctor finibus, felis augue fermentum libero, vitae faucibus lacus dolor id sem. Mauris eu nulla risus. Curabitur nulla felis, fringilla eget neque vitae, faucibus iaculis odio.'),
('89777934P','Moonlight Sonata', '1820-02-22',8,FALSE, TRUE, 8, 160, 1, 4, 'Praesent auctor consectetur risus. Sed sem orci, finibus at quam eu, ultrices volutpat massa. Donec porta hendrerit dolor, nec malesuada ipsum pretium pulvinar. Sed pulvinar, dolor vel vehicula volutpat, mauris libero facilisis nibh, ut dignissim massa ante eget orci.'),
('26734432Q','Himno del F.C. Barcelona', '1961-02-11',2,FALSE, FALSE, 10, 342, 3, 3, 'Integer posuere nulla quis ultricies ullamcorper. In odio risus, placerat sed imperdiet consequat, fringilla nec libero. Suspendisse elementum dignissim neque eu accumsan.');
