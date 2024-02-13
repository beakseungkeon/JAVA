#쇼핑몰을 이용한 윈도우 함수 예제 
use shoppingmall;

#제품을 가격순으로 정렬 ROW_NUMBER 
SELECT 
    row_number() OVER(order by pr_price DESC)AS '순서',product.*
FROM
    product;
#제품을 가격순으로 정렬 RANK 
SELECT 
    RANK() OVER(order by pr_price DESC)AS '금액순',product.*
FROM
    product;
    
    
#제품을 가격순으로 정렬 DENSE_RANK 
SELECT 
    DENSE_RANK () OVER(order by pr_price DESC)AS '금액순',product.*
FROM
    product;
    
#제품을 비싼 제품,싼 제품으로 정렬 NTILE
SELECT 
    NTILE(2) OVER(order by pr_price DESC)AS '그룹',product.*
FROM
    product ;
    
#가장 비싼 제품들을 조회하는 쿼리DENSE_RANK
SELECT * FROM (
SELECT 
    DENSE_RANK () OVER(order by pr_price DESC)AS 'PR_RANK',product.*
FROM
    product 
)AS RANKED_PRODUCT
WHERE PR_RANK=1;