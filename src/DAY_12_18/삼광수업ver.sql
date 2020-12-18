-- 삼광 수업VER
select * from 고객;

-- 기본키 제약조건 걸기 (순서 상관x)
alter table 고객
add constraint pk_고객
primary key (고객번호);

alter table 주문
add constraint pk_주문
primary key (주문번호);

alter table 주문항목
    add constraint pk_주문항목
        primary key (주문번호,제품번호);

alter table 제품
    add constraint pk_제품
        primary key (제품번호);

alter table 운송
    add constraint pk_운송
        primary key (운송ID);

alter table 직원
    add constraint pk_직원
        primary key (인사번호);

-- 외래키 제약조건
-- 주문테이블
alter table 주문
    add constraint fk_주문고객
        foreign key(고객번호)  references  고객(고객번호);

alter table 주문
    add constraint fk_주문_직원
        foreign key(인사번호) references 직원(인사번호);

alter table 주문항목
    add constraint fk_주문항목_주문
        foreign key (주문번호) references 주문(주문번호);
s

alter table 주문항목
    add constraint fk_주문항목_제품
        foreign key (제품번호) references 제품(제품번호);

alter table 운송
add constraint fk_운송_주문
foreign key (주문번호) references 주문(주문번호);

-- 고객 - 주문 - 주문항목 - 제품 inner join
select * from 고객 c join 주문 o using(고객번호)
            join 주문항목 d using(주문번호) join 제품 p using(제품번호);

-- CODP 뷰만들기
create view CODP as
select * from 고객 c join 주문 o using(고객번호)
                   join 주문항목 d using(주문번호) join 제품 p using(제품번호);
-- CODP 뷰 테이블
select * from CODP;


-- 운송-주문-직원 inner join
select * from 운송 s join 주문  o  using(주문번호) join 직원 e using(인사번호);

-- SOE 뷰테이블 만들기
create view SOE as
select * from 운송 s join 주문  o  using(주문번호) join 직원 e using(인사번호);

-- SOE 뷰 조회
select * from SOE;

select * from CODP  where 주문번호 =1 order by 주문번호 desc;



