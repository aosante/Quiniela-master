USE Quiniela;

CREATE TABLE USUARIO(
  nombre VARCHAR(100),
  apellido VARCHAR(100),
  correo VARCHAR(100),
  nombreUsuario VARCHAR(100) NOT NULL PRIMARY KEY,
  nombreEquipo VARCHAR(100),
  clave VARCHAR(100),
  puntaje INT,
  avatar IMAGE
)

CREATE TABLE MUNDIAL(
  paisSede VARCHAR(100),
  anio INT PRIMARY KEY,
  estado VARCHAR(100) DEFAULT 'inactivo'
)

CREATE TABLE GRUPO (
  codigo INT IDENTITY (1, 1) PRIMARY KEY,
  nombre VARCHAR(100),
  anioMundial INT,
  equipo1 VARCHAR(100),
  equipo2 VARCHAR(100),
  equipo3 VARCHAR(100),
  equipo4 VARCHAR(100),
)

CREATE TABLE EQUIPO (
  nombrePais VARCHAR(100),
  codigoISO VARCHAR(100) PRIMARY KEY,
  ranking INT
)

  select * from EQUIPO

  CREATE TABLE PARTIDO (
    idPartido INT NOT NULL PRIMARY KEY,
    fechaPartido DATE,
    equipoLocal INT,
    equipoVisita INT,
    golesLocal INT,
    golesVisita INT,
    codGrupo INT
  )

  CREATE TABLE PREDICCION (
    idPrediccion INT NOT NULL PRIMARY KEY,
    codPartido INT,
    golesLocal INT,
    golesVisitA INT,
    nombreUsuario VARCHAR(100)
  )






--esto es lo que hay que hacer cuando se hace el insert o registro de los grupos
--se reciobe como parametro el nombre del grupo para poner en el segundo where
update  GRUPO
set anioMundial = (select anio from MUNDIAL where estado = 'activo')
WHERE nombre = 'Grupo A';


--este select seria para listar segun el mundial activo actual
select * from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo');


select * from MUNDIAL;

select * from GRUPO;
select * from USUARIO;
select * from EQUIPO;



select nombrePais, codigoISO from EQUIPO
where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')
OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')
OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')
OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')

--equipos asociados al mundial activo
select nombrePais, codigoISO from EQUIPO
where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo'))
OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo'))
OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo'))
OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anio from MUNDIAL where estado = 'activo'))
















