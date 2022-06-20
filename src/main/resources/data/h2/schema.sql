CREATE TABLE GENEROS(

	CODIGO			INTEGER       	NOT NULL,
	NOMBRE			VARCHAR(50)		NOT NULL,
	OBSERVACIONES	VARCHAR(100)	,
	
	PRIMARY KEY (CODIGO)

);

CREATE TABLE CANCIONES(

	ISMN			VARCHAR(20)		NOT NULL,
	TITULO			VARCHAR(250)	,
	FECHA_CREACION	DATE			,
	CODIGO_GENERO	INTEGER			,	
	EXPLICITA		BOOLEAN			,
	DURACION		INTEGER			,
	
	PRIMARY KEY (ISMN),
	FOREIGN KEY (CODIGO_GENERO) REFERENCES GENEROS (CODIGO)

);


CREATE TABLE POKEMONES(
	NOMBRE        VARCHAR(100)
);


CREATE TABLE PATITOS(
	NOMBRE_PATITO VARCHAR(100),
	COLOR         VARCHAR(100)
);


CREATE TABLE EQUIPOS(
	NOMBRE VARCHAR(100)
);

CREATE TABLE ALUMNOS(
	NOMBRE		VARCHAR(150),
	ORDENADOR	VARCHAR(100)
);
