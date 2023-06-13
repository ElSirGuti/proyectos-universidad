-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 13-06-2023 a las 20:53:15
-- Versión del servidor: 8.0.29
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `felixdocvzla`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `apellido`, `email`, `password`) VALUES
(1, 'Andres', 'Gutierrez', 'elgutigamer@gmail.com', '$2y$12$/WoR9cNk8i9Wtg2pXWPPhOauVsJzipaTwRX2/R86/6XXE1y7iVwtK'),
(2, 'Andres', 'Gutierrez', 'andresgutierreztovar@gmail.com', '$2y$12$S8VtIslicG8xEnAJItj5lee/uPskJBPPm6wgyh8PMyfWZmIppxaGS'),
(3, 'Juan', 'Perez', 'juan@gmail.com', '$2y$12$h9ppScIsDhwOeEQXqcNUeOr5TsRK/A5/I.Cm45JJ8vLdDoaiqhjiG'),
(4, 'Pedro', 'Perez', 'pedro@gmail.com', '$2y$12$QNrRv2au8X4w519FrcYwnu7Z/CitszMbFPBnGjXCeEUCH1KZPjaeW'),
(5, 'Nikol', 'Ibarra', 'nikol@gmail.com', '$2y$12$SR1H2bpkniu2o2jNaICHhuPiJEJVhbtCs5NttjaXlIpr2iSAQIhVC'),
(6, 'Luis', 'Amias', 'luis@gmail.com', '$2y$12$J4I5t.VHZqLLQpptXjxtauFhH9fo5bMZRHUdSTb9WEysbgUJDLf4K'),
(7, 'Luis', 'Amias', 'luis@gmail.co', '$2y$12$MGGb/il0yPzL4.VMuItN/.qpKgyPOrwkD.W1wB/7m0Cjx0xjNPtO6'),
(8, 'Andrea', 'Gutierrez', 'avgt2014@gmail.com', '$2y$12$Rvh4gPsn8QbqLWDC0HOFZu5UgPYHv1TIuBdI5lqGlV4/fqr1njr8C'),
(9, 'El', 'Culo', 'elgutigamer@gmail.com3', '$2y$12$0QLf9Z3gbfQ8S1b9K98e9eFCx9Jf.eQbtIG6HwdBCmjvkQij8VKJe');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
