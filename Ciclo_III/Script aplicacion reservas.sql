-- SCHEMA: reservas

-- DROP SCHEMA reservas ;

CREATE SCHEMA reservas
    AUTHORIZATION postgres;

COMMENT ON SCHEMA reservas
    IS 'Esquema para el almacenamiento de las tablas de la apelación.';
	
-- Table: reservas.empleados

-- DROP TABLE reservas.empleados;

CREATE TABLE reservas.empleados
(
    id_empleado integer NOT NULL,
    nombre text COLLATE pg_catalog."default",
    apellido text COLLATE pg_catalog."default",
    alias text COLLATE pg_catalog."default",
    "contraseña" text COLLATE pg_catalog."default",
    CONSTRAINT empleados_pkey PRIMARY KEY (id_empleado)
)

TABLESPACE pg_default;

ALTER TABLE reservas.empleados
    OWNER to postgres;

COMMENT ON TABLE reservas.empleados
    IS 'Tabla que contendrá los empleados de la aplicación.';
	
-- Table: reservas.habitaciones

-- DROP TABLE reservas.habitaciones;

CREATE TABLE reservas.habitaciones
(
    numero integer NOT NULL,
    tipo integer,
    CONSTRAINT habitaciones_pkey PRIMARY KEY (numero),
    CONSTRAINT tipo FOREIGN KEY (tipo)
        REFERENCES reservas.tipo_habitaciones (id_tipo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE reservas.habitaciones
    OWNER to postgres;

COMMENT ON TABLE reservas.habitaciones
    IS 'Tabla que contiene las habitaciones registradas en la aplicación.';

-- Table: reservas.reservas

-- DROP TABLE reservas.reservas;

CREATE TABLE reservas.reservas
(
    id_reserva integer NOT NULL,
    id_quien_realiza integer,
    nombre_cliente text COLLATE pg_catalog."default",
    apellido_cliente text COLLATE pg_catalog."default",
    cedula_cliente integer,
    contacto_cliente text COLLATE pg_catalog."default",
    estado_reserva text COLLATE pg_catalog."default",
    cantidad_personas integer,
    CONSTRAINT reservas_pkey PRIMARY KEY (id_reserva),
    CONSTRAINT id_quien_realiza FOREIGN KEY (id_quien_realiza)
        REFERENCES reservas.empleados (id_empleado) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE reservas.reservas
    OWNER to postgres;

COMMENT ON TABLE reservas.reservas
    IS 'Tabla que contiene las reservas realizadas en el aplicativo.';
	
-- Table: reservas.reservashabitaciones

-- DROP TABLE reservas.reservashabitaciones;

CREATE TABLE reservas.reservashabitaciones
(
    id_reserva integer,
    id_habitacion integer,
    fecha_inicio date,
    fecha_fin date,
    CONSTRAINT id_habitacion FOREIGN KEY (id_habitacion)
        REFERENCES reservas.habitaciones (numero) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id_reserva FOREIGN KEY (id_reserva)
        REFERENCES reservas.reservas (id_reserva) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE reservas.reservashabitaciones
    OWNER to postgres;
	
-- Table: reservas.tipo_habitaciones

-- DROP TABLE reservas.tipo_habitaciones;

CREATE TABLE reservas.tipo_habitaciones
(
    capacidad integer,
    id_tipo integer NOT NULL,
    nombre text COLLATE pg_catalog."default",
    precio integer,
    extras text COLLATE pg_catalog."default",
    CONSTRAINT tipo_habitaciones_pkey PRIMARY KEY (id_tipo)
)

TABLESPACE pg_default;

ALTER TABLE reservas.tipo_habitaciones
    OWNER to postgres;

COMMENT ON TABLE reservas.tipo_habitaciones
    IS 'Tabla que contiene el tipo de las habitaciones';