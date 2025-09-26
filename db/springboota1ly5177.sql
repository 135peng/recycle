-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboota1ly5177
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `springboota1ly5177`
--

/*!40000 DROP DATABASE IF EXISTS `springboota1ly5177`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboota1ly5177` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboota1ly5177`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1699686753050 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2023-11-11 06:36:59',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2023-11-11 06:36:59',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2023-11-11 06:36:59',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2023-11-11 06:36:59',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2023-11-11 06:36:59',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2023-11-11 06:36:59',16,'宇宙银河系月球1号','月某','13823888886','是'),(7,'2023-11-11 06:36:59',17,'宇宙银河系黑洞1号','黑某','13823888887','是'),(8,'2023-11-11 06:36:59',18,'宇宙银河系地球1号','地某','13823888888','是'),(1699686753049,'2023-11-11 07:12:32',1699686462045,'某地某大楼305','张三','15211111111','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjifenshangpin`
--

DROP TABLE IF EXISTS `discussjifenshangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjifenshangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='积分商品评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjifenshangpin`
--

LOCK TABLES `discussjifenshangpin` WRITE;
/*!40000 ALTER TABLE `discussjifenshangpin` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussjifenshangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huishoudingdan`
--

DROP TABLE IF EXISTS `huishoudingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huishoudingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huishoubianhao` varchar(200) DEFAULT NULL COMMENT '回收编号',
  `yifumingcheng` varchar(200) DEFAULT NULL COMMENT '衣服名称',
  `huishoushuliang` varchar(200) DEFAULT NULL COMMENT '回收数量',
  `huishouzhuangtai` varchar(200) DEFAULT NULL COMMENT '回收状态',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1699686319643 DEFAULT CHARSET=utf8 COMMENT='回收订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huishoudingdan`
--

LOCK TABLES `huishoudingdan` WRITE;
/*!40000 ALTER TABLE `huishoudingdan` DISABLE KEYS */;
INSERT INTO `huishoudingdan` VALUES (71,'2023-11-11 06:36:59','回收编号1','衣服名称1','回收数量1','已回收','用户账号1','用户姓名1','未支付'),(72,'2023-11-11 06:36:59','回收编号2','衣服名称2','回收数量2','已回收','用户账号2','用户姓名2','未支付'),(73,'2023-11-11 06:36:59','回收编号3','衣服名称3','回收数量3','已回收','用户账号3','用户姓名3','未支付'),(74,'2023-11-11 06:36:59','回收编号4','衣服名称4','回收数量4','已回收','用户账号4','用户姓名4','未支付'),(75,'2023-11-11 06:36:59','回收编号5','衣服名称5','回收数量5','已回收','用户账号5','用户姓名5','未支付'),(76,'2023-11-11 06:36:59','回收编号6','衣服名称6','回收数量6','已回收','用户账号6','用户姓名6','未支付'),(77,'2023-11-11 06:36:59','回收编号7','衣服名称7','回收数量7','已回收','用户账号7','用户姓名7','未支付'),(78,'2023-11-11 06:36:59','回收编号8','衣服名称8','回收数量8','已回收','用户账号8','用户姓名8','未支付'),(1699686040716,'2023-11-11 07:00:39','8888888888','衣服名称8','8','未回收','用户账号8','用户姓名8','未支付'),(1699686319642,'2023-11-11 07:05:18','8888888888','衣服名称8','8','已回收','用户账号8','用户姓名8','未支付');
/*!40000 ALTER TABLE `huishoudingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huishoupaidan`
--

DROP TABLE IF EXISTS `huishoupaidan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huishoupaidan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huishoubianhao` varchar(200) DEFAULT NULL COMMENT '回收编号',
  `yifumingcheng` varchar(200) DEFAULT NULL COMMENT '衣服名称',
  `yifushuliang` varchar(200) DEFAULT NULL COMMENT '衣服数量',
  `shangmenshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `huishougonghao` varchar(200) DEFAULT NULL COMMENT '回收工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1699686026264 DEFAULT CHARSET=utf8 COMMENT='回收派单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huishoupaidan`
--

LOCK TABLES `huishoupaidan` WRITE;
/*!40000 ALTER TABLE `huishoupaidan` DISABLE KEYS */;
INSERT INTO `huishoupaidan` VALUES (61,'2023-11-11 06:36:59','回收编号1','衣服名称1','衣服数量1','2023-11-11 14:36:59','用户账号1','用户姓名1','手机1','地址1','回收工号1','员工姓名1'),(62,'2023-11-11 06:36:59','回收编号2','衣服名称2','衣服数量2','2023-11-11 14:36:59','用户账号2','用户姓名2','手机2','地址2','回收工号2','员工姓名2'),(63,'2023-11-11 06:36:59','回收编号3','衣服名称3','衣服数量3','2023-11-11 14:36:59','用户账号3','用户姓名3','手机3','地址3','回收工号3','员工姓名3'),(64,'2023-11-11 06:36:59','回收编号4','衣服名称4','衣服数量4','2023-11-11 14:36:59','用户账号4','用户姓名4','手机4','地址4','回收工号4','员工姓名4'),(65,'2023-11-11 06:36:59','回收编号5','衣服名称5','衣服数量5','2023-11-11 14:36:59','用户账号5','用户姓名5','手机5','地址5','回收工号5','员工姓名5'),(66,'2023-11-11 06:36:59','回收编号6','衣服名称6','衣服数量6','2023-11-11 14:36:59','用户账号6','用户姓名6','手机6','地址6','回收工号6','员工姓名6'),(67,'2023-11-11 06:36:59','回收编号7','衣服名称7','衣服数量7','2023-11-11 14:36:59','用户账号7','用户姓名7','手机7','地址7','回收工号7','员工姓名7'),(68,'2023-11-11 06:36:59','回收编号8','衣服名称8','衣服数量8','2023-11-11 14:36:59','用户账号8','用户姓名8','手机8','地址8','回收工号8','员工姓名8'),(1699686026263,'2023-11-11 07:00:25','8888888888','衣服名称8','8','2023-11-12 00:00:00','用户账号8','用户姓名8','手机8','地址8','回收工号1','员工姓名1');
/*!40000 ALTER TABLE `huishoupaidan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huishourenyuan`
--

DROP TABLE IF EXISTS `huishourenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huishourenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huishougonghao` varchar(200) NOT NULL COMMENT '回收工号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `yuangongxingming` varchar(200) NOT NULL COMMENT '员工姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `jf` double DEFAULT '0' COMMENT '积分',
  PRIMARY KEY (`id`),
  UNIQUE KEY `huishougonghao` (`huishougonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='回收人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huishourenyuan`
--

LOCK TABLES `huishourenyuan` WRITE;
/*!40000 ALTER TABLE `huishourenyuan` DISABLE KEYS */;
INSERT INTO `huishourenyuan` VALUES (21,'2023-11-11 06:36:59','回收工号1','123456','员工姓名1','男','13823888881','440300199101010001',10000),(22,'2023-11-11 06:36:59','回收工号2','123456','员工姓名2','男','13823888882','440300199202020002',10000),(23,'2023-11-11 06:36:59','回收工号3','123456','员工姓名3','男','13823888883','440300199303030003',10000),(24,'2023-11-11 06:36:59','回收工号4','123456','员工姓名4','男','13823888884','440300199404040004',10000),(25,'2023-11-11 06:36:59','回收工号5','123456','员工姓名5','男','13823888885','440300199505050005',10000),(26,'2023-11-11 06:36:59','回收工号6','123456','员工姓名6','男','13823888886','440300199606060006',10000),(27,'2023-11-11 06:36:59','回收工号7','123456','员工姓名7','男','13823888887','440300199707070007',10000),(28,'2023-11-11 06:36:59','回收工号8','123456','员工姓名8','男','13823888888','440300199808080008',10000);
/*!40000 ALTER TABLE `huishourenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huishouyuyue`
--

DROP TABLE IF EXISTS `huishouyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huishouyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huishoubianhao` varchar(200) DEFAULT NULL COMMENT '回收编号',
  `yifumingcheng` varchar(200) DEFAULT NULL COMMENT '衣服名称',
  `yifutupian` longtext COMMENT '衣服图片',
  `yifushuliang` int(11) DEFAULT NULL COMMENT '衣服数量',
  `huishoujiage` double DEFAULT NULL COMMENT '回收价格',
  `zengsongjifen` double DEFAULT NULL COMMENT '赠送积分',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `yifuxiangqing` longtext COMMENT '衣服详情',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `huishouzhuangtai` varchar(200) DEFAULT NULL COMMENT '回收状态',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `huishoubianhao` (`huishoubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1699686530960 DEFAULT CHARSET=utf8 COMMENT='回收预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huishouyuyue`
--

LOCK TABLES `huishouyuyue` WRITE;
/*!40000 ALTER TABLE `huishouyuyue` DISABLE KEYS */;
INSERT INTO `huishouyuyue` VALUES (51,'2023-11-11 06:36:59','1111111111','衣服名称1','upload/huishouyuyue_yifutupian1.jpg,upload/huishouyuyue_yifutupian2.jpg,upload/huishouyuyue_yifutupian3.jpg',1,1,1,'2023-11-11 14:36:59','用户账号1','用户姓名1','手机1','地址1','衣服详情1','备注1','已回收','是',''),(52,'2023-11-11 06:36:59','2222222222','衣服名称2','upload/huishouyuyue_yifutupian2.jpg,upload/huishouyuyue_yifutupian3.jpg,upload/huishouyuyue_yifutupian4.jpg',2,2,2,'2023-11-11 14:36:59','用户账号2','用户姓名2','手机2','地址2','衣服详情2','备注2','已回收','是',''),(53,'2023-11-11 06:36:59','3333333333','衣服名称3','upload/huishouyuyue_yifutupian3.jpg,upload/huishouyuyue_yifutupian4.jpg,upload/huishouyuyue_yifutupian5.jpg',3,3,3,'2023-11-11 14:36:59','用户账号3','用户姓名3','手机3','地址3','衣服详情3','备注3','已回收','是',''),(54,'2023-11-11 06:36:59','4444444444','衣服名称4','upload/huishouyuyue_yifutupian4.jpg,upload/huishouyuyue_yifutupian5.jpg,upload/huishouyuyue_yifutupian6.jpg',4,4,4,'2023-11-11 14:36:59','用户账号4','用户姓名4','手机4','地址4','衣服详情4','备注4','已回收','是',''),(55,'2023-11-11 06:36:59','5555555555','衣服名称5','upload/huishouyuyue_yifutupian5.jpg,upload/huishouyuyue_yifutupian6.jpg,upload/huishouyuyue_yifutupian7.jpg',5,5,5,'2023-11-11 14:36:59','用户账号5','用户姓名5','手机5','地址5','衣服详情5','备注5','已回收','是',''),(56,'2023-11-11 06:36:59','6666666666','衣服名称6','upload/huishouyuyue_yifutupian6.jpg,upload/huishouyuyue_yifutupian7.jpg,upload/huishouyuyue_yifutupian8.jpg',6,6,6,'2023-11-11 14:36:59','用户账号6','用户姓名6','手机6','地址6','衣服详情6','备注6','已回收','是',''),(57,'2023-11-11 06:36:59','7777777777','衣服名称7','upload/huishouyuyue_yifutupian7.jpg,upload/huishouyuyue_yifutupian8.jpg,upload/huishouyuyue_yifutupian9.jpg',7,7,7,'2023-11-11 14:36:59','用户账号7','用户姓名7','手机7','地址7','衣服详情7','备注7','已回收','是',''),(58,'2023-11-11 06:36:59','8888888888','衣服名称8','upload/huishouyuyue_yifutupian8.jpg,upload/huishouyuyue_yifutupian9.jpg,upload/huishouyuyue_yifutupian10.jpg',8,8,8,'2023-11-11 14:36:59','用户账号8','用户姓名8','手机8','地址8','衣服详情8','备注8','已回收','是',''),(1699686530959,'2023-11-11 07:08:50','回收编号8','衣服名称8','upload/jiuyixinxi_yifutupian8.jpg',8,20,10,'2023-11-11 15:07:58','123','张三','15211111111','某地某大楼305','每个用户可以预约上门回收8件短T,回收完成可以获得积分','有三件小孩短T,5件大人纯色短T','未回收','待审核','');
/*!40000 ALTER TABLE `huishouyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jifenduihuan`
--

DROP TABLE IF EXISTS `jifenduihuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jifenduihuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `duihuanbianhao` varchar(200) DEFAULT NULL COMMENT '兑换编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpintupian` longtext COMMENT '商品图片',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `shuliang` varchar(200) NOT NULL COMMENT '数量',
  `duihuanjifen` double DEFAULT NULL COMMENT '兑换积分',
  `jifen` varchar(200) DEFAULT NULL COMMENT '合计积分',
  `duihuanshijian` datetime DEFAULT NULL COMMENT '兑换时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `yonghujifen` double DEFAULT NULL COMMENT '积分',
  `jf` int(11) DEFAULT '-1' COMMENT '积分',
  PRIMARY KEY (`id`),
  UNIQUE KEY `duihuanbianhao` (`duihuanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1699686707318 DEFAULT CHARSET=utf8 COMMENT='积分兑换';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jifenduihuan`
--

LOCK TABLES `jifenduihuan` WRITE;
/*!40000 ALTER TABLE `jifenduihuan` DISABLE KEYS */;
INSERT INTO `jifenduihuan` VALUES (91,'2023-11-11 06:36:59','1111111111','商品名称1','upload/jifenduihuan_shangpintupian1.jpg,upload/jifenduihuan_shangpintupian2.jpg,upload/jifenduihuan_shangpintupian3.jpg','品牌1','数量1',1,'合计积分1','2023-11-11 14:36:59','用户账号1','用户姓名1',1,10000),(92,'2023-11-11 06:36:59','2222222222','商品名称2','upload/jifenduihuan_shangpintupian2.jpg,upload/jifenduihuan_shangpintupian3.jpg,upload/jifenduihuan_shangpintupian4.jpg','品牌2','数量2',2,'合计积分2','2023-11-11 14:36:59','用户账号2','用户姓名2',2,10000),(93,'2023-11-11 06:36:59','3333333333','商品名称3','upload/jifenduihuan_shangpintupian3.jpg,upload/jifenduihuan_shangpintupian4.jpg,upload/jifenduihuan_shangpintupian5.jpg','品牌3','数量3',3,'合计积分3','2023-11-11 14:36:59','用户账号3','用户姓名3',3,10000),(94,'2023-11-11 06:36:59','4444444444','商品名称4','upload/jifenduihuan_shangpintupian4.jpg,upload/jifenduihuan_shangpintupian5.jpg,upload/jifenduihuan_shangpintupian6.jpg','品牌4','数量4',4,'合计积分4','2023-11-11 14:36:59','用户账号4','用户姓名4',4,10000),(95,'2023-11-11 06:36:59','5555555555','商品名称5','upload/jifenduihuan_shangpintupian5.jpg,upload/jifenduihuan_shangpintupian6.jpg,upload/jifenduihuan_shangpintupian7.jpg','品牌5','数量5',5,'合计积分5','2023-11-11 14:36:59','用户账号5','用户姓名5',5,10000),(96,'2023-11-11 06:36:59','6666666666','商品名称6','upload/jifenduihuan_shangpintupian6.jpg,upload/jifenduihuan_shangpintupian7.jpg,upload/jifenduihuan_shangpintupian8.jpg','品牌6','数量6',6,'合计积分6','2023-11-11 14:36:59','用户账号6','用户姓名6',6,10000),(97,'2023-11-11 06:36:59','7777777777','商品名称7','upload/jifenduihuan_shangpintupian7.jpg,upload/jifenduihuan_shangpintupian8.jpg,upload/jifenduihuan_shangpintupian9.jpg','品牌7','数量7',7,'合计积分7','2023-11-11 14:36:59','用户账号7','用户姓名7',7,10000),(98,'2023-11-11 06:36:59','8888888888','商品名称8','upload/jifenduihuan_shangpintupian8.jpg,upload/jifenduihuan_shangpintupian9.jpg,upload/jifenduihuan_shangpintupian10.jpg','品牌8','数量8',8,'合计积分8','2023-11-11 14:36:59','用户账号8','用户姓名8',8,10000),(1699686707317,'2023-11-11 07:11:46','1699686688872','商品名称5','upload/jifenshangpin_shangpintupian5.jpg','品牌5','1',5,'5','2023-11-11 15:11:28','123','张三',20,-1);
/*!40000 ALTER TABLE `jifenduihuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jifenshangpin`
--

DROP TABLE IF EXISTS `jifenshangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jifenshangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpintupian` longtext COMMENT '商品图片',
  `shangpinjieshao` longtext COMMENT '商品介绍',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `duihuanjifen` double DEFAULT NULL COMMENT '兑换积分',
  `duihuanguize` longtext COMMENT '兑换规则',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='积分商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jifenshangpin`
--

LOCK TABLES `jifenshangpin` WRITE;
/*!40000 ALTER TABLE `jifenshangpin` DISABLE KEYS */;
INSERT INTO `jifenshangpin` VALUES (81,'2023-11-11 06:36:59','商品名称1','upload/jifenshangpin_shangpintupian1.jpg,upload/jifenshangpin_shangpintupian2.jpg,upload/jifenshangpin_shangpintupian3.jpg','商品介绍1','品牌1',1,1,'兑换规则1'),(82,'2023-11-11 06:36:59','商品名称2','upload/jifenshangpin_shangpintupian2.jpg,upload/jifenshangpin_shangpintupian3.jpg,upload/jifenshangpin_shangpintupian4.jpg','商品介绍2','品牌2',2,2,'兑换规则2'),(83,'2023-11-11 06:36:59','商品名称3','upload/jifenshangpin_shangpintupian3.jpg,upload/jifenshangpin_shangpintupian4.jpg,upload/jifenshangpin_shangpintupian5.jpg','商品介绍3','品牌3',3,3,'兑换规则3'),(84,'2023-11-11 06:36:59','商品名称4','upload/jifenshangpin_shangpintupian4.jpg,upload/jifenshangpin_shangpintupian5.jpg,upload/jifenshangpin_shangpintupian6.jpg','商品介绍4','品牌4',4,4,'兑换规则4'),(85,'2023-11-11 06:36:59','商品名称5','upload/jifenshangpin_shangpintupian5.jpg,upload/jifenshangpin_shangpintupian6.jpg,upload/jifenshangpin_shangpintupian7.jpg','商品介绍5','品牌5',4,5,'兑换规则5'),(86,'2023-11-11 06:36:59','商品名称6','upload/jifenshangpin_shangpintupian6.jpg,upload/jifenshangpin_shangpintupian7.jpg,upload/jifenshangpin_shangpintupian8.jpg','商品介绍6','品牌6',6,6,'兑换规则6'),(87,'2023-11-11 06:36:59','商品名称7','upload/jifenshangpin_shangpintupian7.jpg,upload/jifenshangpin_shangpintupian8.jpg,upload/jifenshangpin_shangpintupian9.jpg','商品介绍7','品牌7',7,7,'兑换规则7'),(88,'2023-11-11 06:36:59','商品名称8','upload/jifenshangpin_shangpintupian8.jpg,upload/jifenshangpin_shangpintupian9.jpg,upload/jifenshangpin_shangpintupian10.jpg','<p>商品介绍8这里都是可以根据情况更改信息</p>','品牌8',100,20,'兑换规则8');
/*!40000 ALTER TABLE `jifenshangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiuyiwufenlei`
--

DROP TABLE IF EXISTS `jiuyiwufenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiuyiwufenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiuyiwufenlei` varchar(200) DEFAULT NULL COMMENT '旧衣物分类',
  `image` longtext COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='旧衣物分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiuyiwufenlei`
--

LOCK TABLES `jiuyiwufenlei` WRITE;
/*!40000 ALTER TABLE `jiuyiwufenlei` DISABLE KEYS */;
INSERT INTO `jiuyiwufenlei` VALUES (31,'2023-11-11 06:36:59','旧衣物分类1','upload/jiuyiwufenlei_image1.jpg,upload/jiuyiwufenlei_image2.jpg,upload/jiuyiwufenlei_image3.jpg'),(32,'2023-11-11 06:36:59','旧衣物分类2','upload/jiuyiwufenlei_image2.jpg,upload/jiuyiwufenlei_image3.jpg,upload/jiuyiwufenlei_image4.jpg'),(33,'2023-11-11 06:36:59','旧衣物分类3','upload/jiuyiwufenlei_image3.jpg,upload/jiuyiwufenlei_image4.jpg,upload/jiuyiwufenlei_image5.jpg'),(34,'2023-11-11 06:36:59','旧衣物分类4','upload/jiuyiwufenlei_image4.jpg,upload/jiuyiwufenlei_image5.jpg,upload/jiuyiwufenlei_image6.jpg'),(35,'2023-11-11 06:36:59','旧衣物分类5','upload/jiuyiwufenlei_image5.jpg,upload/jiuyiwufenlei_image6.jpg,upload/jiuyiwufenlei_image7.jpg'),(36,'2023-11-11 06:36:59','旧衣物分类6','upload/jiuyiwufenlei_image6.jpg,upload/jiuyiwufenlei_image7.jpg,upload/jiuyiwufenlei_image8.jpg'),(37,'2023-11-11 06:36:59','旧衣物分类7','upload/jiuyiwufenlei_image7.jpg,upload/jiuyiwufenlei_image8.jpg,upload/jiuyiwufenlei_image9.jpg'),(38,'2023-11-11 06:36:59','旧短T','upload/jiuyiwufenlei_image8.jpg,upload/jiuyiwufenlei_image9.jpg,upload/jiuyiwufenlei_image10.jpg');
/*!40000 ALTER TABLE `jiuyiwufenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiuyixinxi`
--

DROP TABLE IF EXISTS `jiuyixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiuyixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huishoubianhao` varchar(200) DEFAULT NULL COMMENT '回收编号',
  `yifumingcheng` varchar(200) NOT NULL COMMENT '衣服名称',
  `jiuyiwufenlei` varchar(200) NOT NULL COMMENT '旧衣物分类',
  `yifutupian` longtext COMMENT '衣服图片',
  `yifushuliang` int(11) DEFAULT NULL COMMENT '衣服数量',
  `yifuxiangqing` longtext COMMENT '衣服详情',
  `huishoujiage` int(11) DEFAULT NULL COMMENT '回收价格',
  `zengsongjifen` double DEFAULT NULL COMMENT '赠送积分',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `huishouxuqiuxiangqing` longtext COMMENT '回收需求详情',
  `huishoujiezhishijian` datetime DEFAULT NULL COMMENT '回收截止时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='旧衣信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiuyixinxi`
--

LOCK TABLES `jiuyixinxi` WRITE;
/*!40000 ALTER TABLE `jiuyixinxi` DISABLE KEYS */;
INSERT INTO `jiuyixinxi` VALUES (41,'2023-11-11 06:36:59','回收编号1','衣服名称1','旧衣物分类1','upload/jiuyixinxi_yifutupian1.jpg,upload/jiuyixinxi_yifutupian2.jpg,upload/jiuyixinxi_yifutupian3.jpg',1,'衣服详情1',1,1,'2023-11-11 14:36:59','回收需求详情1','2023-11-11 14:36:59'),(42,'2023-11-11 06:36:59','回收编号2','衣服名称2','旧衣物分类2','upload/jiuyixinxi_yifutupian2.jpg,upload/jiuyixinxi_yifutupian3.jpg,upload/jiuyixinxi_yifutupian4.jpg',2,'衣服详情2',2,2,'2023-11-11 14:36:59','回收需求详情2','2023-11-11 14:36:59'),(43,'2023-11-11 06:36:59','回收编号3','衣服名称3','旧衣物分类3','upload/jiuyixinxi_yifutupian3.jpg,upload/jiuyixinxi_yifutupian4.jpg,upload/jiuyixinxi_yifutupian5.jpg',3,'衣服详情3',3,3,'2023-11-11 14:36:59','回收需求详情3','2023-11-11 14:36:59'),(44,'2023-11-11 06:36:59','回收编号4','衣服名称4','旧衣物分类4','upload/jiuyixinxi_yifutupian4.jpg,upload/jiuyixinxi_yifutupian5.jpg,upload/jiuyixinxi_yifutupian6.jpg',4,'衣服详情4',4,4,'2023-11-11 14:36:59','回收需求详情4','2023-11-11 14:36:59'),(45,'2023-11-11 06:36:59','回收编号5','衣服名称5','旧衣物分类5','upload/jiuyixinxi_yifutupian5.jpg,upload/jiuyixinxi_yifutupian6.jpg,upload/jiuyixinxi_yifutupian7.jpg',5,'衣服详情5',5,5,'2023-11-11 14:36:59','回收需求详情5','2023-11-11 14:36:59'),(46,'2023-11-11 06:36:59','回收编号6','衣服名称6','旧衣物分类6','upload/jiuyixinxi_yifutupian6.jpg,upload/jiuyixinxi_yifutupian7.jpg,upload/jiuyixinxi_yifutupian8.jpg',6,'衣服详情6',6,6,'2023-11-11 14:36:59','回收需求详情6','2023-11-11 14:36:59'),(47,'2023-11-11 06:36:59','回收编号7','衣服名称7','旧衣物分类7','upload/jiuyixinxi_yifutupian7.jpg,upload/jiuyixinxi_yifutupian8.jpg,upload/jiuyixinxi_yifutupian9.jpg',7,'衣服详情7',7,7,'2023-11-11 14:36:59','回收需求详情7','2023-11-11 14:36:59'),(48,'2023-11-11 06:36:59','回收编号8','衣服名称8','旧短T','upload/jiuyixinxi_yifutupian8.jpg,upload/jiuyixinxi_yifutupian9.jpg,upload/jiuyixinxi_yifutupian10.jpg',8,'每个用户可以预约上门回收8件短T,回收完成可以获得积分',20,10,'2023-11-11 14:58:44','短T不限尺码,不能由破损,不能有敏感字样','2023-11-13 14:36:59');
/*!40000 ALTER TABLE `jiuyixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` longtext NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (121,'2023-11-11 06:36:59','有梦想，就要努力去实现','不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。','upload/news_picture1.jpg','<p>不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?</p><p>你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。其实，我已经厌倦了你这样说说而已的把戏，我觉得就算我告诉你如何去做，你也不会照做，因为你根本什么都不做。</p><p>真正有行动力的人不需要别人告诉他如何做，因为他已经在做了。就算碰到问题，他也会自己想办法，自己动手去解决或者主动寻求可以帮助他的人，而不是等着别人为自己解决问题。</p><p>首先要学习独立思考。花一点时间想一下自己喜欢什么，梦想是什么，不要别人说想环游世界，你就说你的梦想是环游世界。</p><p>很多人说现实束缚了自己，其实在这个世界上，我们一直都可以有很多选择，生活的决定权也—直都在自己手上，只是我们缺乏行动力而已。</p><p>如果你觉得安于现状是你想要的，那选择安于现状就会让你幸福和满足;如果你不甘平庸，选择一条改变、进取和奋斗的道路，在这个追求的过程中，你也一样会感到快乐。所谓的成功，即是按照自己想要的生活方式生活。最糟糕的状态，莫过于当你想要选择一条不甘平庸、改变、进取和奋斗的道路时，却以一种安于现状的方式生活，最后抱怨自己没有得到想要的人生。</p><p>因为喜欢，你不是在苦苦坚持，也因为喜欢，你愿意投入时间、精力，长久以往，获得成功就是自然而然的事情。</p>'),(122,'2023-11-11 06:36:59','又是一年毕业季','又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。','upload/news_picture2.jpg','<p>又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。</p><p>过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。一直都是晚会的忠实参与者，无论是台前还是幕后，忽然间，角色转变，那种感觉确实难以用语言表达。</p><p>	过去的三年，总是默默地期盼着这个好雨时节，因为这时候，会有灿烂的阳光，会有满目的百花争艳，会有香甜的冰激凌，这是个毕业的季节，当时不经世事的我们会殷切地期待学校那一大堆的活动，期待穿上绚丽的演出服或者礼仪服，站在大礼堂镁光灯下尽情挥洒我们的澎拜的激情。</p><p>百感交集，隔岸观火与身临其境的感觉竟是如此不同。从来没想过一场晚会送走的是我们自己的时候会是怎样的感情，毕业就真的意味着结束吗?倔强的我们不愿意承认，谢谢学弟学妹们慷慨的将这次的主题定为“我们在这里”。我知道，这可能是他们对我们这些过来人的尊敬和施舍。</p><p>没有为这场晚会排练、奔波，没有为班级、学生会、文学院出点力，还真有点不习惯，百般无奈中，用“工作忙”个万能的借口来搪塞自己，欺骗别人。其实自己心里明白，那只是在逃避，只是不愿面对繁华落幕后的萧条和落寞。大四了，大家各奔东西，想凑齐班上的人真的是难上加难，敏燕从越南回来，刚落地就匆匆回了学校，那么恋家的人也启程回来了，睿睿学姐也是从家赶来跟我们团圆。大家—如既往的寒暄、打趣、调侃对方，似乎一切又回到了当初的单纯美好。</p><p>看着舞台上活泼可爱的学弟学妹们，如同一群机灵的小精灵，清澈的眼神，稚嫩的肢体，轻快地步伐，用他们那热情洋溢的舞姿渲染着在场的每一个人，我知道，我不应该羡慕嫉妒他们，不应该顾自怜惜逝去的青春，不应该感叹夕阳无限好，曾经，我们也拥有过，曾经，我们也年轻过，曾经，我们也灿烂过。我深深地告诉自己，人生的每个阶段都是美的，年轻有年轻的活力，成熟也有成熟的魅力。多—份稳重、淡然、优雅，也是漫漫时光掠影遗留下的.珍贵赏赐。</p>'),(123,'2023-11-11 06:36:59','挫折路上，坚持常在心间','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture3.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>'),(124,'2023-11-11 06:36:59','挫折是另一个生命的开端','当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。','upload/news_picture4.jpg','<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪状态和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>'),(125,'2023-11-11 06:36:59','你要去相信，没有到不了的明天','有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。','upload/news_picture5.jpg','<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而至，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>'),(126,'2023-11-11 06:36:59','离开是一种痛苦，是一种勇气，但同样也是一个考验，是一个新的开端','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture6.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>'),(127,'2023-11-11 06:36:59','Leave未必是一种痛苦','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture7.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>'),(128,'2023-11-11 06:36:59','坚持才会成功','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture8.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'jifenduihuan' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` longtext COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double NOT NULL DEFAULT '0' COMMENT '价格',
  `discountprice` double DEFAULT '0' COMMENT '折扣价格',
  `total` double NOT NULL DEFAULT '0' COMMENT '总价格',
  `discounttotal` double DEFAULT '0' COMMENT '折扣总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) DEFAULT NULL COMMENT '收货人',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `logistics` longtext COMMENT '物流',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=1699686760112 DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1699686760111,'2023-11-11 07:12:39','2023111115123369946019','jifenduihuan',1699686462045,1699686707317,'商品名称5','upload/jifenshangpin_shangpintupian5.jpg',1,-1,-1,-1,-1,2,'已支付','某地某大楼305','15211111111','张三','',NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'admin','users','管理员','2pkof3edywne2fh525oki55i6xfq3jfh','2023-11-11 06:55:46','2023-11-11 08:09:47'),(2,21,'回收工号1','huishourenyuan','回收人员','bsg2gyt2b1on8kw61su06e391aty9sn3','2023-11-11 07:04:45','2023-11-11 08:04:45'),(3,1699686462045,'123','yonghu','用户','u2a5mpibodnvrqeqilw5u1abkbbj0kr6','2023-11-11 07:07:49','2023-11-11 08:10:33');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2023-11-11 06:36:59');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `touxiang` longtext COMMENT '头像',
  `jifen` int(11) NOT NULL COMMENT '积分',
  `jf` double DEFAULT '0' COMMENT '积分',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1699686462046 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2023-11-11 06:36:59','用户账号1','123456','用户姓名1','男','13823888881','地址1','upload/yonghu_touxiang1.jpg',1,10000),(12,'2023-11-11 06:36:59','用户账号2','123456','用户姓名2','男','13823888882','地址2','upload/yonghu_touxiang2.jpg',2,10000),(13,'2023-11-11 06:36:59','用户账号3','123456','用户姓名3','男','13823888883','地址3','upload/yonghu_touxiang3.jpg',3,10000),(14,'2023-11-11 06:36:59','用户账号4','123456','用户姓名4','男','13823888884','地址4','upload/yonghu_touxiang4.jpg',4,10000),(15,'2023-11-11 06:36:59','用户账号5','123456','用户姓名5','男','13823888885','地址5','upload/yonghu_touxiang5.jpg',5,10000),(16,'2023-11-11 06:36:59','用户账号6','123456','用户姓名6','男','13823888886','地址6','upload/yonghu_touxiang6.jpg',6,10000),(17,'2023-11-11 06:36:59','用户账号7','123456','用户姓名7','男','13823888887','地址7','upload/yonghu_touxiang7.jpg',7,10000),(18,'2023-11-11 06:36:59','用户账号8','123456','用户姓名8','男','13823888888','地址8','upload/yonghu_touxiang8.jpg',8,10000),(1699686462045,'2023-11-11 07:07:42','123','111','张三','女','15211111111','地球村','upload/1699686813035.jpg',15,21);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-20 18:49:43
