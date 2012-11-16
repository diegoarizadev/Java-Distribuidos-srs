-- phpMyAdmin SQL Dump
-- version 3.4.11deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 19-10-2012 a las 18:57:29
-- Versión del servidor: 5.5.24
-- Versión de PHP: 5.4.4-2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `clase`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE IF NOT EXISTS `asignatura` (
  `asi_codigo` varchar(6) NOT NULL,
  `asi_nombre` varchar(60) NOT NULL,
  PRIMARY KEY (`asi_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`asi_codigo`, `asi_nombre`) VALUES
('201501', 'Matemáticas'),
('201502', 'Algebra'),
('301501', 'Programación básica'),
('301502', 'Programación orientada a objetos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE IF NOT EXISTS `estudiante` (
  `est_codigo` varchar(11) NOT NULL,
  `est_nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`est_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`est_codigo`, `est_nombre`) VALUES
('80800846', 'Diego Alejandro Ariza'),
('80800847', 'Jessica Cristancho'),
('80800848', 'Sergio Caballero'),
('80800849', 'Alexandra Delgado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nota`
--

CREATE TABLE IF NOT EXISTS `nota` (
  `est_codigo` varchar(11) NOT NULL,
  `asi_codigo` varchar(6) NOT NULL,
  `nota` double NOT NULL,
  PRIMARY KEY (`est_codigo`,`asi_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `nota`
--

INSERT INTO `nota` (`est_codigo`, `asi_codigo`, `nota`) VALUES
('80800846', '201501', 4),
('80800846', '201502', 5),
('80800846', '301501', 4.9),
('80800846', '301502', 2.2),
('80800847', '201501', 2.8),
('80800847', '201502', 4.3),
('80800847', '301501', 5),
('80800847', '301502', 4.5),
('80800848', '201501', 1.5),
('80800848', '201502', 2.3),
('80800848', '301501', 4.3),
('80800848', '301502', 1.9),
('80800849', '201501', 4.3),
('80800849', '201502', 3.3),
('80800849', '301501', 4),
('80800849', '301502', 4.3);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
