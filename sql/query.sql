show tables from scott;

select *
from scott.emp;

select *
from scott.dept;

select *
from scott.salgrade;

select *
from scott.emp
where JOB = 'salesman' and SAL <> 1500;

select *
from scott.emp
order by HIREDATE desc; -- asc

select *
from scott.emp;

select distinct job
from scott.emp;

select JOB, ENAME
from scott.emp
order by JOB, ENAME desc;

select *
from emp
limit 3 offset 12;
# limit 0, 3;

select *
from scott.emp;

select *
from scott.emp
where ENAME like '_ing';

select distinct JOB
from scott.emp;

select *
from scott.emp
# where JOB = 'salesman' or JOB = 'manager' or JOB = 'clerk';
where JOB in ('salesman', 'manager', 'clerk');

select *
from scott.emp
# where SAL >= 2000 and sal <= 3000;
where SAL between 2000 and 3000; # [x, y]

select e.ENAME as '员工姓名'
from scott.emp e;

select *
from scott.emp
where comm is not null; # 判断 is (not)

update scott.emp
set comm = null # 赋值 =
where EMPNO = 7499;

# DTL

start transaction ;

delete from scott.emp;

truncate scott.emp;

rollback ;