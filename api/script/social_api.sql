DROP DATABASE IF EXISTS social_api;
CREATE DATABASE social_api;
USE social_api;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

/*Table structure for table `tb_city` */

DROP TABLE IF EXISTS `tb_city`;

CREATE TABLE `tb_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(20) DEFAULT NULL COMMENT '城市名称',
  `hot` char(1) DEFAULT NULL COMMENT '是否热门',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市表';

/*Data for the table `tb_city` */

insert into `tb_city`(`id`,`name`,`hot`) values
(1,'北京','1'),
(2,'上海','1'),
(3,'广州','1'),
(4,'深圳','1'),
(5,'天津','0'),
(6,'重庆','0'),
(7,'西安','0');

/*Table structure for table `tb_label` */

DROP TABLE IF EXISTS `tb_label`;

CREATE TABLE `tb_label` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签ID',
  `labelname` varchar(100) DEFAULT NULL COMMENT '标签名称',
  `state` varchar(1) DEFAULT NULL COMMENT '状态',
  `count` bigint(20) DEFAULT NULL COMMENT '使用数量',
  `recommend` varchar(1) DEFAULT NULL COMMENT '是否推荐',
  `fans` bigint(20) DEFAULT NULL COMMENT '粉丝数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签表';

/*Data for the table `tb_label` */

insert into `tb_label`(`id`,`labelname`,`state`,`count`,`recommend`,`fans`) values
(1,'java','1',NULL,NULL,NULL),
(2,'PHP','1',NULL,NULL,NULL),
(3,'C++','1',NULL,NULL,NULL),
(4,'python','1',NULL,NULL,NULL);

/*Table structure for table `tb_city_label` */

DROP TABLE IF EXISTS `tb_city_label`;

CREATE TABLE `tb_city_label` (
  `city_id` int(11) NOT NULL COMMENT '城市id',
  `label_id` int(11) NOT NULL COMMENT '标签id',
  PRIMARY KEY (`city_id`, `label_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市标签关联表';

/*Data for the table `tb_city_label` */

insert into `tb_city_label` (`city_id`,`label_id`) values
(1,1),
(1,2),
(1,3);

