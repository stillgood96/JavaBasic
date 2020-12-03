-- 1. ��� ����� �̸�(FIRST_NAME, LAST_NAME)�� ��ȸ�϶�.
 select first_name ,last_name 
 from employees;
 
-- 2. ��� ����� ��� ������ ��ȸ�϶�.
select employee_id ,commission_pct ,department_id ,email ,first_name ,hire_date ,job_id ,last_name ,manager_id ,phone_number ,salary 
from employees;
 
-- 3. ��� ���� ���� ��ȸ�϶�.
select city 
from locations;
 
 
-- 4. �̸�(FIRST_NAME)�� M ���� �����ϴ� ����� ��� ������ ��ȸ�϶�.
select first_name 
	from employees
	where first_name like 'M%';


 
-- 5. �̸�(FIRST_NAME)�� �� ��° ���ڰ� 'a'�� ����� �̸�(FIRST_NAME)�� ������ ��ȸ�϶�.
select first_name from employees
where first_name like '_a%';
-- 6. ���� ���� �������� �����϶�.
 select city 
 from locations
 order by city asc;

-- 7. �μ� ���� �������� �����϶�.
select department_name
from departments
order by department_name desc;
 
 
-- 8. ������ 7000 �̻��� ������� ��� ������ ������(��������)���� �����϶�.
 select employee_id,first_name ,last_name ,email,phone_number ,hire_date ,job_id ,salary
 from employees
 where salary >=7000
order by salary asc; 
-- 9. �μ�Ƽ��(COMMISSION_PCT)�� ���� �ʴ� ������� ��� ������ ��ȸ�϶�.
 select employee_id,first_name ,last_name ,email,phone_number ,hire_date ,job_id ,salary,commission_pct 
 from employees
 where commission_pct is null;
 
-- 10. �μ�Ƽ��(COMMISSION_PCT)�� �޴� ������� ��� ������ ��ȸ�϶�.
select employee_id,first_name ,last_name ,email,phone_number ,hire_date ,job_id ,salary,commission_pct 
 from employees
 where commission_pct is not null;
 

-- 11. 2007�� 06�� 21�Ͽ� �Ի��� ����� �����ȣ, �̸�(FIRST_NAME, LAST_NAME) �׸��� �μ���ȣ�� ��ȸ�϶�.
 select first_name ,last_name ,department_id 
 from employees
 where hire_date = '2007-06-21';
-- 12. 2006�⿡ �Ի��� ����� �����ȣ�� �Ի����� ��ȸ�϶�.
  select employee_id ,first_name ,last_name ,department_id,hire_date 
 from employees
 where hire_date between '2006-01-01' and '2006-12-31';
 
-- 13. �̸�(FIRST_NAME)�� ���̰� 5���� �̻��� ����� ��ȸ�϶�.
select first_name 
from employees
where CHAR_LENGTH(first_name)>=5; 
 
-- 14. ������ 5000 ���� 12000�� ���� �̿��� ������� LAST_NAME �� ������ ��ȸ����.
select last_name, salary 
from employees
where not salary between 5000 and 12000;

-- 15. �����ȣ�� 176 �� ����� LAST_NAME �� �μ� ��ȣ�� ��ȸ�Ѵ�.
select last_name, department_id 
from employees
where employee_id =176;
-- 16. ������ 12000 �̻�Ǵ� �������� LAST_NAME �� ������ ��ȸ�Ѵ�.
select last_name , salary 
from employees
where salary >=12000;

-- 17. 1994�⵵�� ���� ��� ������� LAST_NAME �� ������� ��ȸ�Ѵ�.
select last_name 
from employees
where hire_date between '1994-01-01' and '1994-12-31';
-- 18. �Ŵ����� ���� ������� LAST_NAME �� JOB_ID �� ��ȸ�Ѵ�.
select last_name,job_id
from employees 
where manager_id is null;
 
 
-- 19. Ŀ�̼��� ���� ��� ������� LAST_ANME, ���� �� Ŀ�̼��� ��ȸ�Ѵ�.
--     ��, ���� ����, Ŀ�̼� �������� �����Ѵ�. 
select last_name, salary, commission_pct 
from employees
where commission_pct is not null
order by salary,commission_pct desc;
-- Ȯ�������� ���� ���� 


-- 20. LAST_NAME �� �׹�° ���ڰ� a �� ������� LAST_NAME �� ��ȸ�Ѵ�.
select last_name
from employees
where last_name like '___a%';

-- 21. LAST_NAME �� a ��(OR) e ���ڰ� �ִ� ������� LAST_NAME �� ��ȸ�Ѵ�.
select last_name
from employees
where last_name like '%a%' or '%e%';

-- 22. ������ 2,500, 3,500, 7000 �� �ƴϸ� ������ SA_REP �̳� ST_CLERK �� ������� ��ȸ�Ѵ�.
select last_name,salary,job_id
from employees 
where salary <> 2500 and salary<>3500 and salary <>7000 and job_id='SA_REP' or job_id='ST_CLERK';

