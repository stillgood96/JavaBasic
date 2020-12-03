-- 실습) ppt 데이터베이스SQL활용에 나온 표 만들기 
-- insert into 로 테이블에 값을 넣고 select로 조회해보기 


-- -----------------고객테이블------------------------

create table customerTest(
	csid		varchar(10),
	csname		varchar(10),
	age			int,
	grd			varchar(10),
	job			varchar(10),
	point		int
);
-- csutomerTest pk설정
alter table customerTest
add constraint pk_cst
primary key (csid);


-- csutomerTest value(값 넣기)
insert into customerTest values
('apple','정소화',20,'gold','학생',1000),
('banana','김선우',25,'vip','간호사',2500),
('carrot','고명석',28,'gold','교사',4500),
('orange','김용욱',22,'silver','학생',0),
('melon','성원용',35,'gold','회사원',5000),
('peach','오형준',null,'silver','의사',300),
('pear','채광주',31,'silver','회사원',500);

-- null 값으로 넣으면 default 값이 들어갈 줄 알았는데 안들어감
-- 이따가 다시 수정

-- -----------------제품테이블------------------------
create table productTest(
	pdNum 		varchar(10) not null,
	pdName 		varchar(15) not null,
	qunatity 		int not null,
	price 		int not null,
	company 		varchar(12) not null
	);
-- csutomerTest pk설정
alter table productTest 
add constraint pk_pdt
primary key (pdnum);


insert into productTest values
('p01','그냥만두',5000,4500,'대한식품'),
('p02','매운쫄면',2500,5500,'민국푸드'),
('p03','쿵떡파이',3600,2600,'한빛제과'),
('p04','맛난초콜릿',1250,2500,'한빛제과'),
('p05','얼큰라면',2200,1200,'대한식품'),
('p06','통통우동',1000,1550,'민국푸드'),
('p07','달콤비스킷',1650,1500,'한빛제과');


-- -----------------주문테이블------------------------
create table orderTest(
	ordNum		varchar(10),
	csid		varchar(15),
	pdNum		varchar(10) not null,
	quantity			int,
	adr		varchar(15),
	orderdate		date
);

-- 주문테이블 기본키 pk 설정
alter table orderTest
add constraint pk_ordt
primary key (csid,pdNum);

-- 주문테이블 외래키 fk 설정
alter table orderTest 
add constraint fk_ordt_cst
foreign key (csid)
references customerTest(csid),
add constraint fk_ordt_pdt
foreign key (pdNum)
references productTest(pdNum);


insert into orderTest values
('o01','apple','p03',10,'서울시 마포구','2019-01-01');
insert into orderTest values
('o02','melon','p01',5,'인천시 계양구','2019-01-10'),
('o03','banana','p06',45,'경기도 부천시','2019-01-11'),
('o04','carrot','p02',8,'부산시 금정구','2019-02-01'),
('o05','melon','p06',36,'경기도 용인시','2019-02-20'),
('o06','banana','p01',19,'충청북도 보은군','2019-03-02'),
('o07','apple','p03',22,'서울시 영등포구','2019-03-15'),
('o08','pear','p02',50,'강원도 춘천시','2019-04-10'),
('o09','banana','p04',15,'전라남도 목포시','2019-04-11'),
('o10','carrot','p03',20,'경기도 안양시','2019-05-22');


-- -----------------Books 테이블------------------------

create table books(
	bookid			int,
	bookname		varchar(20),
	publisher		varchar(15),
	price			int
);

-- booksid 기본키(pk) 설정
alter table books 
add constraint pk_bk
primary key(bookid,price);

insert into books values
(1,'축구의 역사','굿스포츠',7000),
(2,'축구아는 여자','나무수',13000),
(3,'축구의 이해','대한미디어',22000),
(4,'골프 바이블','대한미디어',35000),
(5,'피겨 교본','굿스포츠',8000),
(6,'역도 단계별기술','굿스포츠',6000),
(7,'야구의 추억','이상미디어',20000),
(8,'야구를 부탁해','이상미디어',13000),
(9,'올림픽 이야기','심성담',7500),
(10,'Olympic Champions','Pearson',13000);

-- -----------------BookMembers 테이블------------------------

create table bookMembers(
	custid		int,
	name		varchar(10),
	address		varchar(20),
	phone		varchar(20)
);

-- bookMembers 기본키(PK) 설정
alter table bookMembers 
add constraint pk_bms
primary key (custid);

insert into bookMembers values 
(1,'박지성','영국 맨체스타','000-5000-0001'),
(2,'김연아','대한민국 서울','000-6000-0001'),
(3,'장미란','대한민국 강원도','000-7000-0001'),
(4,'추신수','미국 클리블랜드','000-8000-0001'),
(5,'박세리','대한민국 대전',null);

-- -----------------BookOrders 테이블------------------------

create table bookOrders(
	orderid		int,
	custid		int,
	bookid		int,
	saleprice	int,
	orderdate	date
);

-- bookOrders 기본키(pk) 설정
alter table bookOrders 
add constraint pk_bko
primary key (orderid,custid,bookid,saleprice);

