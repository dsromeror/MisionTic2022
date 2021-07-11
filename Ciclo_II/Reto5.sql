DROP SCHEMA IF EXISTS redflix;
CREATE SCHEMA redflix;
USE redflix;
CREATE TABLE serie(
    serie_titulo varchar(45) PRIMARY KEY,
	serie_temporadas int,
	serie_episodios int
);
CREATE TABLE usuario(
	usr_alias varchar(20) primary key,
    usr_nombre varchar(45),
    usr_apellido varchar(45),
    usr_email varchar(45),
    usr_celular varchar(15),
    usr_contrasenia varchar(45),
    usr_fnacimiento date
);
CREATE TABLE pelicula(
	pelicula_titulo varchar(45) PRIMARY KEY,
	pelicula_resumen varchar(255),
	pelicula_anio int,
    pelicula_director varchar(45)
);