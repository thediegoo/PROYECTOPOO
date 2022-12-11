-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 05, 2022 at 10:32 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurant`
--

-- --------------------------------------------------------

--
-- Table structure for table `carta`
--

CREATE TABLE `carta` (
  `id_carta` varchar(5) NOT NULL,
  `id_tipo` varchar(5) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `carta`
--

INSERT INTO `carta` (`id_carta`, `id_tipo`, `descripcion`, `precio`) VALUES
('CA001', 'T0001', 'Combo Familiar de Anticuchos', 55),
('CA002', 'T0002', 'Gaseosa Coca Cola 1L', 10),
('CA003', 'T0001', 'Combo Personal de Anticuchos', 30),
('CA004', 'T0002', 'Gaseosa Inka Cola 1L', 10),
('CA005', 'T0002', 'Vino Rojo 1L', 20),
('CA006', 'T0001', 'Combo Familiar Lomo Fino', 100),
('CA007', 'T0003', 'Porción de Tequeños', 10);

-- --------------------------------------------------------

--
-- Table structure for table `cartatipo`
--

CREATE TABLE `cartatipo` (
  `id_tipo` varchar(5) NOT NULL,
  `descripcion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cartatipo`
--

INSERT INTO `cartatipo` (`id_tipo`, `descripcion`) VALUES
('T0001', 'Combos'),
('T0002', 'Bebidas'),
('T0003', 'Guarniciones');

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` varchar(5) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `celular` int(11) NOT NULL,
  `direccion` varchar(20) NOT NULL,
  `referencia` varchar(100) NOT NULL,
  `id_distancia` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nombre`, `apellido`, `celular`, `direccion`, `referencia`, `id_distancia`) VALUES
('C0001', 'Nicole', 'Guevara', 999765654, 'Jr. Alma Mz. D Lt.12', 'Al lado del grifo El Sol', 'D0001'),
('C0002', 'Claudio', 'Fernandez', 939765654, 'Jr. Sol Mz. T Lt.1', 'Al costado de la discoteca Trueno', 'D0002'),
('C0003', 'Daniel', 'Picon', 999767654, 'Jr. Vina Ocucaje 231', 'Dos cuadras del parque de la amistad', 'D0001'),
('C0004', 'Fabiola', 'Huaman', 999875434, 'Av. Los Angeles 231', 'A dos casas de Mifarma', 'D0002'),
('C0005', 'Gustavo', 'Torres', 964723121, 'Calle Las Torres 231', 'Al frente de la tienda \"Mass\"', 'D0001'),
('C0006', 'Taylor', 'Swift', 999827341, 'Jr. Lluvia 123', 'A dos cuadras de Inkafarma', 'D0002'),
('C0007', 'Claudia', 'Gomez', 999876565, 'Jr. Los Olivos 534', 'En la misma cuadra que \"Tambo\"', 'D0002');

-- --------------------------------------------------------

--
-- Table structure for table `delivery`
--

CREATE TABLE `delivery` (
  `id_delivery` varchar(5) NOT NULL,
  `id_cliente` varchar(5) NOT NULL,
  `id_encargado` varchar(5) NOT NULL,
  `usuario` varchar(10) NOT NULL,
  `fecha_hora` datetime NOT NULL,
  `id_detalle` int(11) NOT NULL,
  `subTotal` double NOT NULL,
  `precio_envio` double NOT NULL,
  `total` double NOT NULL,
  `metodo_pago` varchar(20) NOT NULL,
  `id_estado` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `detalledelivery`
--

CREATE TABLE `detalledelivery` (
  `id_detalle` int(11) NOT NULL,
  `id_carta` varchar(5) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `distancia`
--

CREATE TABLE `distancia` (
  `id_distancia` varchar(5) NOT NULL,
  `descripcion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `distancia`
--

INSERT INTO `distancia` (`id_distancia`, `descripcion`) VALUES
('D0001', 'Cerca'),
('D0002', 'Lejos');

-- --------------------------------------------------------

--
-- Table structure for table `encargadodelivery`
--

