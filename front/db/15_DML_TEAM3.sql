
DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`me_id`	varchar(20)	primary key  NOT NULL,
	`me_pw`	varchar(20)	NOT NULL,
	`me_name`	varchar(20) unique not	NULL,
	`me_email`	varchar(50)	NOT NULL,
	`me_admin`	varchar(5)	NOT NULL
);

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
	`po_num`	int primary key auto_increment	NOT NULL,
	`po_content`	varchar(200)	NOT NULL,
	`po_title`	varchar(30)	NOT NULL,
	`po_view`	int	NOT NULL,
	`po_me_id`	varchar(20)	NOT NULL,
	`po_bo_num`	int	NOT NULL,
	`po_me_name`	varchar(20) NOT	NULL
);

DROP TABLE IF EXISTS `board`;

CREATE TABLE `board` (
	`bo_num`	int	primary key auto_increment NOT NULL,
	`bo_title`	varchar(30)	NOT NULL,
	`bo_ca_title`	varchar(30)	NOT NULL
);

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
	`ca_title`	varchar(30)	primary key NOT NULL
);

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
	`co_num`	int primary key auto_increment	NOT NULL,
	`co_content`	varchar(100)	NOT NULL,
	`co_po_num`	int NOT NULL
);



ALTER TABLE `post` ADD CONSTRAINT `FK_member_TO_post_1` FOREIGN KEY (
	`po_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `post` ADD CONSTRAINT `FK_board_TO_post_1` FOREIGN KEY (
	`po_bo_num`
)
REFERENCES `board` (
	`bo_num`
);

ALTER TABLE `board` ADD CONSTRAINT `FK_category_TO_board_1` FOREIGN KEY (
	`bo_ca_title`
)
REFERENCES `category` (
	`ca_title`
);

ALTER TABLE `comment` ADD CONSTRAINT `FK_post_TO_comment_1` FOREIGN KEY (
	`co_po_num`
)
REFERENCES `post` (
	`po_num`
);

