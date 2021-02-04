DROP TABLE SECUENCIAS IF EXISTS;
DROP TABLE ESTADOS IF EXISTS;
DROP TABLE USUARIOS IF EXISTS;


CREATE TABLE SECUENCIAS (

	NOMBRE_SECUENCIA	VARCHAR(20)		NOT NULL,
	VALOR_SECUENCIA		BIGINT			NOT NULL

);


CREATE TABLE USUARIOS (

	DNI					VARCHAR(10)							NOT NULL,
	NOMBRE				VARCHAR(50)							,
	APELLIDO1			VARCHAR(50)							,
	APELLIDO2			VARCHAR(50)							,
	SEXO				VARCHAR(1)							,
	FECHA_NACIMIENTO	DATE 								,
	ALTURA				INT									,
	OBSERVACIONES		VARCHAR(500)						,
	
	PRIMARY KEY (DNI)

);


CREATE TABLE REGISTROS (

	ID					INT				NOT NULL,
	DNI_USUARIO			VARCHAR(10)		NOT NULL,
	HORA_REGISTRO		TIMESTAMP		,
	LONGITUD			DOUBLE			,
	LATITUD				DOUBLE			,
	PESO				DOUBLE			,
	PRESION_MAXIMA		INT				,
	PRESION_MINIMA		INT				,
	PASOS				INT				,
	
	PRIMARY KEY (ID),
	FOREIGN KEY (DNI_USUARIO) REFERENCES USUARIOS (DNI)

);