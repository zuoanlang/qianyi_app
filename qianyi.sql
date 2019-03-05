/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : qianyi

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2019-03-04 06:43:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_category`
-- ----------------------------
DROP TABLE IF EXISTS `tb_category`;
CREATE TABLE `tb_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父类目ID=0时，代表的是一级的类目',
  `name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `status` int(1) DEFAULT '1' COMMENT '状态。可选值:1(正常),2(删除)',
  `sort_order` int(4) DEFAULT NULL COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
  `is_parent` tinyint(1) DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `updated` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`,`status`) USING BTREE,
  KEY `sort_order` (`sort_order`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='内容分类';

-- ----------------------------
-- Records of tb_category
-- ----------------------------
INSERT INTO `tb_category` VALUES ('1', '0', '数据字典', '1', '1', '1', '2019-03-03 18:56:43', '2019-03-03 18:56:48');
INSERT INTO `tb_category` VALUES ('2', '1', '课程分类', '1', '1', '1', '2019-03-03 18:57:38', '2019-03-03 18:57:42');
INSERT INTO `tb_category` VALUES ('3', '2', '新建分类', '1', '1', '0', '2019-03-04 06:15:21', '2019-03-04 06:15:21');
INSERT INTO `tb_category` VALUES ('4', '2', '易经', '1', '1', '0', '2019-03-04 06:17:03', '2019-03-04 06:17:03');
INSERT INTO `tb_category` VALUES ('5', '2', '风水', '1', '1', '0', '2019-03-04 06:17:11', '2019-03-04 06:17:11');
INSERT INTO `tb_category` VALUES ('6', '2', '新建分类', '1', '1', '0', '2019-03-04 06:17:14', '2019-03-04 06:17:14');

-- ----------------------------
-- Table structure for `tb_comment`
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment` (
  `comment_id` varchar(20) NOT NULL,
  `comment_user_id` varchar(20) DEFAULT NULL,
  `commentary_subject_id` varchar(20) DEFAULT NULL,
  `comment_type` char(1) DEFAULT NULL,
  `comment_father_id` varchar(20) DEFAULT NULL,
  `comment_content` varchar(500) DEFAULT NULL,
  `comment_date_time` datetime DEFAULT NULL,
  `effect_flag` char(1) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `remark1` varchar(2000) DEFAULT NULL,
  `remark2` varchar(2000) DEFAULT NULL,
  `remark3` varchar(2000) DEFAULT NULL,
  `remark4` varchar(2000) DEFAULT NULL,
  `remark5` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_course`
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course` (
  `course_id` varchar(20) NOT NULL,
  `course_name` varchar(50) DEFAULT NULL,
  `course_type` char(1) DEFAULT NULL,
  `course_level` char(1) DEFAULT NULL,
  `course_is_online` char(1) DEFAULT NULL,
  `course_price` int(11) DEFAULT NULL,
  `course_img` varchar(50) DEFAULT NULL,
  `course_catalog` text,
  `course_file_path` varchar(50) DEFAULT NULL,
  `course_description` varchar(300) DEFAULT NULL,
  `course_learning_frequency` bigint(20) DEFAULT NULL,
  `course_belongTo` varchar(20) DEFAULT NULL,
  `course_is_hot` char(1) DEFAULT NULL,
  `effect_flag` char(1) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `remark1` varchar(2000) DEFAULT NULL,
  `remark2` varchar(2000) DEFAULT NULL,
  `remark3` varchar(2000) DEFAULT NULL,
  `remark4` varchar(2000) DEFAULT NULL,
  `remark5` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_course
-- ----------------------------
INSERT INTO `tb_course` VALUES ('1', '鬼吹灯1', '1', '1', '1', '199', 'http://image1.com', '第一节，第二节', 'hdfs://course/guichuideng', '盗墓系列', '123', 'tom', '1', '1', '0', '', '', '', '', '');
INSERT INTO `tb_course` VALUES ('3', '鬼吹灯3', '3', '1', '1', '199', 'http://image1.com', '第一节，第二节', 'hdfs://course/guichuideng', '盗墓系列', '123', 'tom', '1', '1', '0', '', '', '', '', '');
INSERT INTO `tb_course` VALUES ('4', '鬼吹灯4', '4', '2', '0', '199', 'http://image1.com', '第一节，第二节', 'hdfs://course/guichuideng', '盗墓系列', '123', 'tom', '1', '1', '0', '', '', '', '', '');
INSERT INTO `tb_course` VALUES ('5', '鬼吹灯5', '1', '1', '1', '199', 'http://image1.com', '第一节，第二节', 'hdfs://course/guichuideng', '盗墓系列', '123', 'tom', '1', '1', '0', '', '', '', '', '');
INSERT INTO `tb_course` VALUES ('6', '鬼吹灯6', '3', '2', '1', '199', 'http://image1.com', '第一节，第二节', 'hdfs://course/guichuideng', '盗墓系列', '123', 'tom', '1', '1', '0', '', '', '', '', '');
INSERT INTO `tb_course` VALUES ('7', '鬼吹灯7', '1', '1', '1', '199', 'http://image1.com', '第一节，第二节', 'hdfs://course/guichuideng', '盗墓系列', '123', 'tom', '1', '1', '0', '', '', '', '', '');
INSERT INTO `tb_course` VALUES ('8', '鬼吹灯8', '2', '2', '1', '199', 'http://image1.com', '第一节，第二节', 'hdfs://course/guichuideng', '盗墓系列', '123', 'tom', '1', '1', '0', '', '', '', '', '');

-- ----------------------------
-- Table structure for `tb_information`
-- ----------------------------
DROP TABLE IF EXISTS `tb_information`;
CREATE TABLE `tb_information` (
  `info_id` varchar(20) NOT NULL,
  `info_type` char(1) DEFAULT NULL,
  `info_writer` varchar(20) DEFAULT NULL,
  `info_title` varchar(50) DEFAULT NULL,
  `info_view_times` bigint(20) DEFAULT NULL,
  `info_details` text,
  `info_img_path` varchar(100) DEFAULT NULL,
  `effect_flag` char(1) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `published_time` datetime DEFAULT NULL,
  `info_source` char(1) DEFAULT NULL,
  `remark5` varchar(2000) DEFAULT NULL,
  `remark4` varchar(2000) DEFAULT NULL,
  `remark3` varchar(2000) DEFAULT NULL,
  `remark2` varchar(2000) DEFAULT NULL,
  `remark1` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_information
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `order_id` varchar(20) NOT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  `good_id` varchar(20) DEFAULT NULL,
  `order_create_time` datetime DEFAULT NULL,
  `order_pay_time` datetime DEFAULT NULL,
  `mode_of_payment` char(1) DEFAULT NULL,
  `order_status` char(1) DEFAULT NULL,
  `order_refund_reason` varchar(500) DEFAULT NULL,
  `order_auditor` varchar(20) DEFAULT NULL,
  `order_amount` int(11) DEFAULT NULL,
  `order_comment` varchar(500) DEFAULT NULL,
  `order_rank` char(1) DEFAULT NULL,
  `effect_flag` char(1) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `remark1` varchar(2000) DEFAULT NULL,
  `remark5` varchar(2000) DEFAULT NULL,
  `remark3` varchar(2000) DEFAULT NULL,
  `remark4` varchar(2000) DEFAULT NULL,
  `remark2` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_order
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_receiption`
-- ----------------------------
DROP TABLE IF EXISTS `tb_receiption`;
CREATE TABLE `tb_receiption` (
  `receipt_id` varchar(20) NOT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  `trade_type` char(1) DEFAULT NULL,
  `trade_date_time` datetime DEFAULT NULL,
  `trade_source` char(1) DEFAULT NULL,
  `trade_detail` varchar(500) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `effect_flag` char(1) DEFAULT NULL,
  `remark1` varchar(2000) DEFAULT NULL,
  `remark5` varchar(2000) DEFAULT NULL,
  `remark3` varchar(2000) DEFAULT NULL,
  `remark2` varchar(2000) DEFAULT NULL,
  `remark4` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`receipt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_receiption
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` varchar(20) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `user_password` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `id_card_no` varchar(30) DEFAULT NULL,
  `is_administrator` char(1) DEFAULT NULL,
  `is_master` char(1) DEFAULT NULL,
  `master_rank` char(1) DEFAULT NULL,
  `is_official` char(1) DEFAULT NULL,
  `master_introduction` varchar(1000) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `effect_flag` char(1) DEFAULT NULL,
  `delete_flag` char(1) DEFAULT NULL,
  `id_card_img1` varchar(100) DEFAULT NULL,
  `id_card_img2` varchar(100) DEFAULT NULL,
  `head_img` varchar(100) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `handphone` varchar(11) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `qq` varchar(15) DEFAULT NULL,
  `weixin` varchar(50) DEFAULT NULL,
  `asign` varchar(300) DEFAULT NULL,
  `profession` varchar(200) DEFAULT NULL,
  `major` varchar(200) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `remark1` varchar(2000) DEFAULT NULL,
  `remark2` varchar(2000) DEFAULT NULL,
  `remark3` varchar(2000) DEFAULT NULL,
  `remark4` varchar(2000) DEFAULT NULL,
  `remark5` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'admin', null, '123', null, null, null, null, null, null, null, null, '1', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
