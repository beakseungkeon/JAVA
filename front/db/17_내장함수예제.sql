select char_length("안녕");#글자 수 리턴
select length("안녕");#바이트 수 리턴
select concat("%","안녕","%");#문자열들을 이어 붙여 리턴
select field("안녕","hi","hello","안녕","안녕하세요");#안녕이 있는 위치를 리턴,1부터 시작,없으면 0리턴 
select instr("안녕하세요","안녕");#안녕의 시작 위치를 리턴,1부터 시작
select locate("안녕","안녕하세요");#안녕의 시작 위치를 리턴,1부터 시작
select format(10000.123,2);#소수점 2자리까지 표현,3자리마다 , 추가
select bin(31),oct(31),hex(31);
select insert('c의 정석',1,1,'java');#1번지부터 1글자를 제거하고(c를 제거) 주어진 문자열(java)를 추가
select left ("안녕하세요",2);
select right ("안녕하세요",2);
select lower('ABCdef'),upper("ABCdef");
select lpad("1",3,"0"),rpad("1",3,"0");
select repeat("안녕",3);
select replace("c의 정석","c","java");
select reverse("abcdef");
select substring("자바의 정석",1,2);

#시간 함수
select adddate(now(),2);
select subdate(now(),2);
select addtime("11:30","2:00");
select subtime("11:30","2:00");
select timediff("11:30","9:30");
select date_add(now(),interval 1 day);
select date_add(now(),interval 3 week);
select date_add(now(),interval"1 1" year_month);

# 수학 관련 함수
select floor(1.23),ceil(1.23),round(1.23),abs(-1);