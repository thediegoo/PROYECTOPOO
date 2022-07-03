-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2022 at 03:26 AM
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

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `adicionarProducto` (IN `codCategoria` VARCHAR(5), IN `nombre` VARCHAR(20), IN `codMarca` VARCHAR(5), IN `estado` VARCHAR(20), IN `rut_proveedor` INT, IN `stock` INT, IN `cantInicial` INT, IN `precioUnit` DOUBLE)  begin
declare codP char(5);
declare cuenta int;
select right(max(codProducto),4)+1 into cuenta from producto;
set codP=concat('P',Lpad(cuenta,4,'0'));
insert into producto values(codP, codCategoria,nombre,codMarca,estado,rut_proveedor,stock,cantInicial,precioUnit);
end$$

DELIMITER ;

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
(28123456, 'Hugo', 'Saravia', 999231243, 'Av. San Lorenzo', '2019-06-18', 4000),
(71829302, 'Alonso', 'Nicho', 929697141, 'Jr. Vina Lariena', '2018-06-04', 2700),
(73963424, 'Danna', 'Vila', 999283212, 'Jr. Vina Ocucaje', '2016-06-16', 4000),
(76234512, 'Diego', 'Solis', 999875645, 'Jr. Vina Lariena', '2020-06-26', 3000);

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

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`codProducto`, `codCategoria`, `nombre`, `codMarca`, `estado`, `rut_proveedor`, `stock`, `cantInicial`, `precioUnit`) VALUES
('P0001', 'CA002', 'Teclado HP', 'M0002', 'DISPONIBLE', 2147483647, 220, 220, 300),
('P0002', 'CA003', 'CD', 'M0002', 'Disponible', 2147483647, 120, 120, 300),
('P0003', 'CA001', 'Audifonos S12', 'M0004', 'DISPONIBLE', 1147283947, 300, 300, 200),
('P0004', 'CA002', 'Impresora CN', 'M0003', 'DISPONIBLE', 1647483643, 100, 100, 1300),
('P0005', 'CA002', 'Impresora S23', 'M0004', 'DISPONIBLE', 1147283947, 100, 100, 300),
('P0006', 'CA001', 'Mouse D42', 'M0005', 'DISPONIBLE', 1140482649, 200, 200, 150);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `rut_proveedor` int(12) NOT NULL,
  `nombreComercial` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` int(11) NOT NULL,
  `telf` varchar(9) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`rut_proveedor`, `nombreComercial`, `nombre`, `apellido`, `dni`, `telf`, `direccion`) VALUES
(1140482649, 'DELL Company', 'Federico', 'Gutierrez', 23612241, '929812134', 'Jr. Vina Lariena'),
(1147283947, 'SAMSUNG Company', 'Daniela', 'Sanchez', 43612243, '962812134', 'Jr. Diana'),
(1647483643, 'CANON Company', 'Maria', 'Galindo', 27012243, '999812131', 'Av. Alameda'),
(2117482617, 'LENOVO Company', 'David', 'Hernandez', 71612243, '902812134', 'Jr. San Lorenzo'),
(2147483647, 'HP Company', 'Ana', 'Castro', 73612243, '999812134', 'Jr. Vina Ocucaje');

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
('dannavc', '123456', 73963424),
('diegosr', '123456', 76234512),
('hugosb', '123456', 28123456);

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
  ADD KEY `fk_comprobante` (`id_admi`);

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
  ADD KEY `fk_usuario` (`id_admi`);

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
  ADD CONSTRAINT `comprobante_ibfk_2` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`),
  ADD CONSTRAINT `fk_admicom` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`),
  ADD CONSTRAINT `fk_comprobante` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`) ON DELETE CASCADE;

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
  ADD CONSTRAINT `fk_usuario` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_usuarioadmi` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`),
  ADD CONSTRAINT `usuarioadmi_ibfk_1` FOREIGN KEY (`id_admi`) REFERENCES `empleado` (`id_admi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