-- bookOrders 외래키(fk) 설정
alter table bookOrders 
add constraint fk_bko_cst
foreign key (custid)
references customerTest(custid),
add constraint fk_bko_bks
foreign key (bookid)
references books(bookid)

insert into bookOrders values
(1,1,1,6000,'2014-07-01'),
(2,1,3,21000,'2014-07-03'),
(3,2,5,8000,'2014-07-03'),
(4,3,6,6000,'2014-07-04'),
(5,4,7,20000,'2014-07-05'),
(6,1,2,12000,'2014-07-07'),
(7,4,8,13000,'2014-07-07'),
(8,3,10,12000,'2014-07-08'),
(9,2,10,7000,'2014-07-09'),
(10,3,8,13000,'2014-07-10');


-- 데이터 조회 : select
-- 1. 기본적인 테이블 컬럼 조회 
-- select 컬럼목록 from 테이블명;

-- 1) 고객테이블에서 아이디, 이름, 등급을 조회하세요
select csid ,csname ,grd from customerTest;

-- 2) 고객테이블에서 모든 컬럼을 조회하세요 
select csid ,csname ,age ,grd ,job ,point 
from customerTest;
-- 하나하나 쓰기 귀찮으니까 * 사용해서 전부 출력해보기
select * from customerTest;


-- 3) 제품테이블에서 제조업체를 조회하세요
select company from productTest;


-- 3) 제품테이블에서 제조업체를 조회하세요
--    단, 총 몇개의 업체가 있는지 알아봅니다.
-- distinct : 중복을 제거하여 한개의 값만 조회되도록 함
-- all : 중복을 허용해서 존재하는 모든 값을 조회하도록 함 (기본)
select distinct company
from productTest;


-- 2. 테이블 컬럼 조회시 조회결과 컬럼명을 변경
-- select 컬럼명 as 새컬럼명 from 테이블명;

-- 4) 제품테이블에서 제품명과 가격을 조회하되
-- 컬럼명을 한글로 바꿔 출력하세요
select pdName as 제품명, price as 단가
from productTest;

-- as를 빼도 나오긴함 하지만 띄어쓰기를 하면 오류가나오니 띄어쓰기를하려면 ' ',"" 로 묶어줘야함
select pdName 제품명, price '제품 단가'
from productTest;
select pdName 제품명, price "제품 단가"
from productTest;
-- 오라클에서는 큰따옴표만 ms sql은 작은따옴표만 mysql은 둘다 

-- 3. 산술식을 이용한 검색 
-- select 사용시 산술연살자를 이용해서 조회할수도 있음
-- select 산술식 from 테이블명;  
-- 산술식을 사용하면 산술식이 적용된 가상컬럼이 새로 추가가된다. 

-- 5) 제품테이블에서 제품명과 가격을 조회하되
-- 가격에 500원을 더해 2021단가는 별칭을 가진  
-- 새로운 컬럼도 함께 출력하세요
select pdName,price,price+500 as '2021 단가' from productTest; 

-- 6) 모든 회원의 적립금을 1000씩 추가해주었을때
-- 결과를 알아보려고 한다 적절한 질의문을 작성하세요  
-- 새로운 컬럼도 함께 출력하세요
select	csid,csname,point,point+1000 as '1000원 추가후 적립금' from customerTest;


-- 4. 조건식(where)을 이용한 검색
-- 조건을 만족하는 데이터만을 검색 
-- where 라는 예약어를 이용하고 
-- 비교연산자, 논리연산자 등으로 구성된 조건식 필요
-- select 컬럼명 from 테이블명 where 조건식; 

-- 7) 제품테이블에서 한빛제과가 제조한 제품의 
-- 제품명, 재고량, 단가를 조회하세요

select pdName,qunatity,price  -- (모두조회)
from productTest;

select company,pdName,qunatity,price  -- (조건조회)
from productTest where company = '한빛제과';


-- 8) 주문테이블에서 apple 이라는 고객이 15개 이상 
-- 주문한 제품, 수량, 주문일자를 조회하세요
select csid,pdNum,quantity ,orderdate 
from orderTest 
where csid = 'apple' and quantity>=15;

-- 8) 주문테이블에서 apple 이라는 고객이  주문했거나 15개 이상 
-- 주문한 제품, 수량, 주문일자를 조회하세요
select csid,pdNum,quantity,orderdate
from orderTest 
where csid = 'apple' or quantity >= 15;

-- 8) 제품테이블에서 단가가 2000원이상이고
-- 3000원 이하인 제품의 제품명, 단가, 제조업체를 조회하세요
SELECT pdNum ,pdName ,price,company 
from productTest
where price<3000 and price>=2000;

-- where a between x(min) and y(max)
SELECT pdNum ,pdName ,price,company 
from productTest
where price between 2000 and 3000;


-- 5. NULL 검색
-- 해당 컬럼의 값이 NULL 인지를 조회할때는
-- 'is NULL/is not null' 이라는 구문을 사용해야함

-- 9) 고객 테이블에서 나이가 입력되지 않은 고객을 찾기 
SELECT csid,csname,age
FROM customerTest 
where age is NULL;

