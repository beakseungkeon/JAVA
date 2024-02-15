#1초마다 기간이 지난 인증번호를 삭제하도록 이벤트 등록 
SELECT * FROM shoppingmall.certification;
create event delete_certification
on schedule every 1 second
do 
	delete  from certification where ce_limit<=now();
    
drop event delete_certification;

select * from information_schema.events;

#지정된 시간에 이벤트를 1번 실행 후 이벤트 삭제
create event delete_certification
on schedule
at '2024-02-15 09:40:00'
on completion not preserve
do 
	delete  from certification where ce_limit<=now();