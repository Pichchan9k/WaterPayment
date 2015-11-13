-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Nov 13, 2015 at 09:06 AM
-- Server version: 5.0.51
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Database: `waterpayment`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `usehistory`
-- 

CREATE TABLE `usehistory` (
  `h_id` int(11) NOT NULL auto_increment,
  `h_unit` int(11) NOT NULL,
  `h_total` int(11) NOT NULL,
  `h_status` varchar(10) NOT NULL default 'not paid',
  `c_id` int(11) NOT NULL,
  `h_date` varchar(20) NOT NULL,
  PRIMARY KEY  (`h_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

-- 
-- Dumping data for table `usehistory`
-- 

INSERT INTO `usehistory` VALUES (1, 19, 190, 'Paid', 1, '2015-1-7');
INSERT INTO `usehistory` VALUES (2, 14, 140, 'Paid', 1, '2015-2-3');
INSERT INTO `usehistory` VALUES (3, 22, 220, 'Paid', 1, '2015-3-3');
INSERT INTO `usehistory` VALUES (4, 17, 170, 'Paid', 1, '2015-4-11');
INSERT INTO `usehistory` VALUES (5, 23, 230, 'Paid', 1, '2015-5-6');
INSERT INTO `usehistory` VALUES (6, 12, 120, 'Paid', 1, '2015-6-1');
INSERT INTO `usehistory` VALUES (7, 23, 230, 'Paid', 1, '2015-5-6');
INSERT INTO `usehistory` VALUES (8, 12, 120, 'Paid', 1, '2015-6-1');
INSERT INTO `usehistory` VALUES (9, 30, 300, 'Not Paid', 1, '2015-7-3');
INSERT INTO `usehistory` VALUES (10, 28, 280, 'Not Paid', 1, '2015-8-3');

-- --------------------------------------------------------

-- 
-- Table structure for table `user`
-- 

CREATE TABLE `user` (
  `c_id` int(11) NOT NULL auto_increment,
  `c_username` varchar(20) NOT NULL,
  `c_password` varchar(20) NOT NULL,
  `w_id` int(11) NOT NULL default '0',
  PRIMARY KEY  (`c_id`),
  UNIQUE KEY `c_username` (`c_username`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

-- 
-- Dumping data for table `user`
-- 

INSERT INTO `user` VALUES (1, 'yom', 'yom', 3);
INSERT INTO `user` VALUES (3, 'iing', 'iing', 2);
INSERT INTO `user` VALUES (4, 'korn', 'korn', 1);
INSERT INTO `user` VALUES (5, 'mak', 'mak', 5);
INSERT INTO `user` VALUES (6, 'bank', 'bank', 0);
INSERT INTO `user` VALUES (7, 'kong', 'kong', 0);
INSERT INTO `user` VALUES (8, 'kwang', 'kwang', 0);
INSERT INTO `user` VALUES (9, 'jjj', 'jjj', 0);
INSERT INTO `user` VALUES (10, 'user', 'user', 7);
INSERT INTO `user` VALUES (11, 'gaz', 'gaz', 6);

-- --------------------------------------------------------

-- 
-- Table structure for table `wateruser`
-- 

CREATE TABLE `wateruser` (
  `w_id` int(11) NOT NULL auto_increment,
  `w_branchno` int(2) NOT NULL,
  `w_areano` int(2) NOT NULL,
  `w_registrationno` int(7) NOT NULL,
  `w_address` varchar(200) NOT NULL,
  `w_name` varchar(50) NOT NULL,
  PRIMARY KEY  (`w_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

-- 
-- Dumping data for table `wateruser`
-- 

INSERT INTO `wateruser` VALUES (1, 21, 12, 2014121, '299/54 ถนนสามวา แขวงบางชัน เขตสามวาตะวันตก กรุงเทพ 10510', 'นายพิชชนก นุชปาน');
INSERT INTO `wateruser` VALUES (3, 12, 13, 1213123, '433 หมู่บ้านสินสาธร ถนนอาราว ตำบลจตุจักร อำเภอเขอะเขิล จังหวัดกรุงเทย', 'นายยม คนจริง');
INSERT INTO `wateruser` VALUES (4, 11, 12, 1231231, '20 หมู่บ้านสาย ตำบลของเธอ อำเภอของฉัน จังหวัดของเรา 10888', 'นางสาวอิง กระทิงวิงหนี');
INSERT INTO `wateruser` VALUES (5, 13, 14, 1314134, '22/19 ชั้น 13  คอนโดสูงมาก เขตลาดยาง จังหวัดสุโขทัย 1230', 'นายเจ จอมโยเย');
INSERT INTO `wateruser` VALUES (6, 99, 99, 9999999, 'บ้านเลขที่ 99/99 หมู่บ้าน 99 แขวง 99 อำเภอ 99 จังหวัดกรุงเทพ 10222', 'นายเต็มที่ และเต็มใจ');
INSERT INTO `wateruser` VALUES (7, 88, 88, 8888888, 'บ้านเลขที่ 99/99 หมู่บ้าน 88 แขวง 88 อำเภอ 88 จังหวัดกรุงเทพ 18888', 'นายสาวเต็มใจ และเต็มที่ ');
