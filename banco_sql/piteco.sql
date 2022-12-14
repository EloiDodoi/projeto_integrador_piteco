
CREATE DATABASE  IF NOT EXISTS `piteco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `piteco`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: piteco
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `historico_preco`
--

DROP TABLE IF EXISTS `historico_preco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico_preco` (
  `Preco_antigo_idpreco_antigo` int(11) NOT NULL,
  `Produto_idProduto` int(11) NOT NULL,
  `historico_data` date DEFAULT NULL,
  PRIMARY KEY (`Preco_antigo_idpreco_antigo`,`Produto_idProduto`),
  KEY `fk_Preco_antigo_has_Produto_Produto1_idx` (`Produto_idProduto`),
  KEY `fk_Preco_antigo_has_Produto_Preco_antigo1_idx` (`Preco_antigo_idpreco_antigo`),
  CONSTRAINT `fk_Preco_antigo_has_Produto_Preco_antigo1` FOREIGN KEY (`Preco_antigo_idpreco_antigo`) REFERENCES `preco_antigo` (`idpreco_antigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Preco_antigo_has_Produto_Produto1` FOREIGN KEY (`Produto_idProduto`) REFERENCES `produto` (`idProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico_preco`
--

LOCK TABLES `historico_preco` WRITE;
/*!40000 ALTER TABLE `historico_preco` DISABLE KEYS */;
/*!40000 ALTER TABLE `historico_preco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permissoes`
--

DROP TABLE IF EXISTS `permissoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permissoes` (
  `Codigo_permissao` int(11) NOT NULL,
  `Permissao` varchar(45) NOT NULL,
  PRIMARY KEY (`Codigo_permissao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissoes`
--

LOCK TABLES `permissoes` WRITE;
/*!40000 ALTER TABLE `permissoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preco_antigo`
--

DROP TABLE IF EXISTS `preco_antigo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `preco_antigo` (
  `idpreco_antigo` int(11) NOT NULL,
  `pa_valor` float DEFAULT NULL,
  PRIMARY KEY (`idpreco_antigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preco_antigo`
--

LOCK TABLES `preco_antigo` WRITE;
/*!40000 ALTER TABLE `preco_antigo` DISABLE KEYS */;
/*!40000 ALTER TABLE `preco_antigo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `idProduto` int(11) NOT NULL,
  `produto_nomeveg` varchar(50) NOT NULL,
  `produto_especieveg` varchar(50) DEFAULT NULL,
  `produto_preco` float NOT NULL,
  `produto_quantidade` float DEFAULT NULL,
  `Unidade_quantidade_idUnidade_quantidade` int(11) NOT NULL,
  PRIMARY KEY (`idProduto`,`Unidade_quantidade_idUnidade_quantidade`),
  KEY `fk_Produto_Unidade_quantidade1_idx` (`Unidade_quantidade_idUnidade_quantidade`),
  CONSTRAINT `fk_Produto_Unidade_quantidade1` FOREIGN KEY (`Unidade_quantidade_idUnidade_quantidade`) REFERENCES `piteco`.`unidade_quantidade` (`idUnidade_quantidade`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipouser`
--

DROP TABLE IF EXISTS `tipouser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipouser` (
  `id_tipo` int(11) NOT NULL,
  `tipo_nome` varchar(45) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipouser`
--

LOCK TABLES `tipouser` WRITE;
/*!40000 ALTER TABLE `tipouser` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipouser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidade_quantidade`
--

DROP TABLE IF EXISTS `unidade_quantidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidade_quantidade` (
  `idUnidade_quantidade` int(11) NOT NULL,
  `uq_tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUnidade_quantidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidade_quantidade`
--

LOCK TABLES `unidade_quantidade` WRITE;
/*!40000 ALTER TABLE `unidade_quantidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `unidade_quantidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `usuario_nome` varchar(70) NOT NULL,
  `usuario_cpf` char(11) NOT NULL,
  `usuario_cnpj` char(14) DEFAULT NULL,
  `usuario_datanascimento` date NOT NULL,
  `usuario_telefone` varchar(11) DEFAULT NULL,
  `usuario_senha` varchar(45) NOT NULL,
  `usuario_email` varchar(100) NOT NULL,
  `TipoUser_id_tipo` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_Usuario_TipoUser1_idx` (`TipoUser_id_tipo`),
  CONSTRAINT `fk_Usuario_TipoUser1` FOREIGN KEY (`TipoUser_id_tipo`) REFERENCES `piteco`.`tipouser` (`id_tipo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_has_permissoes`
--

DROP TABLE IF EXISTS `usuario_has_permissoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_has_permissoes` (
  `Usuario_idUsuario` int(11) NOT NULL,
  `Permissoes_Codigo_permissao` int(11) NOT NULL,
  PRIMARY KEY (`Usuario_idUsuario`,`Permissoes_Codigo_permissao`),
  KEY `fk_Usuario_has_Permissoes_Permissoes1_idx` (`Permissoes_Codigo_permissao`),
  KEY `fk_Usuario_has_Permissoes_Usuario_idx` (`Usuario_idUsuario`),
  CONSTRAINT `fk_Usuario_has_Permissoes_Permissoes1` FOREIGN KEY (`Permissoes_Codigo_permissao`) REFERENCES `permissoes` (`Codigo_permissao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_has_Permissoes_Usuario` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_has_permissoes`
--

LOCK TABLES `usuario_has_permissoes` WRITE;
/*!40000 ALTER TABLE `usuario_has_permissoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_has_permissoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `idVenda` int(11) NOT NULL,
  `venda_valor` float NOT NULL,
  `venda_data` date NOT NULL,
  `Usuario_idUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idVenda`),
  KEY `fk_Venda_Usuario1_idx` (`Usuario_idUsuario`),
  CONSTRAINT `fk_Venda_Usuario1` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda_produto`
--

DROP TABLE IF EXISTS `venda_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda_produto` (
  `Venda_idVenda` int(11) NOT NULL,
  `Produto_idProduto` int(11) NOT NULL,
  `Produto_Unidade_quantidade_idUnidade_quantidade` int(11) NOT NULL,
  `vp_quantidade` float DEFAULT NULL,
  `vp_valor` float DEFAULT NULL,
  PRIMARY KEY (`Venda_idVenda`,`Produto_idProduto`,`Produto_Unidade_quantidade_idUnidade_quantidade`),
  KEY `fk_Venda_has_Produto_Produto1_idx` (`Produto_idProduto`,`Produto_Unidade_quantidade_idUnidade_quantidade`),
  KEY `fk_Venda_has_Produto_Venda1_idx` (`Venda_idVenda`),
  CONSTRAINT `fk_Venda_has_Produto_Produto1` FOREIGN KEY (`Produto_idProduto`, `Produto_Unidade_quantidade_idUnidade_quantidade`) REFERENCES `produto` (`idProduto`, `Unidade_quantidade_idUnidade_quantidade`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venda_has_Produto_Venda1` FOREIGN KEY (`Venda_idVenda`) REFERENCES `venda` (`idVenda`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda_produto`
--

LOCK TABLES `venda_produto` WRITE;
/*!40000 ALTER TABLE `venda_produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda_produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-25  9:49:02
