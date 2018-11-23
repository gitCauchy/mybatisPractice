/*
 Navicat Premium Data Transfer

 Source Server         : Cauchy
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 23/11/2018 19:37:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `id` int(11) NOT NULL,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` float(10, 1) NOT NULL,
  `detail` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `pic` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `creattime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES (1, 'milk', 3.0, 'milk', 'milk', '2018-11-21 16:29:49');
INSERT INTO `item` VALUES (2, 'chicken', 4.0, 'chicken', 'chicken', '2018-09-25 00:12:07');
INSERT INTO `item` VALUES (3, 'beef', 5.0, 'beef', 'beef', '2018-08-27 00:12:26');
INSERT INTO `item` VALUES (4, 'apple', 6.0, 'apple', 'apple', '2018-09-25 00:13:03');

SET FOREIGN_KEY_CHECKS = 1;
