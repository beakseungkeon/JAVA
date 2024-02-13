#CGV강남 1상영관에 등록된 좌석을 조회
SELECT 
    *
FROM
    SEAT
        JOIN
    SCREEN ON SE_SC_NUM = SC_NUM
        JOIN
   (SELECT * FROM theater)AS TH ON SC_TH_NUM = TH_NUM
   WHERE
	TH_NAME='CGV영등포';

SELECT * FROM	SCHEDULE;
INSERT INTO SCHEDULE VALUES
(NULL,'2024-02-09','10:30',1,1,1),
(NULL,'2024-02-09','13:00',0,1,1),
(NULL,'2024-02-09','16:00',0,1,1),
(NULL,'2024-02-09','18:10',0,1,1),
(NULL,'2024-02-09','20:30',0,1,1),
(NULL,'2024-02-09','11:30',1,2,1),
(NULL,'2024-02-09','14:00',0,2,1),
(NULL,'2024-02-09','15:00',0,2,1),
(NULL,'2024-02-09','19:10',0,2,1),
(NULL,'2024-02-09','21:30',0,2,1),
(NULL,'2024-02-09','12:20',0,3,1),
(NULL,'2024-02-09','14:30',0,3,1),
(NULL,'2024-02-09','17:30',0,3,1),
(NULL,'2024-02-09','19:50',0,3,1);
SELECT * FROM SCHEDULE;
SELECT distinct
    TH_NAME, MO_TITLE
FROM
    `schedule`
        JOIN
    MOVIE ON MO_NUM = sh_mo_num
        JOIN
    SCREEN ON SC_NUM = SH_SC_NUM
        JOIN
    THEATER ON TH_NUM = SC_TH_NUM
WHERE
	MO_TITLE='웡카';
    
#CGV강남 1상영관에 웡카 상영 시간을 조회하는 쿼리

SELECT 
    TH_NAME, MO_TITLE,SH_TIME,sh_date,SC_NUM
FROM
    `schedule`
        JOIN
    MOVIE ON MO_NUM = sh_mo_num
        JOIN
    SCREEN ON SC_NUM = SH_SC_NUM
        JOIN
    THEATER ON TH_NUM = SC_TH_NUM
WHERE
	MO_TITLE='웡카'AND SC_NUM=1;
    
#CGV강남 1상영관에 있는 좌석들을 조회하는 쿼리
SELECT 
    TH_NAME, SC_NAME, SE_NAME
FROM
    SEAT
        JOIN
    SCREEN ON SE_SC_NUM = SC_NUM
        JOIN
    THEATER ON TH_NUM = SC_TH_NUM
WHERE
    TH_NAME = 'CGV강남' AND SC_NAME=1;

select * from schedule;

#CGV강남 1상영관 2월 9일 10:30 웡카를 예매한 좌석들을 조회
SELECT MO_TITLE '영화명' ,SH_TIME AS '상영시간' ,SE_NAME AS'좌석' FROM `ticketing-list` JOIN SEAT ON tl_se_num=SE_NUM JOIN ticketing ON tl_ti_num=TI_NUM JOIN schedule ON ti_sh_num=SH_NUM JOIN MOVIE ON SH_MO_NUM=MO_NUM
WHERE MO_TITLE='웡카';

SELECT distinct MO_TITLE FROM MOVIE JOIN `SCHEDULE`ON SH_MO_NUM=MO_NUM JOIN ticketing ON ti_sh_num=SH_NUM JOIN `MEMBER` ON TI_ME_ID=ME_ID JOIN `ticketing-list` ON tl_ti_num=TI_NUM
WHERE ME_ID='abc123';

SELECT count(*) FROM `ticketing-list` JOIN SEAT ON tl_se_num=SE_NUM JOIN ticketing ON tl_ti_num=TI_NUM JOIN schedule ON ti_sh_num=SH_NUM JOIN MOVIE ON SH_MO_NUM=MO_NUM
WHERE MO_TITLE='웡카';



#장르별 등록된 영화 개수 조회 쿼리
select gr_name,count(mo_num)  from movie  join genre_include on gi_mo_num=mo_num right join genre on gi_gr_name=gr_name group by gr_name;

select mo_title ,gr_name from movie  join genre_include on gi_mo_num=mo_num join genre on gi_gr_name=gr_name 
where gi_gr_name='판타지';

select * from movie where mo_date>now();

select * from movie where mo_title like'%카%';
#2월,9,10일에 에매 가능한 영화 목록을 조회하는 쿼리
SELECT 
    mo_title,sh_date,sh_time
FROM
    (select * from schedule
WHERE
    sh_date BETWEEN '2024-02-09' AND '2024-02-10')as sh
 JOIN
    movie ON sh_mo_num = mo_num;  
    
#영화관의 전체 좌석수와 전체 상영관 수를 현재 데이터를 기준으로 업데이트하는 쿼리 


    
    