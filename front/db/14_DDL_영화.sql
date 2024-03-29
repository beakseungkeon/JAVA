
drop database if exists`movie`;
create database if not exists `movie`;

use`movie`;

DROP TABLE IF EXISTS `Character`;

CREATE TABLE `Character` (
	`ch_num`	int	primary key auto_increment,
	`ch_name`	varchar(30)	NOT NULL,
	`ch_birthday`	date	NOT NULL,
	`ch_detail`	text	NOT NULL,
	`ch_na_name`	varchar(30)	NOT NULL
);

DROP TABLE IF EXISTS `nation`;

CREATE TABLE `nation` (
	`na_name`	varchar(30)	primary key
);

DROP TABLE IF EXISTS `movie_person`;

CREATE TABLE `movie_person` (
	`mp_num`	int	primary key auto_increment,
	`mp_role`	char(2)	NOT NULL,
	`mp_pic`	varchar(50)	NULL,
	`mp_ch_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
	`mo_num`	int	primary key auto_increment,
	`mo_totle`	varchar(50)	NOT NULL,
	`mo_date`	date	NOT NULL,
	`mo_content`	text	NOT NULL,
	`mo_running`	int	NOT NULL,
	`mo_ag_name`	varchar(10)	NOT NULL
);

DROP TABLE IF EXISTS `movie_file`;

CREATE TABLE `movie_file` (
	`mf_num`	int	primary key auto_increment,
	`mf_filename`	varchar(50)	NOT NULL,
	`mf_type`	varchar(10)	NOT NULL,
	`mf_mo_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `age`;

CREATE TABLE `age` (
	`ag_name`	varchar(10)	primary key 
);

DROP TABLE IF EXISTS `genre`;

CREATE TABLE `genre` (
	`gr_name`	varchar(10)	primary key 
);

DROP TABLE IF EXISTS `region`;

CREATE TABLE `region` (
	`re_name`	varchar(10)	primary key 
);

DROP TABLE IF EXISTS `theater`;

CREATE TABLE `theater` (
	`th_num`	int	primary key auto_increment,
	`th_name`	varchar(10)	NOT NULL,
	`th_addr`	varchar(100)	NOT NULL,
	`th_seat`	int	NOT NULL default 0,
	`th_screen`	int	NOT NULL,
	`th_re_name`	varchar(10)	NOT NULL
);

DROP TABLE IF EXISTS `screen`;

CREATE TABLE `screen` (
	`sc_num`	int	primary key auto_increment,
	`sc_name`	int	NOT NULL,
	`sc_seat`	int	NOT NULL default 0,
	`sc_th_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `seat`;

CREATE TABLE `seat` (
	`se_num`	int	primary key auto_increment,
	`se_name`	varchar(3)	NOT NULL,
	`se_sc_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`me_id`	varchar(20)	primary key ,
	`me_pw`	varchar(20)	NOT NULL,
    `me_authority` varchar(5) NOT NULL default'USER'
);

DROP TABLE IF EXISTS `schedule`;

CREATE TABLE `schedule` (
	`sh_num`	int	primary key auto_increment,
	`sh_date`	date	NOT NULL,
	`sh_time`	time	NOT NULL,
	`sh_morning`	int	NOT NULL default 0,
	`sh_sc_num`	int	NOT NULL,
	`sh_mo_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `join`;

CREATE TABLE `join` (
	`jo_num`	int	primary key auto_increment,
	`jo_casting`	varchar(20)	NOT NULL,
	`jo_mp_num`	int	NOT NULL,
	`jo_mo_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `production_nation`;

CREATE TABLE `production_nation` (
	`pn_num`	int	primary key auto_increment,
	`pn_na_name`	varchar(30) NOT NULL,
	`pn_mo_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `genre_include`;

CREATE TABLE `genre_include` (
	`gi_num`	int	primary key auto_increment,
	`gi_gr_name`	varchar(10)	NOT NULL,
	`gi_mo_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `ticketing`;

CREATE TABLE `ticketing` (
	`ti_num`	int	primary key auto_increment,
	`ti_adult`	int	NULL,
	`ti_teenager`	int	NULL,
	`ti_total_price`	int	NULL,
	`ti_me_id`	varchar(20)	NOT NULL,
	`ti_sh_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `ticketing-list`;

CREATE TABLE `ticketing-list` (
	`tl_num`	int	primary key auto_increment,
	`tl_se_num`	int	NOT NULL,
	`tl_ti_num`	int	NOT NULL
);



ALTER TABLE `Character` ADD CONSTRAINT `FK_nation_TO_Character_1` FOREIGN KEY (
	`ch_na_name`
)
REFERENCES `nation` (
	`na_name`
);

ALTER TABLE `movie_person` ADD CONSTRAINT `FK_Character_TO_movie_person_1` FOREIGN KEY (
	`mp_ch_num`
)
REFERENCES `Character` (
	`ch_num`
);

ALTER TABLE `movie` ADD CONSTRAINT `FK_age_TO_movie_1` FOREIGN KEY (
	`mo_ag_name`
)
REFERENCES `age` (
	`ag_name`
);

ALTER TABLE `movie_file` ADD CONSTRAINT `FK_movie_TO_movie_file_1` FOREIGN KEY (
	`mf_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `theater` ADD CONSTRAINT `FK_region_TO_theater_1` FOREIGN KEY (
	`th_re_name`
)
REFERENCES `region` (
	`re_name`
);

ALTER TABLE `screen` ADD CONSTRAINT `FK_theater_TO_screen_1` FOREIGN KEY (
	`sc_th_num`
)
REFERENCES `theater` (
	`th_num`
);

ALTER TABLE `seat` ADD CONSTRAINT `FK_screen_TO_seat_1` FOREIGN KEY (
	`se_sc_num`
)
REFERENCES `screen` (
	`sc_num`
);

ALTER TABLE `schedule` ADD CONSTRAINT `FK_screen_TO_schedule_1` FOREIGN KEY (
	`sh_sc_num`
)
REFERENCES `screen` (
	`sc_num`
);

ALTER TABLE `schedule` ADD CONSTRAINT `FK_movie_TO_schedule_1` FOREIGN KEY (
	`sh_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `join` ADD CONSTRAINT `FK_movie_person_TO_join_1` FOREIGN KEY (
	`jo_mp_num`
)
REFERENCES `movie_person` (
	`mp_num`
);

ALTER TABLE `join` ADD CONSTRAINT `FK_movie_TO_join_1` FOREIGN KEY (
	`jo_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `production_nation` ADD CONSTRAINT `FK_nation_TO_production_nation_1` FOREIGN KEY (
	`pn_na_name`
)
REFERENCES `nation` (
	`na_name`
);

ALTER TABLE `production_nation` ADD CONSTRAINT `FK_movie_TO_production_nation_1` FOREIGN KEY (
	`pn_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `genre_include` ADD CONSTRAINT `FK_genre_TO_genre_include_1` FOREIGN KEY (
	`gi_gr_name`
)
REFERENCES `genre` (
	`gr_name`
);

ALTER TABLE `genre_include` ADD CONSTRAINT `FK_movie_TO_genre_include_1` FOREIGN KEY (
	`gi_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `ticketing` ADD CONSTRAINT `FK_member_TO_ticketing_1` FOREIGN KEY (
	`ti_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `ticketing` ADD CONSTRAINT `FK_schedule_TO_ticketing_1` FOREIGN KEY (
	`ti_sh_num`
)
REFERENCES `schedule` (
	`sh_num`
);

ALTER TABLE `ticketing-list` ADD CONSTRAINT `FK_seat_TO_ticketing-list_1` FOREIGN KEY (
	`tl_se_num`
)
REFERENCES `seat` (
	`se_num`
);

ALTER TABLE `ticketing-list` ADD CONSTRAINT `FK_ticketing_TO_ticketing-list_1` FOREIGN KEY (
	`tl_ti_num`
)
REFERENCES `ticketing` (
	`ti_num`
);

update theater
set 
	th_seat=(select sum(sc_seat) from screen where sc_th_num=1) ,
    th_screen= (select count(sc_num) from screen where sc_th_num=1 )
where th_num=1;

select * from theater;

#폴킹 감독이 웡카 영화에 감독으로 참여하는 쿼리를 작성 
insert into `join` 
select 1,'감독',1,mp_num FROM
    movie_person
        JOIN
    `character` ON mp_ch_num = ch_num
WHERE
    ch_name = '폴 킹' AND mp_role = '감독'
;

select * from `join`;