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

 Date: 23/11/2018 19:38:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail`  (
  `id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL COMMENT '订单id',
  `item_id` int(11) NOT NULL COMMENT '商品id',
  `item_num` int(11) NULL DEFAULT NULL COMMENT '购买商品数量',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `order_id`(`order_id`) USING BTREE,
  INDEX `items_id`(`item_id`) USING BTREE,
  CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderdetail
-- ----------------------------
INSERT INTO `orderdetail` VALUES (1, 3, 1, 2);
INSERT INTO `orderdetail` VALUES (2, 3, 2, 2);
INSERT INTO `orderdetail` VALUES (3, 4, 3, 2);
INSERT INTO `orderdetail` VALUES (4, 4, 4, 2);
INSERT INTO `orderdetail` VALUES (5, 1, 1, 1);
INSERT INTO `orderdetail` VALUES (6, 1, 2, 1);
INSERT INTO `orderdetail` VALUES (7, 1, 3, 1);
INSERT INTO `orderdetail` VALUES (8, 2, 2, 3);
INSERT INTO `orderdetail` VALUES (9, 2, 4, 1);
INSERT INTO `orderdetail` VALUES (10, 9, 3, 9);
INSERT INTO `orderdetail` VALUES (11, 5, 1, 4);
INSERT INTO `orderdetail` VALUES (12, 6, 4, 6);
INSERT INTO `orderdetail` VALUES (13, 7, 2, 1);
INSERT INTO `orderdetail` VALUES (14, 8, 4, 2);

SET FOREIGN_KEY_CHECKS = 1;
