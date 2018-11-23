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

 Date: 23/11/2018 19:38:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Cindy', '1992-6-1', 'M', 'Guangxi');
INSERT INTO `user` VALUES (2, 'Lucy', '1996-7-1', 'W', 'Shanghai');
INSERT INTO `user` VALUES (3, 'Tom', '1995-8-1', 'M', 'GuangDong');
INSERT INTO `user` VALUES (4, 'Maria', '1995-9-1', 'W', 'ShenZhen');
INSERT INTO `user` VALUES (5, 'Cassie', '1993-10-1', 'W', 'Shanghai');
INSERT INTO `user` VALUES (6, 'Fern', '1996-7-1', 'M', 'Jilin');
INSERT INTO `user` VALUES (7, 'Alice', '1986-10-25', 'W', 'Chifeng');
INSERT INTO `user` VALUES (8, '朱初一', '1997-1-1', 'W', 'Hefei');
INSERT INTO `user` VALUES (9, '朱重八', '1999-8-8', 'M', 'NanChang');

SET FOREIGN_KEY_CHECKS = 1;
