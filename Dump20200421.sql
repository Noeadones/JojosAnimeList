-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: jojos_list
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `anime_genres`
--

DROP TABLE IF EXISTS `anime_genres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `anime_genres` (
  `genre_id` bigint NOT NULL,
  `anime_id` bigint NOT NULL,
  KEY `FK75bqepx4sff93birs2ql4m4m6` (`anime_id`),
  KEY `FKlq8q3hrvabfmlfum70ocmnwvg` (`genre_id`),
  CONSTRAINT `FK75bqepx4sff93birs2ql4m4m6` FOREIGN KEY (`anime_id`) REFERENCES `animes_table` (`id`),
  CONSTRAINT `FKlq8q3hrvabfmlfum70ocmnwvg` FOREIGN KEY (`genre_id`) REFERENCES `genre_entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anime_genres`
--

LOCK TABLES `anime_genres` WRITE;
/*!40000 ALTER TABLE `anime_genres` DISABLE KEYS */;
INSERT INTO `anime_genres` VALUES (1,1),(5,1),(4,2),(2,2),(1,3),(5,3),(1,4),(1,5),(5,6),(3,7),(3,8);
/*!40000 ALTER TABLE `anime_genres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animes_table`
--

DROP TABLE IF EXISTS `animes_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animes_table` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `number_of_episodes` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animes_table`
--

LOCK TABLES `animes_table` WRITE;
/*!40000 ALTER TABLE `animes_table` DISABLE KEYS */;
INSERT INTO `animes_table` VALUES (1,'https://cdn.myanimelist.net/images/anime/3/28013.jpg','Beelzebub',60),(2,'https://cdn.myanimelist.net/images/anime/8/60781.jpg','Cardcaptor Sakura',70),(3,'https://cdn.myanimelist.net/images/anime/8/80356.jpg','Mob Psycho 100',12),(4,'https://cdn.myanimelist.net/images/anime/3/40451.jpg','Bleach',366),(5,'https://cdn.myanimelist.net/images/anime/11/33657.jpg','Hunter x Hunter',148),(6,'https://cdn.myanimelist.net/images/anime/11/56849.jpg','Love Live! School Idol Project',13),(7,'https://cdn.myanimelist.net/images/anime/3/86578.jpg','Kakegurui',12),(8,'https://cdn.myanimelist.net/images/anime/9/9453.jpg','Death Note',37);
/*!40000 ALTER TABLE `animes_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre_entity`
--

DROP TABLE IF EXISTS `genre_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genre_entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre_entity`
--

LOCK TABLES `genre_entity` WRITE;
/*!40000 ALTER TABLE `genre_entity` DISABLE KEYS */;
INSERT INTO `genre_entity` VALUES (1,'SHOUNEN'),(2,'SHOUJO'),(3,'SEINEN'),(4,'ROMANTIC'),(5,'COMEDY');
/*!40000 ALTER TABLE `genre_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `list_anime`
--

DROP TABLE IF EXISTS `list_anime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_anime` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `number_of_episode` bigint NOT NULL,
  `anime_entity_id` bigint DEFAULT NULL,
  `status_entity_id` bigint DEFAULT NULL,
  `user_entity_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgpgx1duy8pl2j71spedwx5uty` (`anime_entity_id`),
  KEY `FKkipg3bohs2xplbob8k4chy8jy` (`status_entity_id`),
  KEY `FK25fwkfcmv6ftpbacmfdge32pg` (`user_entity_id`),
  CONSTRAINT `FK25fwkfcmv6ftpbacmfdge32pg` FOREIGN KEY (`user_entity_id`) REFERENCES `user_entity` (`id`),
  CONSTRAINT `FKgpgx1duy8pl2j71spedwx5uty` FOREIGN KEY (`anime_entity_id`) REFERENCES `animes_table` (`id`),
  CONSTRAINT `FKkipg3bohs2xplbob8k4chy8jy` FOREIGN KEY (`status_entity_id`) REFERENCES `status_entity` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_anime`
--

LOCK TABLES `list_anime` WRITE;
/*!40000 ALTER TABLE `list_anime` DISABLE KEYS */;
INSERT INTO `list_anime` VALUES (1,70,2,3,1),(2,2,7,5,1),(3,12,3,3,1),(4,100,4,2,1),(5,6,6,4,1),(6,148,5,3,3),(7,1,1,4,3),(8,12,3,3,3),(9,200,4,2,3),(10,60,1,3,2),(11,2,5,2,2),(12,12,3,3,2),(13,0,1,1,4),(14,85,5,4,4),(15,37,8,3,4);
/*!40000 ALTER TABLE `list_anime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_entity`
--

DROP TABLE IF EXISTS `status_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status_entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_entity`
--

LOCK TABLES `status_entity` WRITE;
/*!40000 ALTER TABLE `status_entity` DISABLE KEYS */;
INSERT INTO `status_entity` VALUES (1,'P'),(2,'H'),(3,'F'),(4,'W'),(5,'D');
/*!40000 ALTER TABLE `status_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_entity`
--

DROP TABLE IF EXISTS `user_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_entity` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_entity`
--

LOCK TABLES `user_entity` WRITE;
/*!40000 ALTER TABLE `user_entity` DISABLE KEYS */;
INSERT INTO `user_entity` VALUES (1,'Noelia','123'),(2,'Roxana','123'),(3,'David','123'),(4,'Camila','123');
/*!40000 ALTER TABLE `user_entity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-21 18:49:02
