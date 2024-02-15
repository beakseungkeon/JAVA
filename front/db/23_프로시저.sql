#제품을 추가하는 프로시저
#제춤 코드는 영문3자리, 숫자 3자리
#주어지는 정보: 제품코드 영문 3자리, 제품명, 내용, 가격, 카테고리명
#프로시저 실행 결과 제품이 등록 

use shoppingmall;

DROP procedure IF exists INSERT_PRODUCT;
DELIMITER //
CREATE procedure INSERT_PRODUCT(
	IN _CODE CHAR(3),
    IN _TITLE VARCHAR(50),
    IN _CONTENT TEXT,
    IN _PRICE INT,
    IN _CATEGORY VARCHAR(10)
)
BEGIN
	DECLARE _COUNT INT ;
    DECLARE _PR_CODE VARCHAR(15);
    DECLARE _CA_NUM INT;
    #_CATEGORY와 일치하는 등록된 제품 수를 찾아 +1을 한 후 변수에 저장
    SET _COUNT=(SELECT COUNT(*) + 1 FROM PRODUCT JOIN CATEGORY ON CA_NUM = PR_CA_NUM WHERE CA_NAME='기타');
    
    #_CODE와 _COUNT를 이용하여 _PR_CODE를 생성
    #_COUNT가 3자리가 아니면 앞에 '0'을 붙여 3자리로 만든 후 제품 코드를 생성 
    SET _PR_CODE=CONCAT(_CODE,LPAD(_COUNT,3,'0'));
    
    #_CATEGORY를 이용하여 _CA_NUM을 찾음
    SET _CA_NUM =(SELECT CA_NUM FROM CATEGORY WHERE CA_NAME=_CATEGORY);
    
    
END//
DELIMITER ;

#CALL INSERT_PRODUCT('ABC','수정펜','수정펜입니다',3000,'기타');

#제품을 주문하는 프로시저 
DROP procedure IF exists INSERT_ORDER;
DELIMITER //
CREATE procedure INSERT_ORDER(
	IN _AMOUNT INT,
    IN _ID VARCHAR(13),
    IN _PR_CODE VARCHAR(15)
)
BEGIN
	DECLARE _TOTAL_PRICE INT ;
    DECLARE _PRICE INT;
    SET _PRICE=(SELECT PR_PRICE FROM PRODUCT WHERE PR_CODE=_PR_CODE);
    SET _TOTAL_PRICE=(_PRICE*_AMOUNT);
    IF _TOTAL_PRICE IS NOT NULL THEN
		INSERT INTO `order`(or_amount,or_total_price,or_me_id,or_pr_code)
        VALUES(_AMOUNT,_TOTAL_PRICE, _ID, _PR_CODE);
    END IF;
    
END//
DELIMITER ;

CALL INSERT_ORDER(3,'qwe123','ABC004');
SELECT * FROM `ORDER`;
SELECT * FROM PRODUCT