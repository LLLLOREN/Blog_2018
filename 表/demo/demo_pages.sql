-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.12

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
-- Table structure for table `pages`
--

DROP TABLE IF EXISTS `pages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pages` (
  `page_id` int(11) NOT NULL,
  `page_name` varchar(50) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`page_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pages`
--

LOCK TABLES `pages` WRITE;
/*!40000 ALTER TABLE `pages` DISABLE KEYS */;
INSERT INTO `pages` VALUES (1,'A bowl of glutinous rice in the autumn','Glutinous rice, the north is called Jiangmi, and my family likes to call it rice. When I was young, although I didn\'t know why there was a \"wine\" in the name of this rice, I always liked it. When it was a magical ingredient, it could be made into rice, rice, scorpion, etc.'),(2,'Chinese tea history','The origin of the \"Chinese tea history\" has so far been divided, and the controversy has not yet been decided. Generally speaking, there are pre-Qin, Western Han, and the Three Kingdoms. Tea appeared in a cultural appearance. It was in the Jin and Northern Dynasties. '),(3,'Usu beer also called the big Usu','The big Usu is a different name for Xinjiang Wusu beer. If it is called \"Ukrainian beer\" according to the name of the Shandong people, the Zabayi (alcoholic) in Xinjiang is bold and arrogant. '),(4,'What is home cooking','When she was a child, she always gave her the biggest compliment when she ate her mother\'s hand-drinks. Mom always replies in the same sentence: \"How can you compare with home cooking?\"'),(5,'The head of the lion','The head of the lion, that is, the \"big meat\" of Yangzhou dialect, the northern dialect is called \"big meatballs\" or \"four-up balls\". '),(6,'The history of buddha jump wall','This dish of Buddha\'s jumping wall is said to have originated in the Qing Dynasty and has a history of more than two hundred years. This dish is made up of 18 kinds of main ingredients and more than 10 kinds of accessories.'),(7,'Fish aubergine','According to legend, a long time ago there was a businessman in Sichuan. The people in their family liked to eat fish. They also pay attention to the seasoning, so they are burning fish. Put some onions, ginger, garlic, wine, vinegar, soy sauce, etc. to add flavor to the seasoning.'),(8,'Fried pork with pepper','Pepper fried meat is a dish made with chili and pork belly as the main ingredients, with soybean meal, garlic, soy sauce, oil and salt, and MSG as accessories. The taste is spicy. Pepper fried meat is the signature dish of every dish that Hunan people must eat. It is one of the most representative Hunan dishes.'),(9,'food_content',NULL),(10,'index',NULL),(11,'Log_in',NULL),(12,'Personal_profile',NULL),(13,'Search',NULL),(14,'Sign_in',NULL),(15,'Chateau lafite-rothschild','In the early 20th century, cappuccino coffee was developed at the same time as steam pressure coffee machine invented by Italian archibcha.'),(16,'Chateau lafite-rothschild','Chateau lafite-rothschild is a red wine produced by Chateau Lafite, one of the five famous chateaus in bordeaux, France.'),(17,'Foie Gras','Foie Gras is a traditional French dish known as \"Foie Gras\" in French, which is literally translated as \"Foie Gras\" in Chinese. \"Foie\" means liver, \"Gras\" means fat. This famous dish pushes the romance of French food to the extreme, and some people say that foie gras is the most suitable western dish for women. '),(18,'Macaroni','Macaroni is a famous Italian dish.In the 18th century, makaroni, a noodle and noodle shop owner near Naples, Italy, had his little daughter roll noodles into hollow strips and hang them on a clothesline while playing.'),(19,'Sirloin steak','According to one tradition, after tasting the delicacy of steak, Henry viii sealed it with Sir, or Sir+loin, which translates as sirloin in Chinese.');
/*!40000 ALTER TABLE `pages` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-07 22:42:05
