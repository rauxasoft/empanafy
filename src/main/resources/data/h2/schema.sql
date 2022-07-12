CREATE TABLE COMPOSITORES(

	CODIGO					INTEGER			NOT NULL,
	NOMBRE					VARCHAR(50)		NOT NULL,
	NACIONALIDAD			VARCHAR(100)	,
	
	PRIMARY KEY (CODIGO)
);

CREATE TABLE GENEROS(

	CODIGO					INTEGER       	NOT NULL,
	NAME					VARCHAR(50)		NOT NULL,
	OBSERVACIONES			VARCHAR(100)	,
	
	PRIMARY KEY (CODIGO)
);

CREATE TABLE CANCIONES(

	ISMN					VARCHAR(20)		NOT NULL,
	TITULO					VARCHAR(250)	,
	FECHA_CREACION			DATE			,
	CODIGO_GENERO			INTEGER			,	
	EXPLICITA				BOOLEAN			,
	DURACION				INTEGER			,
	
	PRIMARY KEY (ISMN),
	FOREIGN KEY (CODIGO_GENERO) REFERENCES GENEROS (CODIGO)
);


-- *********************************************************************************************
--
-- TABLAS DE DEMO QUE SE QUITARÁN EN UN FUTURO
--
-- *********************************************************************************************

CREATE TABLE EQUIPOS(

	CODIGO					BIGINT			NOT NULL,
	NOMBRE					VARCHAR(150)	,
	CIUDAD					VARCHAR(150)	,
	N_CHAMPIONS				INTEGER			NOT NULL,
	
	PRIMARY KEY (CODIGO)	
);

CREATE TABLE JUGADORES(

	DNI						VARCHAR(9)			NOT NULL,
	NOMBRE					VARCHAR(150)	,
	DORSAL					INTEGER			,
	MOTE					VARCHAR(150)	,
	DEMARCACION				VARCHAR(150)	,
	CODIGO_EQUIPO			BIGINT			,
	
	PRIMARY KEY (DNI),
	FOREIGN KEY (CODIGO_EQUIPO) REFERENCES EQUIPOS (CODIGO)
);

CREATE TABLE PRODUCTOS(

	CODIGO				 	INTEGER			NOT NULL,
	NOMBRE					VARCHAR(150)	,
	FAMILIA					VARCHAR(30)		,
	PRECIO					DOUBLE			,
	DESCATALOGADO			BOOLEAN			,
	
	PRIMARY KEY(CODIGO)
);

CREATE TABLE VEHICULOS(

	MATRICULA				VARCHAR(20)		NOT NULL,
	MARCA					VARCHAR(100)	,
	MODELO					VARCHAR(100)	,
	NUMERO_PUERTAS			INTEGER			,
	FECHA_MATRICULACION		DATE			,
	SEGURO_VIGENTE			BOOLEAN			,
	
	PRIMARY KEY (MATRICULA)	
);


-- **************************************************************

CREATE TABLE INCIDENCIAS(

	CODIGO					INTEGER			NOT NULL,
	FECHA					DATE			,
	OBSERVACIONES			VARCHAR(200)    ,
	
	PRIMARY KEY (CODIGO)
);
