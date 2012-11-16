-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 25-04-2012 a las 18:00:40
-- Versión del servidor: 5.1.61
-- Versión de PHP: 5.4.0-3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `icloud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contactos`
--

CREATE TABLE IF NOT EXISTS `contactos` (
  `idContacto` int(4) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idContacto`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=44 ;

--
-- Volcado de datos para la tabla `contactos`
--

INSERT INTO `contactos` (`idContacto`, `nombres`, `apellidos`, `telefono`, `mail`) VALUES
(26, 'Karen', 'Pulido', '3162783424', 'kar34@hotmail.com'),
(42, 'viviana alejandra', 'pinilla', '32156898', 'vivipi@gmail.com'),
(24, 'daniel', 'ramirez', '1234514', 'uytut@hotmail.com'),
(23, 'alejandra', 'morales', '342342', 'gerss@hotmail.com'),
(22, 'andres', 'chacon', '31267723', 'andescacha@hotmail.com'),
(21, 'tatiana', 'mora', '31567894', 'tatis@hotmail.com'),
(20, 'jhon', 'sosa', '3204567012', 'juank@hotmail.com'),
(19, 'Juan', 'Carlos', '3204567012', 'juank@hotmail.com'),
(12, 'Pedro', 'Ariza Medina', '3123987', 'elfen@hotmail.com'),
(8, 'Hanson Steven', 'Ariza Medina', '312398765', 'Elfen000@hotmail.com'),
(2, 'Fredy Enrique', 'Ramirez Moreno', '31245678', 'fredy.ramirez@Ingsis.com'),
(1, 'Diego Alejandro', 'Ariza Medina', '3115308810', 'diego.ariza@ieee.org'),
(27, 'patricio', 'leopoldo', '3129086412', 'atrick@hoymail.com'),
(28, 'Fabian', 'romero', '3124523461', 'fab@hotmail.com'),
(32, 'santiago', 'camargo', '312353453', 'santi@gmail.com'),
(30, 'sindy', 'chaparro', '312423231', 'sind@hotmail.com'),
(31, 'Henry', 'Ramos', '312456783', 'henryRamo@hotmail.com'),
(34, 'Sandra', 'Briceno', '312876876', 'briSandra@yahoo.com'),
(35, 'Yohan	', 'Junco', '31567893837', 'junca@etb.net.co '),
(37, 'Melisa', 'Maldonado', '34567546', 'melMal@compensar.com'),
(38, 'Jhon	', 'Castro', '31879076565', 'CastroJ@gmail.com'),
(41, 'Wilson ', 'Briceno', '311544863', 'Wil@youporn.com'),
(40, 'Camilo', 'Carrasco', '325984412', 'Carrasco@greSer.net'),
(43, 'edgar', 'junco', '3658904523', 'edg@hotmail.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
