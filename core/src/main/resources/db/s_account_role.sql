/*
 Navicat MySQL Data Transfer

 Source Server         : 127.0.0.1_java
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : localhost:3306
 Source Schema         : chaos-core

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 05/02/2018 14:57:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for s_account_role
-- ----------------------------
DROP TABLE IF EXISTS `s_account_role`;
CREATE TABLE `s_account_role`  (
  `a_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户ID',
  `r_id` bigint(15) NULL DEFAULT NULL COMMENT '角色ID'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色关联表\r\n\r\n\r\n\r\n' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of s_account_role
-- ----------------------------
INSERT INTO `s_account_role` VALUES ('1', 1);

SET FOREIGN_KEY_CHECKS = 1;
