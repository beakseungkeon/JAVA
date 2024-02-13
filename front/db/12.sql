select * from product;

#모든 카테고리를 조회하는 쿼리
select * from category;

select 
	ca_name,pr_title 
from 
	category 
	join 
		product 
		on 
			CA_NUM=pr_ca_num;

SELECT 
    ca_name, pr_title
FROM
    category
        JOIN
    product ON ca_num = pr_ca_num
WHERE
    ca_name = '기타';
    
select * from member;
SELECT 
    pr_title, or_me_id
FROM
    `order`
        JOIN
    product ON or_pr_code = pr_code
WHERE
    or_me_id = 'abc123';
    
    
select * from member;
SELECT 
  pr_title,ifnull(sum(or_amount),0)
FROM
    `order`
        right JOIN
    product ON or_pr_code = pr_code
    where or_state not in('반품','환불')or or_state is null
    group by pr_code;

#인기 제품 조회 인기제품은 누적 판매량을 기준으로 상위 5개 제품
select * from member;
SELECT 
  pr_title,ifnull(sum(or_amount),0)as'판매수량'
FROM
    `order`
        right JOIN
    product ON or_pr_code = pr_code
    where or_state not in('반품','환불')or or_state is null
    group by pr_code
    order by 판매수량 desc, pr_price asc
    limit 0,5;
    
select pr_title,pr_price from product
order by pr_price desc
limit 0,1;
