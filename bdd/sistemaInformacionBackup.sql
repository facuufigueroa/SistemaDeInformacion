-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: sistemainformacion
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `idcategorias` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `id_tipo_categoria` int DEFAULT NULL,
  PRIMARY KEY (`idcategorias`),
  KEY `fk_categoria_tipocategoria` (`id_tipo_categoria`),
  CONSTRAINT `fk_categoria_tipocategoria` FOREIGN KEY (`id_tipo_categoria`) REFERENCES `tipo_categoria` (`idtipo_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=298 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'Admin. Bragado, otros',28),(2,'Agrimensura y Cédula Catastral Rc.',2),(3,'Agua y cloacas N.120',38),(4,'Aguadas, otros',6),(5,'Aguas y cloacas N.126',38),(6,'Alambrados, mantenimiento',4),(7,'Alquiler oficina',28),(8,'AMAROK, Lavado',15),(9,'AMAROK, chapa y pintura',15),(10,'AMAROK, cochera',15),(11,'AMAROK, cubiertas, alineac. Y balanceo',15),(12,'AMAROK, equipamiento',15),(13,'AMAROK, manten y servicios',15),(14,'AMAROK, otros',15),(15,'AMAROK, patente y patentamiento',15),(16,'AMAROK, seguro',15),(17,'AMAROK, verif. Técn. Vehicular',15),(18,'Amortización',31),(19,'Anita',35),(20,'Argencard',30),(21,'Atenc.Comprador Rocío',2),(22,'Ganadería, Atenc.comprad.y vended.',12),(23,'Atenciones empresariales',28),(24,'sin clasificar',30),(25,'sin clasificar',30),(26,'Banco Nación',30),(27,'Aguada, Grande',6),(28,'Casa personal',7),(29,'Comb. Alimañas',2),(30,'Combustib., lubricantes Rc.',2),(31,'Constr Rc., otros',7),(32,'Correo, franqueo, mand.y gestión',28),(33,'Eden Luz',28),(34,'Electricidad (CRE)',2),(35,'Electricidad Mant. Of.',28),(36,'Ganadería, caballos',12),(37,'Ganadería, otros y Gtos Contratos',12),(38,'Gas Camuzzi',28),(39,'Gas Rc.',2),(40,'Gastos por alquiler N.126',38),(41,'Gastos venta campo Rc.',2),(42,'Gastos x contrato Rc.',28),(43,'HDI, chapa y pintura',13),(44,'HDI, cochera San Mauricio',13),(45,'HDI, cubiertas alineación y balanc.',13),(46,'HDI, lavados',13),(47,'HDI, mantenimiento y servicio',13),(48,'HDI, otros',13),(49,'HDI, patente y patentamientos',13),(50,'HDI, reparaciones',13),(51,'HDI, seguros',13),(52,'HDI, verif.Técn.vehicular',13),(53,'Gastos Navideños',28),(54,'Imp.inmobiliario N.126',38),(55,'Imp.inmobiliario Rc.',2),(56,'Ingreso arrendamiento Agricola',1),(57,'Ingreso x alquiler N.126',32),(58,'Ingreso x Jubilación JMR',32),(59,'JMR, aporte jubilatorio (campo)',33),(60,'JMR, atenciones pers.',33),(61,'JMR, medicina pre-paga',33),(62,'JMR, médico, medic.,lent.,pers.',33),(63,'JMR, Pers., otros',33),(64,'JMR, préstamo',33),(65,'JMR, Prof. Atenciones y Reuniones',37),(66,'JMR, Prof. Caja Prev.S. Jubilación',37),(67,'JMR, Prof. Comidas',37),(68,'JMR, Prof. Instrumental y ropa',37),(69,'JMR, Prof. Matrícula',37),(70,'JMR, Prof. otros',37),(71,'JMR, Prof. otros viajes',37),(72,'JMR, Prof. Publicidad',37),(73,'JMR, Prof. Registro',37),(74,'JMR, Prof. Subscripci.revista,diario, libr',37),(75,'JMR, Prof. Asoc.Coleg.Ing. y Viajes',37),(76,'JMR, Prof. Viaje a E.U',37),(77,'JMR, Prof. viaje Expo Rural Bs. As.',37),(78,'JMR, Prof. viajes a Bs. As.',37),(79,'JMR, Seguros de sepelio y enfermería',33),(80,'JMR, viaje a Bs. As.',33),(81,'JMR, viajes',33),(82,'Librería, fotocop.y factureros',28),(83,'Mantenimiento aguada',6),(84,'Mantenimiento edificio N.120',28),(85,'Mantenimiento edificio N.126',38),(86,'Mantenimiento N.120',38),(87,'Ganadería, Marcas, señales y guías',12),(88,'AMAROK',41),(89,'Motores y bombas',21),(90,'Movilidad y fletes Rc.',2),(91,'Muebles y utiles of.',28),(92,'Muebles y utiles Rocío',2),(93,'Nativa',30),(94,'Internet Apinter',28),(95,'TV Cable Personal flow',28),(96,'Club La Nación',28),(97,'Parque, montes y Praderas',9),(98,'Pers.Acc. Rc., A.R.T.',25),(99,'Pers.Acc. Rc., aportes',25),(100,'Pers.Acc. Rc., contribuciones',25),(101,'Pers.Acc. Rc., otros',25),(102,'Pers.Acc. Rc., seguro',25),(103,'Pers.Acc. Rc., semanal',25),(104,'Pers.Perm.Adm. of. A.R.T.',29),(105,'Pers.Perm.Adm. of. Aguinaldo',29),(106,'Pers.Perm.Adm. of. Aportes',29),(107,'Pers.Perm.Adm. of. Contribuciones',29),(108,'Pers.Perm.Adm. of. Médico, medicam',29),(109,'Pers.Perm.Adm. of. Préstamo',29),(110,'Pers.Perm.Adm. of. Sueldo mensual',29),(111,'sin clasificar',29),(112,'Personal y art. de limpieza',28),(113,'Publicidad N 126',38),(114,'Pulverizadores',21),(115,'Red vial',2),(116,'Refacción N.120',38),(117,'Refrigerios',28),(118,'Repuesto Taller',21),(119,'Rifas,fundac. Y donaciones',28),(120,'Rocío',41),(121,'Saldo al 1 de enero',23),(122,'Seguros varios Rc.',2),(123,'Sin clasificar',24),(124,'Sistema computación',28),(125,'Sistema Eléctrico Base',7),(126,'Alarma Avellaneda 1341',28),(127,'T.V. sistema adherido Rc.',2),(128,'Tasas municipales N.126',38),(129,'sin clasificar',28),(130,'Teléfono movil Of.',28),(131,'Tractor Deutz, cubiertas',18),(132,'Tractor Deutz, manten., reparaciones',18),(133,'Tractor Deutz, otros',18),(134,'Tractor Deutz, serv.rep.motor',18),(135,'Tractor Fiat, cubiertas y reparaciones',17),(136,'Transferencia Argencard',26),(137,'Transferencia Nativa',26),(138,'Transferencias Bco.',26),(139,'Utiles Rc.',21),(140,'JMR, Simec Urgencias Médica',33),(141,'Tanque de agua',7),(142,'Tasas Municipales N.120',38),(143,'Tractorcito White, Reparac.Rep. Y Mant.',19),(144,'Pers.Perm.Admi. Of. Seguro',29),(145,'Imp.Inmobiliario N.120',38),(146,'JMR, Pers.tarjeta Natina',33),(147,'Mantenimiento Solar de Paz',38),(148,'Distribución Casco',6),(149,'Intereses,Comisiones e Impuestos',31),(150,'Asociaciones',2),(151,'Sin clasificar',37),(152,'Pers.Acc. Rc., ajuste e Indemnisaciones',25),(153,'Búsqueda de personal',28),(154,'Arpenta S.A.',34),(155,'Benedit S.A.',34),(156,'Sistema de agua',7),(157,'Ingresos Devoluc. OSDE',32),(158,'Ingreso x Arrendamiento Ganadero',1),(159,'Canales',7),(160,'Motoguadaña',21),(161,'Casa Kaiser',7),(162,'Sin clasificar',32),(163,'Ingresos Otros',1),(164,'Alambrado Eléctrico',4),(165,'Cámara agua y electricidad',7),(166,'Arreglo Caminos',2),(167,'Tractor Fiat, Manten., Reparaciones',17),(168,'Trabajos Culturales',3),(169,'JMR, T.V. Programa',33),(170,'Pers.Acc. Rc., Ropa de trabajo',25),(171,'JMR, Ropa y Calzado',33),(172,'Inv. Mobil. Gastos y Atenc.',34),(173,'José María',38),(174,'Francisco',36),(175,'Arreglos artefactos oficina',28),(176,'Atenc. Alquiler N.126',38),(177,'Ganadería, Aperos, atalajes, enseres',12),(178,'HDI',41),(179,'sin clasificar',NULL),(180,'Juan E.',40),(181,'Molino Casa',6),(182,'Renault 9, Seguro',14),(183,'Renault 9, Cubiertas, alin, balan. Y frenos',14),(184,'Renault 9, Manten. Y Servicios',14),(185,'Renault 9, Combustible',14),(186,'Casa  Grande',7),(187,'Pala Niveladora',21),(188,'JMR, retiró',33),(189,'Renault 9, Chapista',14),(190,'Viajes A.R.T. y Moratorias S.R.T.',28),(191,'Sucesión María A.',27),(192,'sin clasificar',NULL),(193,'JMR, Prof. Gear S.A.',37),(194,'Renault 9, Lavado',14),(195,'Comida y Refrigerios',2),(196,'Renault 9, Oblea Gas',14),(197,'Contador Chiaramoni Honorarios',28),(198,'Artic. de Limpieza Rc.',2),(199,'Picadora Forrajera',21),(200,'Molino grande',6),(201,'Gastos x Inundación y lluvia',2),(202,'Ganadería, Compras Animales',12),(203,'Ganadería, Veterinaria Productos',12),(204,'JMR, Prof. Cursos',37),(205,'Gastos Estruc.Rocío, otros',2),(206,'Ganaderia, Comida  varios',12),(207,'JMR, Prof. Sucesión Ferrando',37),(208,'JMR, Suc.Ferrando',33),(209,'Ropa y Calzado Rocío',2),(210,'Ganadería, Rollos',12),(211,'JMR, Pami O.Social',33),(212,'JMR, Argenta Tarjeta',33),(213,'JMR, Movilidad',33),(214,'Vagón Forrajero',21),(215,'Aportes x Juicios',2),(216,'Cardera desmalezadora',21),(217,'Motosierra',21),(218,'Maquinarias Otros',21),(219,'Aplastadora de granos',21),(220,'Chimango chico',21),(221,'Cosechadora Baselli',21),(222,'Bordeadora',21),(223,'Arreglo gallinero',2),(224,'Surtidor',21),(225,'Tractorcito PRO, Rep. Rep.y Manten.',19),(226,'Ganaderia, forrajes, Fletes,Granos',12),(227,'Internet Rocío',2),(228,'Animales Doméstico',2),(229,'Mangas y corrales',4),(230,'Sin clasificar',NULL),(231,'Molino Andersón',6),(232,'Arreglo gallinero',7),(233,'Silos,aireación,Base,Electricidad',7),(234,'Galpón Andersón',7),(235,'Galpón Rocío',7),(236,'sin clasificar',7),(237,'Tinglado Rocío',7),(238,'Pesadas',10),(239,'Sin clasificar',10),(240,'Cultivo Trigo y Cebada',10),(241,'Sin clasificar',NULL),(242,'Mant. y Reparaciones',20),(243,'Arreglo cubiertas',20),(244,'sin clasificar',20),(245,'Grupo  Electrógeno',21),(246,'Sin clasificar',NULL),(247,'Pagos II.BB.',5),(248,'Pagos Ganancias',5),(249,'Bienes Personales',5),(250,'sin clasificar',7),(251,'sin clasificar',6),(252,'sin clasificar',33),(253,'Herramientas, Taller',21),(254,'JMR: b. TV Programa',34),(255,'Sin clasificar',NULL),(256,'Chevrolet, Compra',16),(257,'Chevrolet, manten. y servicios',16),(258,'Chevrolet, Lavado',16),(259,'Chevrolet, Chapa y Pintura',16),(260,'Chevrolet, Cubiertas, alinear, balanceo',16),(261,'Chevrolet, patente y patentamiento',16),(262,'Chevrolet, Seguro',16),(263,'Chevrolet, verif. Tec. Vehicular',16),(264,'Chevrolet',41),(265,'Chevrolet, Otros',16),(266,'Exposiciones y Remates',12),(296,'prueba',1);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra_ventas_iva`
--

DROP TABLE IF EXISTS `compra_ventas_iva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra_ventas_iva` (
  `idcompra_ventas_iva` int NOT NULL AUTO_INCREMENT,
  `operacion` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `tipo_comprobante` varchar(50) DEFAULT NULL,
  `nro_comprobante` varchar(50) DEFAULT NULL,
  `cuit` varchar(45) DEFAULT NULL,
  `imp_neto_grav` double DEFAULT NULL,
  `iva_facturado_10` double DEFAULT NULL,
  `imp_interno` double DEFAULT NULL,
  `concepto_no_grav` double DEFAULT NULL,
  `percepcion_iva` double DEFAULT NULL,
  `ret_ganancias` double DEFAULT NULL,
  `perc_iibb_compra` double DEFAULT NULL,
  `imp_total_fac` double DEFAULT NULL,
  `ite_iva_dere_reg` double DEFAULT NULL,
  `c_no_grav_sellos` double DEFAULT NULL,
  `ret_ii_bb_venta` double DEFAULT NULL,
  `iva_rg_212` double DEFAULT NULL,
  `grav_ley_25413` double DEFAULT NULL,
  `int_numerales` double DEFAULT NULL,
  `otros` double DEFAULT NULL,
  `id_transaccion` int DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `operaciones_exentas` double DEFAULT NULL,
  `ing_brutos` double DEFAULT NULL,
  `ret_iva` double DEFAULT NULL,
  `imp_r_ing_brutos` double DEFAULT NULL,
  `iva_facturado_21` double DEFAULT NULL,
  `iva_facturado_27` double DEFAULT NULL,
  PRIMARY KEY (`idcompra_ventas_iva`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra_ventas_iva`
--

LOCK TABLES `compra_ventas_iva` WRITE;
/*!40000 ALTER TABLE `compra_ventas_iva` DISABLE KEYS */;
/*!40000 ALTER TABLE `compra_ventas_iva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuentas` (
  `idcuenta` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `id_tipo_cuenta` int DEFAULT NULL,
  PRIMARY KEY (`idcuenta`),
  KEY `fk_cuenta_tipocuenta` (`id_tipo_cuenta`),
  CONSTRAINT `fk_cuenta_tipocuenta` FOREIGN KEY (`id_tipo_cuenta`) REFERENCES `tipo_cuenta` (`idtipo_cuenta`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` VALUES (1,'Banco Nacion - Cheque',1),(2,'Banco Nacion - Transferencia',2),(3,'Nativa',3),(4,'Caja 1',1),(5,'Tractor Deutz 55',2),(6,'Tractor Deutz 105',2),(7,'Tarjeta de Crédito2',1),(8,'Local Nuñez 126',2),(9,'Peugeot HDI',2),(10,'Solar de Paz',2),(11,'Retenciones',1),(12,'Cuentas a cobrar',1),(13,'Cuentas a pagar',3),(14,'Toros AA PP',1),(15,'Tierra',2),(16,'Sin clasificar',5),(17,'Credicampo S.A.',3),(18,'Pedro Mango y Otros',1),(19,'Tanque Grande',2),(20,'J.M.Roqués',1),(21,'Casa Personal Rc.',2),(22,'Banco Nacion - Debito',1),(23,'Bco.Credicoop Crédito',3),(32,'Caja 2',1);
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa_orden`
--

DROP TABLE IF EXISTS `empresa_orden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa_orden` (
  `idempresa_orden` int NOT NULL AUTO_INCREMENT,
  `empresa` varchar(100) DEFAULT NULL,
  `cuit` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idempresa_orden`)
) ENGINE=InnoDB AUTO_INCREMENT=405 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa_orden`
--

LOCK TABLES `empresa_orden` WRITE;
/*!40000 ALTER TABLE `empresa_orden` DISABLE KEYS */;
INSERT INTO `empresa_orden` VALUES (1,'Carvimar','23-93443085-9'),(2,'Claro Telefono','30-66328849-7'),(3,'El Molino Fiambreria',''),(4,'Madame Lounge','30-71019969-4'),(5,'SHELL NUEVA IDEA Aram.Moros.','30-70871135-3'),(6,'Todo Papel','27-13864143-6'),(7,'Abat Héctor S.A.C.I.F.I.A','30-63346404-5'),(8,'Abel R. Demarco','20-05260792-3'),(9,'ABSA','no entrado'),(10,'Accesso Oeste Lujan','30-67877449-5'),(11,'Adrija S. A.','30-70833089-9'),(12,'Agropecuaria Calvo','20-04901502-0'),(13,'AIRBUS S.A.','30-71097620-8'),(14,'AL LIMITE','20-24947300-7'),(15,'ALFERESIS S.R.L.','30-71479593-3'),(16,'Alfonso Carlos Anibal','20-08103105-4'),(17,'Andino Maderas','20-17523576-1'),(18,'ANDREONI, Gustavo A.','20-24181883-8'),(19,'Anita','no entrado'),(20,'ANSES','no entrado'),(21,'APINTER','30-71516830-4'),(22,'ARBA Rentas Prov.Bs.As.','no entrado'),(23,'Arco Iris','23-16043438-4'),(24,'Ardiles María Soledad','20-24754977-4'),(25,'Argencard','30-50001091-2'),(26,'Arribalzaga Oscar','20-05052226-2'),(27,'Arroyando S.A.','30-70740815-0'),(28,'ART',''),(29,'AYF S.R.L.','30-68067427-9'),(30,'Aznar Propiedades','30-70911088-4'),(31,'Baglietto Joyas','27-05731554-2'),(32,'Baireswagen S.A.','30-70700554-4'),(33,'Banco Ciudad Bs.As.',''),(34,'Banco Credicoop','30-57142135-2'),(35,'Banco Credicoop cta 2','30-57142135-2'),(36,'Banco Nación','30-50001091-2'),(37,'Banco Santander Río',''),(38,'Barbetti, Chapista',''),(39,'Bazar El Ciclon','27-27101002-3'),(40,'Bazar La Victoria',''),(41,'Beraza Eduardo','30-54709052-3'),(42,'Beutner Joaquin A.','23-05527691-9'),(43,'Big Arribalzaga','20-23786295-4'),(44,'Bragabul','30-66444785-8'),(45,'Bragado Hogar',''),(46,'Bragado Pizza y Juegos','30-7243099-7'),(47,'Bragas S.R.L.','30-70717387-0'),(48,'BRINGERI','30-71072438-1'),(49,'Bruera Carlos',''),(50,'Bs.As.',''),(51,'Buena Imagen S.A.','33-70860168-9'),(52,'Bulonera 7 de Agosto','20-22171532-3'),(53,'Bulonera Sarmiento','20-13075616-7'),(54,'C.O.P.Centro O.Patagonia','20-26222183-1'),(55,'Cacho Suspensión','30-70058413-1'),(56,'CAI MEIXIA',''),(57,'Caja',''),(58,'Caja Caaitba Prev.Soc.',''),(59,'Calderon Jorge A.','20-14382009-3'),(60,'calle 9 y 33 25 de Mayo','20-20009110-9'),(61,'Calzados L y C',''),(62,'Calzados Vira 80',''),(63,'Calzados ZEST','20-14983138-0'),(64,'CAMBA CUA S.R.L.','30-71246007-1'),(65,'Camicha Romualdo Martin','20-05048558-8'),(66,'Carniceria San Jorge',''),(67,'Carrizo Raúl H.','27-11631765-1'),(68,'Caruzzo Nestor','20-08428742-4'),(69,'Casa Beutner','23-05527691-9'),(70,'Casa Dunamis',''),(71,'Casa Jonas','33-69378636-9'),(72,'Casa Manolo',''),(73,'Casa Morosi','23-25243056-9'),(74,'Casa Ratón','20-13864299-3'),(75,'Casa Sarandí','20-92330775-4'),(76,'Casas Rogelio R.','20-10724401-9'),(77,'Cassani Electromecanica','20-12513305-4'),(78,'Cassi Jorge y Ariel','30-66447920-2'),(79,'Cejas Hugo',''),(80,'Centro C. CUCI','30-52800825-5'),(81,'Centro de Ingenieros','no entrado'),(82,'Chacinados Beneitez',''),(83,'Chacinados La Isolina',''),(84,'Chatell Peugeot','30-70747524-9'),(85,'Cirigliano, Automotor',''),(86,'CLC Super','no entrado'),(87,'Clinica Lanús',''),(88,'Club Argentino de Servicios',''),(89,'Cocineros Argentinos S.A.','30-71019969-4'),(90,'Coleg.Ing.Agrónoy Forestal',''),(91,'Colegio de Ingenieros',''),(92,'Colegio Nacional',''),(93,'Comisionista Ossola','20-24947054-7'),(94,'Comp. De los Andes',''),(95,'Comun y serv. Choique',''),(96,'Comunicaciones Bragado S.A.','30-71050351-2'),(97,'Confitería CAO',''),(98,'Confitería NEW GREM','20-39925185-1'),(99,'Confiteria Olivos',''),(100,'Coop. 25 Sur GNC','30-59220736-9'),(101,'Coop.Rural Elect. Bragado','30-56559839-9'),(102,'Coop.Seguros Del Vitto','30-50004717-4'),(103,'Corniglia Ruben','20-11631935-8'),(104,'Corralón 1º de Mayo','30-70977452-9'),(105,'Correo Argentino','30-70857483-6'),(106,'Costa Marcelo',''),(107,'Creaciones Kattya',''),(108,'Curia S.R.L.','30-70868130-6'),(109,'CUSPIDE LIBROS S.A.','30-53909781-0'),(110,'Daraio Antonio','20-05039092-7'),(111,'Davant Marcelo J.','20-33335306-8'),(112,'DE Gennaro Marcelo','20-21700705-5'),(113,'DE-CATA',''),(114,'Deheza S.A.I.C.F. e I','30-98118667-0'),(115,'Despensa Mabel',''),(116,'Di Paola José','20-18085928-5'),(117,'Dia Argentina s.A.',''),(118,'Diario La Voz de Bragado',''),(119,'DIRECTV','30-68588939-7'),(120,'Dominguez B. Emilse','27-92768711-4'),(121,'Don Eduardo',''),(122,'Doña Chicha','23-25233506-4'),(123,'Dr. Finkelsztein carlos','20-07961487-5'),(124,'Dr. Gomez Mario',''),(125,'Duel S.R.L.','30-69318623-0'),(126,'Durante Mariana M.','27-25936571-1'),(127,'ECONOMART S.R.L.','30-65425756-2'),(128,'Eden Luz','20-04145178-6'),(129,'EESS ACCESO OESTE','30-67877449-5'),(130,'EL ALAMO S.C.A.','30-51665403-8'),(131,'El Censor','30-50009910-7'),(132,'El Emporio del Espantaplagas','20-92130248-8'),(133,'El Hogar del Blanco','33-71063563-9'),(134,'El viejo Almacen',''),(135,'Electricidad Urquiza','20-17241409-6'),(136,'Electro centro Rivadavia',''),(137,'Electro TES','33-71386530-9'),(138,'Elhorriburu María de los Angel','27-24423716-4'),(139,'Elisei Hnos. YPF','30-62063674-2'),(140,'En blanco','no entrado'),(141,'Est. de Serv. San Martin','20-23775133-8'),(142,'Est. de Serv. San Mateo SRL','30-71208443-6'),(143,'Est.de Serv.Beraza y Cia S.R.L','30-66446354-3'),(144,'Estac.de Serv. Nordelta','30-67877449-5'),(145,'Estac.Serv. Del Vasco','20-12175732-0'),(146,'EXIN AGRO SRL','30-68840413-0'),(147,'Ezequiel Misiuryk','20-34434516-4'),(148,'Fabian A. Mattos','20-17241583-1'),(149,'Fabrinor','30-62709606-9'),(150,'Facci','20-13864467-8'),(151,'Faccio Rubén',''),(152,'Farmacia Cruz Roja',''),(153,'Farmacia del Aguila','no entrado'),(154,'Farmacia Santa Rosa',''),(155,'Feluca S.A.','30-70967855-4'),(156,'Fer Sanitarios','20-20751539-7'),(157,'Ferreteria Rivadavia','20-11149202-7'),(158,'Fioramonti R.Anibal','20-13075616-7'),(159,'Fioramonti Ricardo A.','20-13075616-7'),(160,'Fontanero SA','30-68764083-3'),(161,'Forastefano Construc.','20-26846980-0'),(162,'Francisco','no entrado'),(163,'Frattini Jorge',''),(164,'Fundac.Sales y Faval.',''),(165,'Garcia Javier A.','20-18580251-6'),(166,'Garcia Tuñon E.Fernando','20-38553102-9'),(167,'Gas Camuzzi','30-65786428-1'),(168,'Gear S.A',''),(169,'Germano','30-71010513-4'),(170,'GLENMORE S.A.C.I.F.I',''),(171,'Gomería Bragado','20-28601804-2'),(172,'González Osmar A.','20-05035928-0'),(173,'Gotelli Jorge',''),(174,'Grandi Pintor',''),(175,'Graneros del Oeste','30-56835188-2'),(176,'Granzella Contadora','27-31069143-2'),(177,'Grippo Francisco','20-13055524-2'),(178,'Grosspal Vialcam S.A.','30-66918895-8'),(179,'Gruppe 46',''),(180,'Guarachera S.A.','30-71448681-7'),(181,'H.K.T. Boldoni',''),(182,'Hector Raúl Grassi',''),(183,'Heidi','no entrado'),(184,'Herrero y Cia','30-58947364-3'),(185,'Hidrolavado Valentin',''),(186,'Hierros Walter','20-14600874-8'),(187,'Hotel Coll','33-61284834-9'),(188,'Hotel IVYRA PYTA','27-14286523-3'),(189,'Hotel La Calle Algarrobo','27-38107544-9'),(190,'HOTEL MICELLI','27-12513352-0'),(191,'Hotel Paris','20-24186535-6'),(192,'Hugo S. Dulbecco','20-29265518-6'),(193,'Ingelec','20-13864047-8'),(194,'INTA Asoc.Cooperadora','33-57431316-9'),(195,'Interlineas de Ramos',''),(196,'Inversor Global S.A.','30-70906700-8'),(197,'J.M.Roqués',''),(198,'Jauregui (Calzados)','20-14776742-1'),(199,'José María Roqués','no entrado'),(200,'Juan C.M.Barboza Comisionista','20-93764335-8'),(201,'Juan E. Roqués','20-20226006-4'),(202,'Juanjo Tapicería','20-05066161-0'),(203,'JyM Seguridad y sistema S.A.','33-66446972-9'),(204,'Kiosco Griselda','30-71172110-6'),(205,'Kiosco Regina',''),(206,'Kiosko Tomy','30-71440124-2'),(207,'La Anonima','no entrado'),(208,'La Casa de las camas','20-109706338'),(209,'La Casa de las Carteras','20-08364503-3'),(210,'La Dorita','27-10706177-6'),(211,'La Dulce Seguros','30-50004144-3'),(212,'La Estanzuela Agricultura S.A.','30-71542522-6'),(213,'La Montaña S. R. L.','3052616479-9'),(214,'La Nación','30-50008962-4'),(215,'La Nortit','33-66448480-9'),(216,'La Plaza Tienda','27-16619942-0'),(217,'La Posta Chivilcoy','30-68772552-9'),(218,'Lafit Micro a 25',''),(219,'Lamas Electromecanica','20-12067337-9'),(220,'Lasa Alicia','27-17241406-6'),(221,'Laura Aristi','27-17864178-1'),(222,'Laureana Granzella','27-31069143-2'),(223,'Lavadero Troya',''),(224,'Laxagueborde G.S.','27-26044596-6'),(225,'Librería AteneoGrand','30-65438619-2'),(226,'Librería Ayala','30-69213485-7'),(227,'Librería Center Rivadavia','no entrado'),(228,'Librería Laser','23-20751770-4'),(229,'Librería Lavalle','30-71407940-5'),(230,'Librería LITEX',''),(231,'Librería Santa Fe','30-63957998-7'),(232,'Librería Senise','20-05008116-9'),(233,'Librería Tio Pato','27-14776788-4'),(234,'Liderar','30-50005949-0'),(235,'Lo de Alberto','no entrado'),(236,'Lo de Cata',''),(237,'Locutorio Linea del Sol',''),(238,'Loft Computación','27-17241789-8'),(239,'Macias Roberto O.',''),(240,'Maderera Franco',''),(241,'Maratea (Aire)','20-05062723-4'),(242,'Marellij.C. y Otro S. de H.','30-70909735-7'),(243,'Maria Amalia','no entrado'),(244,'María Soledad Ardiles',''),(245,'Mariana Martina Durante',''),(246,'Martin Fierro','27-13386696-0'),(247,'Martin y Martin','30-68824161-4'),(248,'Marzano',''),(249,'MATSUURA FIDEL,F.Japonesa','20-92726257-7'),(250,'Mazzini Mecánica','20-05527695-2'),(251,'Mecánica Stocco S.R.L','30-71435241-1'),(252,'Medical Work',''),(253,'MEDICI neumatic.','30-71031780-8'),(254,'Megacerrajeria Silvestro','20-22042454-6'),(255,'Mercado  Miguel Angel','20-11070759-3'),(256,'Mercado Los Primos','20-14600621-4'),(257,'Ministerio de Trabajo',''),(258,'Montes de Oca Fernando','20-22171398-3'),(259,'Morales Impresión','20-13864459-7'),(260,'Movistar','30-67881435-7'),(261,'Muebleria La Nueva','30-66495349-4'),(262,'Municipalidad Brag.','no entrado'),(263,'Municipalidad de Luján',''),(264,'Muracco Marta y Salum Armando','30-66447364-6'),(265,'Mussini Juan José','20-20751605-9'),(266,'Naldo Lombardi','30-69746598-3'),(267,'Nativa','30-50001091-2'),(268,'Neumáticos Alvarez','20-28601804-2'),(269,'NH Repuesto','20-21964648-9'),(270,'Norberto y Pablo Lafit','30-70830532-0'),(271,'Nuevo Golfo','20-15315804-6'),(272,'Nuevo Ritmo',''),(273,'Oliva Andres C.','20-05527627-8'),(274,'Olivieri','no entrado'),(275,'Oriente','no entrado'),(276,'Ornato','30-71039289-3'),(277,'Orosco (Pulverización)','20-05045002-4'),(278,'Ortellado Arquitecto',''),(279,'Ortiz Federico',''),(280,'OSDE','no entrado'),(281,'Osecac',''),(282,'Ossola Javier Comisionista','20-24947054-7'),(283,'Osunos','20-17523620-2'),(284,'Pablo G. Gomez',''),(285,'Pablo Garbarini Islas','20-08406875-7'),(286,'Paisajes Digital S.A.','33-71092559-9'),(287,'Panadería los Girasoles',''),(288,'Panesse Molinero',''),(289,'Papelera Matias','20-31372587-2'),(290,'Parador 210','30-71248256-3'),(291,'PARG.S.R.L.','33-71540704-9'),(292,'Parodi Karina',''),(293,'Parrilla El Capricho','20-18106694-7'),(294,'Paulino  Lubricentro','20-10310849-8'),(295,'Pedro Mango y otros','30-66444730-0'),(296,'Perfumeria Abel','30-70857759-2'),(297,'Perfumeria Don Martin','20-24069316-0'),(298,'Pergomotos','20-16301269-4'),(299,'Personal flow','30-63945373-8'),(300,'Petrobras E/S Libertador','30-69161708-0'),(301,'Petroguazz','30-70783593-8'),(302,'Piazza (Per-Bra)','20-08428242-2'),(303,'Pillon Lucas',''),(304,'Pinturas .Bragado','20-24181883-8'),(305,'Pintureria 25 de Mayo','30-63015506-8'),(306,'Polirubro El Pato','20-22171303-7'),(307,'Polirubro el Pato','20-22171303-7'),(308,'Potente y Muzzari','30-55529271-2'),(309,'Potro Bragado S.A.','30-71162685-5'),(310,'Rato Diego A.','20-13055747-4'),(311,'Raúl López','20-05062768-4'),(312,'Remis Moura Mario D.','20-16620000-9'),(313,'Remises Marcos','23-24093995-9'),(314,'Remises Sur','27-12537155-3'),(315,'Remises T.R.','20-16301352-6'),(316,'Repuestos CAR`S',''),(317,'Restaurant La Gallareta','27-32270049-6'),(318,'Restaurant La Terminal','27-13816122-1'),(319,'Restaurante Jorly','27-11631765-1'),(320,'Restauurant La Fausta','20-21786531-0'),(321,'Revenue S.A.','30-71585771-1'),(322,'Ricardo Javier Adornetto','20-18270362-2'),(323,'Riesgo Cero','27-14417021-6'),(324,'Rigallagro SRL NDC','30-71228888-0'),(325,'Rizzo Luis Maria','20-29240347-0'),(326,'Rodamientos Bragado','20-07625468-1'),(327,'Rodriguez U. Fabián Abogado','20-20846504-0'),(328,'Romero Martin Ignacio','20-20009110-9'),(329,'Romero S.R.L.','30-51857204-7'),(330,'Romiglia','20-05060338-6'),(331,'Ropa Fuerte','30-71537302-1'),(332,'Rotiseria La Nonna','27-11149046-0'),(333,'Sabores de Bragado','20-17344136-4'),(334,'Salón Azul','23-17523885-9'),(335,'San Mauricio (cochera)','23-13562705-4'),(336,'Sanchez Puyade Nicolas','20-21831888-7'),(337,'Santa Sergia',''),(338,'Santinon Jeronimo','20-23373015-8'),(339,'Santorini El Relampago S.A.','30-66517672-6'),(340,'Sarnicola Guillermo','20-10668898-3'),(341,'Savalio (Cerrajero)','no entrado'),(342,'Savalio (Cochera)',''),(343,'Senise Jorge A.','20-13864298-5'),(344,'Servicom Faingoy','no entrado'),(345,'SERVICOMPRAS YPF','20-37356951-9'),(346,'Shell El Parque','30-71040930-3'),(347,'Show Car   Bracco','20-36625934-2'),(348,'Sib 2000 Ortiz','no entrado'),(349,'Simec',''),(350,'Siri Bulonera','33-64618100-9'),(351,'Sociedad Rural',''),(352,'Socoma S.A.','33-53674744-9'),(353,'SOFIA','33-69854156-9'),(354,'Solar de Paz','no entrado'),(355,'Sosa Carlos Ezequiel','20-26909458-4'),(356,'Souto Hector Manuel','20-05089241-8'),(357,'Starna Alberto N.','20-04541952-6'),(358,'Sucesión de Avalos J.C.','20-04691775-9'),(359,'Sucesión de Grego Ruben','20-04212219-0'),(360,'Supensión La Esquina','20-04009322-3'),(361,'SWICH Electronica','30-70838697-5'),(362,'Tango`s','27-92765838-6'),(363,'Tecnoluz','20-10238224-3'),(364,'Telefónica','30-63945397-5'),(365,'TerraVerde','30-71544287-2'),(366,'Tiber Neumáticos','30-70923431-1'),(367,'Tironi Juan Carlos','20-05243033-0'),(368,'TIZ - REP','30-66760656-6'),(369,'Todo Goma','30-71226256-3'),(370,'Todo Lubricante Castignan','23-12513221-9'),(371,'Todo Papel','27-13864143-6'),(372,'Tomatis Sebastian Daniel','20-27776526-9'),(373,'Traverso M. Soledad','27-28391019-4'),(374,'Tuboloc S. A.','30-70745203-6'),(375,'UDINE','20-27385078-4'),(376,'V.T.V. Noroeste S.A','30-68492348-6'),(377,'Vera Elvira',''),(378,'Vera, Chapista','20-24181962-1'),(379,'Veterinaria Alvarez','20-13055684-2'),(380,'Veterinaria La Rural','20-04699246-7'),(381,'Vidrieria Amadeo','23-05063205-9'),(382,'Villa Bragado','33-65712993-9'),(383,'Vitrola Expres','20-13055664-8'),(384,'Warnes Dodge SRL','30-71450153-0'),(385,'Yañez','no entrado'),(386,'YPF 25 de Mayo','30-71687141-6'),(387,'YPF Santa María','30-66446354-3'),(388,'Zaga Daniel A.','20-24947300-7'),(389,'Zanlungo Eduardo A.','20-16477093-2'),(390,'ZONA 1 PLOTTER','20-30377053-5'),(391,'Zurich. Seguros',''),(392,'Zuztarra S.A.','30-71110614-2');
/*!40000 ALTER TABLE `empresa_orden` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcategorias`
--

DROP TABLE IF EXISTS `subcategorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subcategorias` (
  `idsubcategorias` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idsubcategorias`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcategorias`
--

LOCK TABLES `subcategorias` WRITE;
/*!40000 ALTER TABLE `subcategorias` DISABLE KEYS */;
INSERT INTO `subcategorias` VALUES (1,'Nuñez 120'),(2,'Nuñez 126'),(3,'Nuñez 855'),(4,'Solar de Paz'),(5,'No'),(6,'Inversiones'),(8,'prueba');
/*!40000 ALTER TABLE `subcategorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_categoria`
--

DROP TABLE IF EXISTS `tipo_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_categoria` (
  `idtipo_categoria` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idtipo_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_categoria`
--

LOCK TABLES `tipo_categoria` WRITE;
/*!40000 ALTER TABLE `tipo_categoria` DISABLE KEYS */;
INSERT INTO `tipo_categoria` VALUES (1,'a) Rocío Ingresos'),(2,'b) Gastos de Estructura'),(3,'bb) Trabajos Culturales'),(4,'c) Alambrados y Corrales'),(5,'cc) Impuestos'),(6,'d) Aguadas'),(7,'e) Construcciones Rocío'),(8,'ee) Campo Negociación'),(9,'f) Forestales'),(10,'ff) Cultivo Trigo'),(11,'g) Praderas'),(12,'h) Ganadería'),(13,'j) HDI, Peugeot'),(14,'l) Renault 9'),(15,'ll) AMAROK'),(16,'lll) Camioneta chevrolet'),(17,'m) Tractor Fiat'),(18,'n) Tractor Deutz'),(19,'o) Tractorcito'),(20,'oo) Casilla grande'),(21,'p) Maquinaria, Herramientas'),(22,'q) Préstamo'),(23,'Saldos al 1 de enero'),(24,'Sin Clasificar'),(25,'t) Personal accidental Rocío'),(26,'Transferencias'),(27,'tt) María Amalia Roqués'),(28,'u) Administración Bragado'),(29,'v) Pers.Perm. Administ.Bragado'),(30,'w) Gastos Financieros'),(31,'x) Creditos Bancarios'),(32,'y) JMR: a. Ingresos'),(33,'z) JMR: b. Egresos'),(34,'zz) JMR: e. Inversión,Mobi.gtos.atenc.'),(35,'zz) Anita Roqués'),(36,'zz) Francisco Roqués'),(37,'zz) JMR: c. Gastos Profesionales'),(38,'zz) JMR: d. Gastos Propiedades'),(39,'zz) José María Roqués'),(40,'zz) Juan E. Roqués'),(41,'zzz) Combustible Gas-oil'),(46,'ingresos 2');
/*!40000 ALTER TABLE `tipo_categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_cuenta`
--

DROP TABLE IF EXISTS `tipo_cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_cuenta` (
  `idtipo_cuenta` int NOT NULL AUTO_INCREMENT,
  `tipo_cuenta` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtipo_cuenta`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_cuenta`
--

LOCK TABLES `tipo_cuenta` WRITE;
/*!40000 ALTER TABLE `tipo_cuenta` DISABLE KEYS */;
INSERT INTO `tipo_cuenta` VALUES (1,'activo corriente'),(2,'activo no corriente'),(3,'pasivo corriente'),(4,'pasivo no corriente'),(5,'sin clasificar'),(9,'activo 2'),(10,'PASIVO 2');
/*!40000 ALTER TABLE `tipo_cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transacciones`
--

DROP TABLE IF EXISTS `transacciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transacciones` (
  `idtransacciones` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(50) DEFAULT NULL,
  `id_cuenta` int DEFAULT NULL,
  `cheque` varchar(50) DEFAULT NULL,
  `num_fact` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `id_orden_empresa` int DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  `id_categoria` int DEFAULT NULL,
  `id_subcategoria` int DEFAULT NULL,
  `salidas` double DEFAULT NULL,
  `entradas` double DEFAULT NULL,
  `a_impuestos_iva` tinyint(1) DEFAULT NULL,
  `a_iva` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idtransacciones`),
  KEY `fk_transaccion_cuenta` (`id_cuenta`),
  KEY `fk_transaccion_categoria` (`id_categoria`),
  KEY `fk_transaccion_subcategoria` (`id_subcategoria`),
  KEY `fk_transaccion_empresaorden` (`id_orden_empresa`),
  CONSTRAINT `fk_transaccion_categoria` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`idcategorias`),
  CONSTRAINT `fk_transaccion_cuenta` FOREIGN KEY (`id_cuenta`) REFERENCES `cuentas` (`idcuenta`),
  CONSTRAINT `fk_transaccion_empresaorden` FOREIGN KEY (`id_orden_empresa`) REFERENCES `empresa_orden` (`idempresa_orden`),
  CONSTRAINT `fk_transaccion_subcategoria` FOREIGN KEY (`id_subcategoria`) REFERENCES `subcategorias` (`idsubcategorias`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transacciones`
--

LOCK TABLES `transacciones` WRITE;
/*!40000 ALTER TABLE `transacciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `transacciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-09 11:28:13
