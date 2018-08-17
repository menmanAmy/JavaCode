-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: db_database28
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_gysinfo`
--

DROP TABLE IF EXISTS `tb_gysinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_gysinfo` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `jc` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `bianma` varchar(10) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `fax` varchar(15) DEFAULT NULL,
  `lian` varchar(8) DEFAULT NULL,
  `ltel` varchar(15) DEFAULT NULL,
  `yh` varchar(50) DEFAULT NULL,
  `mail` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_gysinfo`
--

LOCK TABLES `tb_gysinfo` WRITE;
/*!40000 ALTER TABLE `tb_gysinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_gysinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_jsr`
--

DROP TABLE IF EXISTS `tb_jsr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_jsr` (
  `id` int(11) NOT NULL,
  `name` varchar(15) NOT NULL,
  `sex` varchar(2) NOT NULL,
  `age` int(11) NOT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `enable` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_jsr`
--

LOCK TABLES `tb_jsr` WRITE;
/*!40000 ALTER TABLE `tb_jsr` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_jsr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_khinfo`
--

DROP TABLE IF EXISTS `tb_khinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_khinfo` (
  `id` int(11) NOT NULL,
  `khname` varchar(100) DEFAULT NULL,
  `jian` varchar(45) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `bianma` varchar(10) DEFAULT NULL,
  `hao` varchar(45) DEFAULT NULL,
  `fax` varchar(15) DEFAULT NULL,
  `lian` varchar(8) DEFAULT NULL,
  `ltel` varchar(15) DEFAULT NULL,
  `mail` varchar(30) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `xinhang` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_khinfo`
--

LOCK TABLES `tb_khinfo` WRITE;
/*!40000 ALTER TABLE `tb_khinfo` DISABLE KEYS */;
INSERT INTO `tb_khinfo` VALUES (1,'menman',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tb_khinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_kucun`
--

DROP TABLE IF EXISTS `tb_kucun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_kucun` (
  `id` int(11) NOT NULL,
  `spname` varchar(50) DEFAULT NULL,
  `jc` varchar(30) DEFAULT NULL,
  `cd` varchar(50) DEFAULT NULL,
  `gg` varchar(10) DEFAULT NULL,
  `bz` varchar(20) DEFAULT NULL,
  `dw` varchar(10) DEFAULT NULL,
  `dj` double DEFAULT NULL,
  `kcsl` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_kucun`
--

LOCK TABLES `tb_kucun` WRITE;
/*!40000 ALTER TABLE `tb_kucun` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_kucun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_rkth_detail`
--

DROP TABLE IF EXISTS `tb_rkth_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_rkth_detail` (
  `id` int(11) NOT NULL,
  `spid` int(11) DEFAULT NULL,
  `dj` double DEFAULT NULL,
  `sl` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_rkth_detail`
--

LOCK TABLES `tb_rkth_detail` WRITE;
/*!40000 ALTER TABLE `tb_rkth_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_rkth_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_rkth_main`
--

DROP TABLE IF EXISTS `tb_rkth_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_rkth_main` (
  `rkthid` int(11) NOT NULL,
  `pzs` float DEFAULT NULL,
  `je` varchar(8) DEFAULT NULL,
  `ysjl` varchar(50) DEFAULT NULL,
  `gysname` varchar(100) DEFAULT NULL,
  `rtdate` datetime DEFAULT NULL,
  `czy` varchar(30) DEFAULT NULL,
  `jsr` varchar(30) DEFAULT NULL,
  `jsfs` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`rkthid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_rkth_main`
--

LOCK TABLES `tb_rkth_main` WRITE;
/*!40000 ALTER TABLE `tb_rkth_main` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_rkth_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_ruku_detail`
--

DROP TABLE IF EXISTS `tb_ruku_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_ruku_detail` (
  `rkID` int(11) NOT NULL,
  `spid` int(11) DEFAULT NULL,
  `dj` varchar(8) DEFAULT NULL,
  `sl` float DEFAULT NULL,
  PRIMARY KEY (`rkID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_ruku_detail`
--

LOCK TABLES `tb_ruku_detail` WRITE;
/*!40000 ALTER TABLE `tb_ruku_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_ruku_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_ruku_main`
--

DROP TABLE IF EXISTS `tb_ruku_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_ruku_main` (
  `rkID` int(11) NOT NULL,
  `pzs` float DEFAULT NULL,
  `je` varchar(8) DEFAULT NULL,
  `ysjl` varchar(50) DEFAULT NULL,
  `gysname` varchar(100) DEFAULT NULL,
  `rkdate` datetime DEFAULT NULL,
  `czy` varchar(30) DEFAULT NULL,
  `jsr` varchar(30) DEFAULT NULL,
  `jsfs` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`rkID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_ruku_main`
--

LOCK TABLES `tb_ruku_main` WRITE;
/*!40000 ALTER TABLE `tb_ruku_main` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_ruku_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sell_detail`
--

DROP TABLE IF EXISTS `tb_sell_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_sell_detail` (
  `sellID` int(11) NOT NULL,
  `spid` int(11) DEFAULT NULL,
  `dj` varchar(8) DEFAULT NULL,
  `sl` float DEFAULT NULL,
  PRIMARY KEY (`sellID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sell_detail`
--

LOCK TABLES `tb_sell_detail` WRITE;
/*!40000 ALTER TABLE `tb_sell_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_sell_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sell_main`
--

DROP TABLE IF EXISTS `tb_sell_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_sell_main` (
  `sellID` int(11) NOT NULL,
  `pzs` float DEFAULT NULL,
  `je` varchar(8) DEFAULT NULL,
  `ysjl` varchar(50) DEFAULT NULL,
  `khname` varchar(100) DEFAULT NULL,
  `xsdate` datetime DEFAULT NULL,
  `czy` varchar(30) DEFAULT NULL,
  `jsr` varchar(30) DEFAULT NULL,
  `jsfs` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`sellID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sell_main`
--

LOCK TABLES `tb_sell_main` WRITE;
/*!40000 ALTER TABLE `tb_sell_main` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_sell_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_spinfo`
--

DROP TABLE IF EXISTS `tb_spinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_spinfo` (
  `id` int(11) NOT NULL,
  `spname` varchar(50) DEFAULT NULL,
  `jc` varchar(30) DEFAULT NULL,
  `cd` varchar(50) DEFAULT NULL,
  `dw` varchar(10) DEFAULT NULL,
  `gg` varchar(10) DEFAULT NULL,
  `bz` varchar(20) DEFAULT NULL,
  `ph` int(11) DEFAULT NULL,
  `pzwh` varchar(50) DEFAULT NULL,
  `memo` varchar(100) DEFAULT NULL,
  `gysname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_spinfo`
--

LOCK TABLES `tb_spinfo` WRITE;
/*!40000 ALTER TABLE `tb_spinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_spinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_userlist`
--

DROP TABLE IF EXISTS `tb_userlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_userlist` (
  `name` varchar(50) NOT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_userlist`
--

LOCK TABLES `tb_userlist` WRITE;
/*!40000 ALTER TABLE `tb_userlist` DISABLE KEYS */;
INSERT INTO `tb_userlist` VALUES ('user','111');
/*!40000 ALTER TABLE `tb_userlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_xsth_detail`
--

DROP TABLE IF EXISTS `tb_xsth_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_xsth_detail` (
  `id` int(11) NOT NULL,
  `xsthid` int(11) DEFAULT NULL,
  `spid` int(11) DEFAULT NULL,
  `dj` double DEFAULT NULL,
  `sl` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_xsth_detail`
--

LOCK TABLES `tb_xsth_detail` WRITE;
/*!40000 ALTER TABLE `tb_xsth_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_xsth_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_xsth_main`
--

DROP TABLE IF EXISTS `tb_xsth_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_xsth_main` (
  `xsthid` int(11) NOT NULL,
  `pzs` float DEFAULT NULL,
  `je` varchar(8) DEFAULT NULL,
  `ysjl` varchar(50) DEFAULT NULL,
  `khname` varchar(100) DEFAULT NULL,
  `thdate` datetime DEFAULT NULL,
  `czy` varchar(30) DEFAULT NULL,
  `jsr` varchar(30) DEFAULT NULL,
  `jsfs` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`xsthid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_xsth_main`
--

LOCK TABLES `tb_xsth_main` WRITE;
/*!40000 ALTER TABLE `tb_xsth_main` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_xsth_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_database28'
--

--
-- Dumping routines for database 'db_database28'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-17 11:27:13
