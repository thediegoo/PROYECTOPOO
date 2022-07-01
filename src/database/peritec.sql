-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 01, 2022 at 11:16 PM
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
-- Database: `peritec`
--

-- --------------------------------------------------------

--
-- Table structure for table `atributo`
--

CREATE TABLE `atributo` (
  `codAtributo` varchar(5) NOT NULL,
  `nombreAtr` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `atributoxprod`
--

CREATE TABLE `atributoxprod` (
  `codProducto` varchar(5) DEFAULT NULL,
  `codAtributo` varchar(5) DEFAULT NULL,
  `valor` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `codCategoria` varchar(5) NOT NULL,
  `nombreCat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`codCategoria`, `nombreCat`) VALUES
('CA001', 'Periferico de Entrada'),
('CA002', 'Periferico de Salida'),
('CA003', 'Periferico de Almacenamiento');

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `tipoDoc` varchar(50) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `telf` varchar(9) NOT NULL,
  `tipoCliente` varchar(5) NOT NULL,
  `direccion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `comprobante`
--

CREATE TABLE `comprobante` (
  `id_comprobante` varchar(5) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_admi` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `descuento` double DEFAULT NULL,
  `subTotal` double DEFAULT NULL,
  `precioTotal` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `comprobantxdetalles`
--

CREATE TABLE `comprobantxdetalles` (
  `codProducto` varchar(5) DEFAULT NULL,
  `id_comprobante` varchar(5) DEFAULT NULL,
  `precioUnit` int(11) DEFAULT NULL,
  `cant` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `empleado`
--

CREATE TABLE `empleado` (
  `id_admi` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `telf` int(11) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `fechaEntrada` date DEFAULT NULL,
  `sueldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `empleado`
--

INSERT INTO `empleado` (`id_admi`, `nombre`, `apellido`, `telf`, `direccion`, `fechaEntrada`, `sueldo`) VALUES
(71829302, 'Alonso', 'Nicho', 929697141, 'Jr. Vina Lariena', '2018-06-04', 2700),
(73129302, 'Diego', 'Solis', 981697141, 'Av. Las Gaviotas', '2017-06-13', 2700),
(73829302, 'Danna', 'Vila', 999697141, 'Jr. Vina Ocucaje', '2019-06-12', 2700),
(73829312, 'Hugo', 'Saravia ', 977697141, 'Av. San Lorenzo', '2020-06-14', 2700);

-- --------------------------------------------------------

--
-- Table structure for table `marca`
--

CREATE TABLE `marca` (
  `codMarca` varchar(5) NOT NULL,
  `nombreMar` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marca`
--

INSERT INTO `marca` (`codMarca`, `nombreMar`) VALUES
('M0001', 'LENOVO'),
('M0002', 'HP'),
('M0003', 'CANON'),
('M0004', 'SAMSUNG'),
('M0005', 'DELL');

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

CREATE TABLE `producto` (
  `codProducto` varchar(5) NOT NULL,
  `codCategoria` varchar(5) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `codMarca` varchar(5) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `rut_proveedor` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `cantInicial` int(11) DEFAULT NULL,
  `precioUnit` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `rut_proveedor` int(11) NOT NULL,
  `nombreComercial` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` int(11) NOT NULL,
  `telf` varchar(9) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tipocliente`
--

CREATE TABLE `tipocliente` (
  `tipoCliente` varchar(5) NOT NULL,
  `nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tipocliente`
--

INSERT INTO `tipocliente` (`tipoCliente`, `nombre`) VALUES
('T0001', 'COMUN'),
('T0002', 'ESPECIAL');

-- --------------------------------------------------------

--
-- Table structure for table `usuarioadmi`
--

CREATE TABLE `usuarioadmi` (
  `usuario` varchar(10) NOT NULL,
  `password` varchar(30) NOT NULL,
  `id_admi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuarioadmi`
--

INSERT INTO `usuarioadmi` (`usuario`, `password`, `id_admi`) VALUES
('alonsonh', '123456', 71829302),
('dannavc', '123456', 73829302),
('diegosr', '123456', 73129302),
('hugosb', '123456', 73829312);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `atributo`
--
ALTER TABLE `atributo`
  ADD PRIMARY KEY (`codAtributo`);

--
-- Indexes for table `atributoxprod`
--
ALTER TABLE `atributoxprod`
  ADD KEY `codProducto` (`codProducto`),
  ADD KEY `codAtributo` (`codAtributo`);

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`codCategoria`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `tipoCliente` (`tipoCliente`);

--
-- Indexes for table `comprobante`
--
ALTER TABLE `comprobante`
  ADD PRIMARY KEY (`id_comprobante`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_admi` (`id_admi`);

--
-- Indexes for table `comprobantxdetalles`
--
ALTER TABLE `comprobantxdetalles`
  ADD KEY `codProducto` (`codProducto`),
  ADD KEY `id_comprobante` (`id_comprobante`);

--
-- Indexes for table `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_admi`);

--
-- Indexes for table `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`codMarca`);

--
-- Indexes for table `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codProducto`),
  ADD KEY `codCategoria` (`codCategoria`),
  ADD KEY `codMarca` (`codMarca`),
  ADD KEY `rut_proveedor` (`rut_proveedor`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`rut_proveedor`);

--
-- Indexes for table `tipocliente`
--
ALTER TABLE `tipocliente`
  ADD PRIMARY KEY (`tipoCliente`);

--
-- Indexes for table `usuarioadmi`
--
ALTER TABLE `usuarioadmi`
  ADD PRIMARY KEY (`usuario`),
  ADD KEY `id_admi` (`id_admi`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `atributoxprod`
--
ALTER TABLE `atributoxprod`
  ADD CONSTRAINT `atributoxprod_ibfk_1` FOREIGN KEY (`codProducto`) REFERENCES `producto` (`codProducto`),
  ADD CONSTRAINT `atributoxprod_ibfk_2` FOREIGN KEY (`codAtributo`) REFERENCES `atributo` (`codAtributo`);

--
-- Constraints for table `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`tipoCliente`) REFERENCES `tipocliente` (`tipoCliente`);

--
-- Constraints for table `comprobante`
--
ALTER TABLE `comprobante`
  ADD CONSTRAINT `comprobante_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `comprobante_ibfk_2` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`);

--
-- Constraints for table `comprobantxdetalles`
--
ALTER TABLE `comprobantxdetalles`
  ADD CONSTRAINT `comprobantxdetalles_ibfk_1` FOREIGN KEY (`codProducto`) REFERENCES `producto` (`codProducto`),
  ADD CONSTRAINT `comprobantxdetalles_ibfk_2` FOREIGN KEY (`id_comprobante`) REFERENCES `comprobante` (`id_comprobante`);

--
-- Constraints for table `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codCategoria`) REFERENCES `categoria` (`codCategoria`),
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`codMarca`) REFERENCES `marca` (`codMarca`),
  ADD CONSTRAINT `producto_ibfk_3` FOREIGN KEY (`rut_proveedor`) REFERENCES `proveedor` (`rut_proveedor`);

--
-- Constraints for table `usuarioadmi`
--
ALTER TABLE `usuarioadmi`
  ADD CONSTRAINT `usuarioadmi_ibfk_1` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
