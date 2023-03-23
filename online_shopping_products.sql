-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: online_shopping
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `ProductId` int NOT NULL,
  `ProductName` varchar(255) DEFAULT NULL,
  `ProductDiscription` varchar(255) DEFAULT NULL,
  `AvailableQuantity` int DEFAULT NULL,
  `Price` int DEFAULT NULL,
  PRIMARY KEY (`ProductId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (101,'OnePlus 10R 5G','12 GB RAM, 256 GB Storage',10,40499),(102,'Apple iPhone 14','128 GB RAM, 128 GB Stograge',8,72999),(103,'Apple MacBook 2022','16 GB RAM, 256 GB SSD',5,131990),(104,'Lenovo Intel Celeron Dual Core','8 GB RAM, 256 GB SSD',9,25919),(105,'LG (32 inch) HD Ready LED Smart TV','OS: WebOS, Full HD Ready 1366 x 768 pixels',4,12990),(106,'Acer (40inch) Full HD LED Smart TV','OS: Android, FUll HD 1920 x 768 Pixels',10,16999),(107,'SanDisk Cruzer Blade Pen Driver','USB 2.0|32 GB, Plastic, For Desktop, Laptop, Audio Player, Television',9,278),(108,'HP v220w Pen Drive','USB 2.0|28GB, Metal, For Desktop, Laptop, Audio Player, Mobile',5,719),(109,'Boat Rockerz 255 Pro+ Bluetooth Headset','Bluetooth Version:5.2, Wireless Range: 10m, 40Hrs Battery Life',4,1299),(110,'OnePlus Bullets Wireless Z2 Bluetooth Headset','Bluetooth Version: 5, Battery Life: 20Hrs, Charging Time: 10mins',15,1999);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-23 22:38:15
