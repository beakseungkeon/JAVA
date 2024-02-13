select *from movie where mo_title='웡카';
SELECT 
    mo_title as'제목',ch_name as '이름',mp_role as 구분
FROM
    movie
        JOIN
    `join` ON jo_mo_num = mo_num
        JOIN
    movie_person ON mp_ch_num = jo_mp_num
        JOIN
    `character` ON ch_num = mp_ch_num
where
	mo_title='웡카';