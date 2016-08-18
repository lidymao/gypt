DROP TABLE IF EXISTS `organization_info`;

CREATE TABLE `organization_info` (
`org_id`  int(30) NOT NULL AUTO_INCREMENT ,
`org_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`org_type`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`PapersType`  int(2) NULL DEFAULT NULL COMMENT '证件类型' ,
`PapersCode`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '证件号码' ,
`legal person`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '法人' ,
`Phone`  int(25) NULL DEFAULT NULL COMMENT '电话' ,
`Postcode`  int(25) NULL DEFAULT NULL COMMENT '邮编' ,
`Fax`  int(25) NULL DEFAULT NULL ,
`SetUp_time`  datetime NULL DEFAULT NULL COMMENT '成立时间' ,
`create_time`  timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '加入时间' ,
PRIMARY KEY (`org_id`)
)

ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;
