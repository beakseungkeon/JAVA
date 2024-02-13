SELECT *  FROM COURSE JOIN  STUDENT ON CO_ST_NUM=ST_NUM
WHERE ST_MAJOR="컴퓨터공학" AND ST_NAME='둘리';

SELECT SUM(LE_POINT)  FROM COURSE JOIN  STUDENT ON CO_ST_NUM=ST_NUM JOIN LECTURE ON CO_LE_NUM=LE_NUM
WHERE ST_MAJOR="컴퓨터공학" AND ST_NAME='둘리';

SELECT * FROM STUDENT WHERE ST_NUM LIKE "2024%";

SELECT ST_MAJOR,COUNT(*) FROM STUDENT GROUP BY ST_MAJOR;

#강의별 수강신청한 학생수를 조회하는 쿼리
SELECT LE_TITLE,COUNT(*) FROM COURSE JOIN LECTURE ON CO_LE_NUM=LE_NUM GROUP BY LE_TITLE;

