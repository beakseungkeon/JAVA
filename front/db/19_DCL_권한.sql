
create user'back'@'%' identified by '1234';#사용자 추가

set password for 'back'@'%'='0000';#사용자 비번 변경

drop user 'back'@'%'; #사용자 삭제
SELECT USER, HOST FROM mysql.user;

#grant 권한종류 db명.테이블명 to'사용자명'@'호스트명';

#권한 부여
grant all privileges on `shoppingmall`.product to 'back'@'%';
#권한 제거
revoke all privileges  on `shoppingmall`.product from'back'@'%';
grant all privileges on `shoppingmall`.* to 'back'@'%';