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

 Date: 23/11/2018 19:38:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '下单用户id',
  `number` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '购买数量\r\n购买数量',
  `createtime` datetime(0) NOT NULL COMMENT '创建时间',
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 2, '1000013', '2018-11-05 16:19:00', NULL);
INSERT INTO `orders` VALUES (2, 3, '1000014', '2018-11-05 16:19:32', NULL);
INSERT INTO `orders` VALUES (3, 1, '1000010', '2018-09-21 12:22:22', NULL);
INSERT INTO `orders` VALUES (4, 1, '1000011', '2018-09-21 19:37:08', NULL);
INSERT INTO `orders` VALUES (5, 2, '1000012', '2018-09-05 19:37:34', NULL);
INSERT INTO `orders` VALUES (6, 4, '1000015', '2018-11-05 16:20:06', NULL);
INSERT INTO `orders` VALUES (7, 7, '1000017', '2018-11-03 16:20:54', NULL);
INSERT INTO `orders` VALUES (8, 6, '1000016', '2018-11-22 16:20:30', NULL);
INSERT INTO `orders` VALUES (9, 8, '1000018', '2018-11-29 16:21:24', NULL);
INSERT INTO `orders` VALUES (10, 1, '1000019', '2018-11-05 16:21:56', NULL);

SET FOREIGN_KEY_CHECKS = 1;
