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
