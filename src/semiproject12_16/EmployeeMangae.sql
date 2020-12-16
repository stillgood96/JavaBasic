create table EmployeeManage (
    empno int  auto_increment,
    fname varchar(255),
    lname varchar(255),
    email varchar(255),
    phone varchar(255),
    hdate varchar(255),
    jobid varchar(255),
    sal int,
    comm decimal(5,2),
    mgrid int,
    deptid int,
    date timestamp default current_timestamp(),
    primary key (empno)
);

select * from EmployeeManage where empno =1;



-- 사원추가

-- 사원조회
select employee_id,last_name,email,job_id,manager_id,department_id from EMPLOYEES;
-- 사원상세 조회
select * from EMPLOYEES where employee_id = ?;