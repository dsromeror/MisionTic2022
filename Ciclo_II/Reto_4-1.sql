DROP SCHEMA IF EXISTS redflix;
CREATE SCHEMA redflix;
USE redflix;
CREATE TABLE series (
    ser_titulo char(40) PRIMARY KEY,
	ser_temporadas int,
	ser_episodios int
);
CREATE TABLE director(
    dir_id  int primary key,
    dir_nombre  char(20),
    dir_apellido char(20),
    dir_nacionalidad  char(40)
);
CREATE TABLE usuarios(
	alias char(20) primary key,
    usu_nombre char(20),
    usu_apellido char(20),
    usu_mail char(30),
    usu_celular bigint,
    usu_contraseña char(30),
    usu_fnacimiento char(30)
);
CREATE TABLE peliculas (
	pel_titulo char(30) PRIMARY KEY,
	pel_resumen char(255),
	pel_año int,
    dir_id  int,
    FOREIGN KEY (dir_id) REFERENCES director(dir_id)
);
CREATE TABLE contenidos(
    titulo char(40) primary key NOT NULL,
    pel_titulo char(30),
    ser_titulo char(40),
    FOREIGN KEY (pel_titulo) REFERENCES peliculas(pel_titulo),
    FOREIGN KEY (ser_titulo) REFERENCES series(ser_titulo)
);
CREATE TABLE transmisiones(
	alias CHAR(20),
	titulo CHAR(40),
	trans_fecha timestamp,
	PRIMARY KEY (alias,titulo,trans_fecha),
	FOREIGN KEY (alias) REFERENCES usuarios (alias),
	FOREIGN KEY (titulo) REFERENCES contenidos (titulo)
);