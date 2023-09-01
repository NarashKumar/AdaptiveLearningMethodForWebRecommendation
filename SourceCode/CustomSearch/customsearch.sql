/*
SQLyog - Free MySQL GUI v5.13
Host - 5.0.22-community-nt : Database - customsearch
*********************************************************************
Server version : 5.0.22-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `customsearch`;

USE `customsearch`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `click` */

DROP TABLE IF EXISTS `click`;

CREATE TABLE `click` (
  `s.no` int(11) NOT NULL auto_increment,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) default NULL,
  PRIMARY KEY  (`username`),
  UNIQUE KEY `s.no` (`s.no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `click` */

insert into `click` (`s.no`,`username`,`password`) values (1,'muj','muj');

/*Table structure for table `clickthroughs` */

DROP TABLE IF EXISTS `clickthroughs`;

CREATE TABLE `clickthroughs` (
  `s.no` int(11) NOT NULL auto_increment,
  `username` varchar(50) default NULL,
  `query` varchar(999) default NULL,
  `clickthroughs1` varchar(999) default NULL,
  `minedword` varchar(999) default NULL,
  UNIQUE KEY `s.no` (`s.no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `clickthroughs` */

SET SQL_MODE=@OLD_SQL_MODE;