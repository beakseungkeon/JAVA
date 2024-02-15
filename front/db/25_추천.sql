USE COMMUNITY;
#회원 상태를 추가하는 쿼리(이용 중,기간 정지, 영구 정지,탈퇴)
insert into member_state value('이용 중'),('기간 정지'),('영구 정지'),('탈퇴');
INSERT INTO MEMBER(ME_ID,ME_PW,ME_EMAIL,ME_AUTHORITY,me_ms_state) VALUES('abc123','abc123','abc123@kh.co.kr','USER','이용 중'),
('qwe123','qwe123','qwe123@kh.co.kr','USER','이용 중'),('admin','admin','admin@kh.co.kr','ADMIN','이용 중');

select * from member;

# 관리자가 커뮤니티를 등록(공지, 자유, 토론, 공부) 
insert into community (co_name)values('공지'),('자유'),('토론'),('공부');
select * from community;

insert into board (bo_me_id,bo_co_num,bo_title,bo_content) value('abc123',2,'테스트','테스트입니다');
select * from `file`;

insert into board(bo_me_id,bo_co_num,bo_title,bo_content) 
select 'admin',co_num,'공지사항','공지사항입니다' from community where co_name='공지';
insert into `file`(fi_bo_num,fi_name,fi_or_name)  values(2,'/2024/02/14','공지사항1.jpg');
#공지 커뮤니티에 등록된 모든 게시글을 조회하는 쿼리 
select * from community join board on bo_co_num=co_num where co_name='공지';
select * from board;

select * from board join community on bo_co_num=co_num where co_name="공지" 
order by bo_num desc limit 0,10;

#1번 게시글을 상세 조회했을 때 실행되는 쿼리 
update board set bo_view =(bo_view+1) where bo_num=2;
select * from board join community on bo_co_num=co_num where bo_num=2;

select * from board join `member` on bo_me_id=me_id where me_id='abc123';

select * from recommend;

SELECT RE_NUM FROM RECOMMEND WHERE RE_ME_ID='QWE123'AND RE_BO_NUM=1 ;
Drop procedure if exists BOARD_RECOMMEND;
DELIMITER //
CREATE PROCEDURE BOARD_RECOMMEND(
	IN _ID VARCHAR(13),
    IN _BO_NUM INT,
    IN _STATE INT

)
BEGIN
DECLARE _RE_NUM INT;
DECLARE OLD_STATE INT;

SET _RE_NUM=(SELECT RE_NUM FROM RECOMMEND WHERE RE_ME_ID=_ID AND RE_BO_NUM=_BO_NUM );
IF _RE_NUM IS NULL THEN
	INSERT INTO RECOMMEND(RE_ME_ID,RE_BO_NUM,RE_STATE) VALUES(_ID,_BO_NUM,_STATE);
    END IF;
IF _RE_NUM IS NOT NULL THEN
SET	OLD_STATE= (SELECT RE_STATE FROM RECOMMEND WHERE RE_ME_ID=_ID AND RE_BO_NUM=_BO_NUM);
	IF OLD_STATE =_STATE THEN
		SET OLD_STATE =0;
	
    ELSE
		SET OLD_STATE=_STATE;
	END IF;
    UPDATE RECOMMEND SET RE_STATE=OLD_RE_STATE WHERE RE_BO_NUM=_BO_NUM AND RE_ME_ID=_ID;
END IF;

	
	

END //

DELIMITER ;
CALL BOARD_RECOMMEND('ABC123',1,1);
SELECT * FROM RECOMMEND