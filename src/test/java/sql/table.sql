DROP TABLE IF EXISTS `trx_apply_info_1`;
CREATE TABLE `trx_apply_info_1`(
 `apply_id` BIGINT(20) NOT NULL COMMENT '唯一主键',
 `apply_no` BIGINT(20) NOT NULL COMMENT '申请编号',
 `user_no` BIGINT(20) NOT NULL COMMENT '用户号',
 `apply_status` VARCHAR(10) NOT`trx_apply_info_1``trx_apply_info_2` NULL COMMENT '案件状态',
 PRIMARY KEY (`apply_id`)USING BTREE

)ENGINE=INNODB CHARACTER SET=utf8;


DROP TABLE IF EXISTS `trx_apply_info_2`;
CREATE TABLE `trx_apply_info_2` (
 `apply_id` BIGINT(20) NOT NULL COMMENT '唯一主键',
 `apply_no` BIGINT(20) NOT NULL COMMENT '申请编号',
 `user_no` BIGINT(20) NOT NULL COMMENT '用户号',
 `apply_status` VARCHAR(10) NOT NULL COMMENT '案件状态',
 PRIMARY KEY (`apply_id`)USING BTREE

)ENGINE=INNODB CHARACTER SET=utf8;