select * from member;
#사용자가 아이디가 abc123,비번이asd123으로 회원가입을 진행
insert into member value("abc123","asd123",'USER');
#사용자가 아이디가 qwe123,비번이 qweqwe으로 회원가입을 진행 
insert into member(me_id,me_pw) value("qwe123","qweqwe");
#관리자가 아이디가 admin,비번이 admin으로 회원 가입을 진행
insert into member value("admin","admin",'ADMIN');
#CGV에서 영화 웡카를 관리자가 등록하려고 한다. 이때 해야하는 쿼리를 순서대로 써보세요
select * from MOVIE;
/*국가,제작,인물,영화인,참여,연령,영화파일,장르,장르포함  */
#국가
insert into nation values
('한국'),('미국'),('영국'),('일본'),('중국');

insert into `character` values
(null,'폴 킹','1978.07.29','','미국'),
(null,'티모시 샬라메','1995.12.27','','미국'),
(null,'칼라 레인','2009.04.20','','미국'),
(null,'올리비아 콜맨','1974.01.30','','영국'),
(null,'톰 데이비스','1979.04.27','','영국'),
(null,'휴 그랜트','1960.09.09','','영국'),
(null,'샐리 호킨스','1976.04.27','','영국');
select * from `character`;
#2 movie_person 테이블
insert into movie_person(mp_role,mp_pic,mp_ch_num) values
('감독','',1),
('배우','',2),
('배우','',3),
('배우','',4),
('배우','',5),
('배우','',6),
('배우','',7);
#3 영화 정보를 이용하여 영화를 등록
insert into age values
('전체관람가'),('12세 이상 관람가'),('15세 이상 관람가'),('청소년 관람불가'),('제한관람가');

insert into movie(mo_title,mo_date,mo_content,mo_running,mo_ag_name) value('웡카','2024-01-31','세상에서 가장 달콤한 여정','116','전체관람가');
#4 참여 등록
insert into `join`(jo_casting,jo_mo_num,jo_mp_num) values
('감독',1,1),
('윌리 웡카',1,2),
('누들',1,3),
('스크러빗 부인',1,4),
('블리처',1,5),
('움파룸파',1,6),
('윌리 웡카 엄마',1,7);
#5 장르 테이블
insert into genre values
('액션'),
('범죄'),
('SF'),
('드라마'),
('판타지'),
('코미디'),
('로맨스'),
('스릴러'),
('공포'),
('멜로');
#6연령 테이블

#7국가 추가

#8 트레일러 정보 추가
insert into movie_file(mf_filename,mf_type,mf_mo_num) values
('웡카_트레일러1.mp4','트레일러',1),('웡카_트레일러2.mp4','트레일러',1),('웡카_트레일러3.mp4','트레일러',1),('웡카_스틸컷1.png','스틸컷',1),('웡카_스틸컷2.png','스틸컷',1),('웡카_스틸컷3.png','스틸컷',1),('웡카_스틸컷4.png','스틸컷',1);

#9영화 제작에 영화와 제작 국가 정보를 추가 
insert into production_nation(pn_na_name,pn_mo_num) value('미국',1),('영국',1);
#10 장르 포함에 영화와 장르를 추가 
insert into genre_include(gi_mo_num,gi_gr_name) value(1,'판타지'),(1,'드라마');