CREATE TABLE `encargadodelivery` (
  `id_encargado` varchar(5) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `celular` int(11) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `id_estado` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `estado`
--

CREATE TABLE `estado` (
  `id_estado` varchar(5) NOT NULL,
  `descripcion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `estado`
--

INSERT INTO `estado` (`id_estado`, `descripcion`) VALUES
('E0001', 'DISPONIBLE'),
('E0002', 'OCUPADO');

-- --------------------------------------------------------

--
-- Table structure for table `estadodelivery`
--

CREATE TABLE `estadodelivery` (
  `id_estado` varchar(5) NOT NULL,
  `descripcion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `estadodelivery`
--

INSERT INTO `estadodelivery` (`id_estado`, `descripcion`) VALUES
('E0001', 'PENDIENTE'),
('E0002', 'ENTREGADO');

-- --------------------------------------------------------

--
-- Table structure for table `estadoreserva`
--

CREATE TABLE `estadoreserva` (
  `id_estado` varchar(5) NOT NULL,
  `descripcion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `estadoreserva`
--

INSERT INTO `estadoreserva` (`id_estado`, `descripcion`) VALUES
('E0001', 'RESERVADA'),
('E0002', 'ATENDIDA'),
('E0003', 'CANCELADA');

-- --------------------------------------------------------

--
-- Table structure for table `mesa`
--

CREATE TABLE `mesa` (
  `id_mesa` varchar(5) NOT NULL,
  `nro_mesa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mesa`
--

INSERT INTO `mesa` (`id_mesa`, `nro_mesa`) VALUES
('M0001', 1),
('M0002', 2),
('M0003', 3),
('M0004', 4),
('M0005', 5),
('M0006', 6);

-- --------------------------------------------------------

--
-- Table structure for table `mesahoras`
--

CREATE TABLE `mesahoras` (
  `id_horas` varchar(50) NOT NULL,
  `hora` time NOT NULL,
  `id_mesa` varchar(5) NOT NULL,
  `id_estado` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mesahoras`
--

INSERT INTO `mesahoras` (`id_horas`, `hora`, `id_mesa`, `id_estado`) VALUES
('H0001', '02:00:00', 'M0001', 'E0001'),
('H0002', '03:30:00', 'M0001', 'E0001'),
('H0003', '05:00:00', 'M0001', 'E0002'),
('H0004', '06:30:00', 'M0001', 'E0001'),
('H0005', '08:00:00', 'M0001', 'E0001'),
('H0006', '02:00:00', 'M0002', 'E0001'),
('H0007', '03:30:00', 'M0002', 'E0001'),
('H0008', '05:00:00', 'M0002', 'E0001'),
('H0009', '06:30:00', 'M0002', 'E0001'),
('H0010', '08:00:00', 'M0002', 'E0001'),
('H0011', '02:00:00', 'M0003', 'E0002'),
('H0012', '03:30:00', 'M0003', 'E0001'),
('H0013', '05:00:00', 'M0003', 'E0001'),
('H0014', '06:30:00', 'M0003', 'E0001'),
('H0015', '08:00:00', 'M0003', 'E0001'),
('H0016', '02:00:00', 'M0004', 'E0001'),
('H0017', '03:30:00', 'M0004', 'E0001'),
('H0018', '05:00:00', 'M0004', 'E0001'),
('H0019', '06:30:00', 'M0004', 'E0001'),
('H0020', '08:00:00', 'M0004', 'E0001'),
('H0021', '02:00:00', 'M0005', 'E0001'),
('H0022', '03:30:00', 'M0005', 'E0001'),
('H0023', '05:00:00', 'M0005', 'E0001'),
('H0024', '06:30:00', 'M0005', 'E0001'),
('H0025', '08:00:00', 'M0005', 'E0001'),
('H0026', '02:00:00', 'M0006', 'E0001'),
('H0027', '03:30:00', 'M0006', 'E0001'),
('H0028', '05:00:00', 'M0006', 'E0001'),
('H0029', '06:30:00', 'M0006', 'E0001'),
('H0030', '08:00:00', 'M0006', 'E0001');

-- --------------------------------------------------------

--
-- Table structure for table `reservamesa`
--

CREATE TABLE `reservamesa` (
  `id_reserva` varchar(5) NOT NULL,
  `id_cliente` varchar(5) NOT NULL,
  `usuario` varchar(10) NOT NULL,
  `fecha` date NOT NULL,
  `id_horas` varchar(5) NOT NULL,
  `id_mesa` varchar(5) NOT NULL,
  `cant_personas` int(11) NOT NULL,
  `adelanto` double NOT NULL,
  `id_estado` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservamesa`
--

INSERT INTO `reservamesa` (`id_reserva`, `id_cliente`, `usuario`, `fecha`, `id_horas`, `id_mesa`, `cant_personas`, `adelanto`, `id_estado`) VALUES
('R0001', 'C0001', 'gutierrez', '2022-11-05', 'H0003', 'M0001', 2, 20, 'E0001'),
('R0002', 'C0002', 'castro', '2022-11-05', 'H0011', 'M0003', 2, 20, 'E0001');

-- --------------------------------------------------------

--
-- Table structure for table `usuarioadmi`
--

CREATE TABLE `usuarioadmi` (
  `usuario` varchar(10) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuarioadmi`
--

INSERT INTO `usuarioadmi` (`usuario`, `password`) VALUES
('castro', '123456'),
('gutierrez', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carta`
--
ALTER TABLE `carta`
  ADD PRIMARY KEY (`id_carta`),
  ADD KEY `id_tipo` (`id_tipo`);

--
-- Indexes for table `cartatipo`
--
ALTER TABLE `cartatipo`
  ADD PRIMARY KEY (`id_tipo`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `id_distancia` (`id_distancia`);

--
-- Indexes for table `delivery`
--
ALTER TABLE `delivery`
  ADD PRIMARY KEY (`id_delivery`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `usuario` (`usuario`),
  ADD KEY `id_detalle` (`id_detalle`),
  ADD KEY `id_encargado` (`id_encargado`),
  ADD KEY `id_estado` (`id_estado`);

--
-- Indexes for table `detalledelivery`
--
ALTER TABLE `detalledelivery`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `id_carta` (`id_carta`) USING BTREE;

--
-- Indexes for table `distancia`
--
ALTER TABLE `distancia`
  ADD PRIMARY KEY (`id_distancia`);

--
-- Indexes for table `encargadodelivery`
--
ALTER TABLE `encargadodelivery`
  ADD PRIMARY KEY (`id_encargado`),
  ADD KEY `id_estado` (`id_estado`);

--
-- Indexes for table `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`id_estado`);

--
-- Indexes for table `estadodelivery`
--
ALTER TABLE `estadodelivery`
  ADD PRIMARY KEY (`id_estado`);

--
-- Indexes for table `estadoreserva`
--
ALTER TABLE `estadoreserva`
  ADD PRIMARY KEY (`id_estado`);

--
-- Indexes for table `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`id_mesa`);

--
-- Indexes for table `mesahoras`
--
ALTER TABLE `mesahoras`
  ADD PRIMARY KEY (`id_horas`),
  ADD KEY `id_mesa` (`id_mesa`),
  ADD KEY `id_estado` (`id_estado`);

--
-- Indexes for table `reservamesa`
--
ALTER TABLE `reservamesa`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_mesa` (`id_mesa`),
  ADD KEY `usuario` (`usuario`),
  ADD KEY `id_estado` (`id_estado`),
  ADD KEY `id_horas` (`id_horas`);

--
-- Indexes for table `usuarioadmi`
--
ALTER TABLE `usuarioadmi`
  ADD PRIMARY KEY (`usuario`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `carta`
--
ALTER TABLE `carta`
  ADD CONSTRAINT `carta_ibfk_1` FOREIGN KEY (`id_tipo`) REFERENCES `cartatipo` (`id_tipo`);

--
-- Constraints for table `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_distancia`) REFERENCES `distancia` (`id_distancia`);

--
-- Constraints for table `delivery`
--
ALTER TABLE `delivery`
  ADD CONSTRAINT `delivery_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `delivery_ibfk_2` FOREIGN KEY (`usuario`) REFERENCES `usuarioadmi` (`usuario`),
  ADD CONSTRAINT `delivery_ibfk_3` FOREIGN KEY (`id_detalle`) REFERENCES `detalledelivery` (`id_detalle`),
  ADD CONSTRAINT `id_encargado` FOREIGN KEY (`id_encargado`) REFERENCES `encargadodelivery` (`id_encargado`),
  ADD CONSTRAINT `id_estado` FOREIGN KEY (`id_estado`) REFERENCES `estadodelivery` (`id_estado`);

--
-- Constraints for table `detalledelivery`
--
ALTER TABLE `detalledelivery`
  ADD CONSTRAINT `detalledelivery_ibfk_1` FOREIGN KEY (`id_carta`) REFERENCES `carta` (`id_carta`);

--
-- Constraints for table `encargadodelivery`
--
ALTER TABLE `encargadodelivery`
  ADD CONSTRAINT `encargadodelivery_ibfk_1` FOREIGN KEY (`id_estado`) REFERENCES `estado` (`id_estado`);

--
-- Constraints for table `mesahoras`
--
ALTER TABLE `mesahoras`
  ADD CONSTRAINT `mesahoras_ibfk_1` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`),
  ADD CONSTRAINT `mesahoras_ibfk_2` FOREIGN KEY (`id_estado`) REFERENCES `estado` (`id_estado`);

--
-- Constraints for table `reservamesa`
--
ALTER TABLE `reservamesa`
  ADD CONSTRAINT `id_horas` FOREIGN KEY (`id_horas`) REFERENCES `mesahoras` (`id_horas`),
  ADD CONSTRAINT `reservamesa_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `reservamesa_ibfk_2` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`),
  ADD CONSTRAINT `reservamesa_ibfk_3` FOREIGN KEY (`usuario`) REFERENCES `usuarioadmi` (`usuario`),
  ADD CONSTRAINT `reservamesa_ibfk_4` FOREIGN KEY (`id_estado`) REFERENCES `estadoreserva` (`id_estado`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
