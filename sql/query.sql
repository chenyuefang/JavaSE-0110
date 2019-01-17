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