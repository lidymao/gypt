DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
`user_Id`  int(20) NOT NULL ,
`user_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`true_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`user_password`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`user_address`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`user_card`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`user_qq`  int(20) NULL DEFAULT NULL ,
`user_phone`  int(20) NULL DEFAULT NULL ,
`user_email`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`user_notes`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`wrok_time`  float(255,0) NULL DEFAULT NULL ,
`create_time`  timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '加入时间' ,
PRIMARY KEY (`user_Id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;
