show databases;

drop database if exists db_test;
create database db_test;

# use db_test;

drop table if exists db_test.student;
create table db_test.student (
  id           int                  auto_increment primary key
  comment 'id 主键', # 自增长
  name         varchar(20) not null
  comment '学生姓名',
  age          int(2)      not null,
  gender       char(1)     not null default 'M',
  dob          date, # date of birth
  departmentId int
);

drop table if exists db_test.department;
create table db_test.department (
  id    int auto_increment primary key,
  title varchar(50),
  tel   varchar(20)
);

alter table db_test.student
  add constraint
  student_fk_departmentId
foreign key (departmentId)
references db_test.department (id);

DESC db_test.student; # desc - describe 描述表结构

select *
from db_test.student; -- 查询语句

select *
from db_test.department;

insert into db_test.department (title, tel)
value ('CS', '18600000000');

insert into db_test.department (title, tel)
value ('EE', '18600000001');

insert into db_test.student (name, age, dob, departmentId)
value ('Tom', 20, '2000-1-1', 1);

insert into db_test.student (name, age, gender, dob, departmentId)
value ('Jerry', 19, 'F', '2001-1-1', 2);


# insert into db_test.student (age)
# value (21);

update db_test.student
set age  = 19,
    name = 'Tom'; -- 更新 update

# delete
# from db_test.student; -- 删除语句

# drop table db_test.student; -- 删除表

show tables from db_test; -- 查询数据库的表

# drop database db_test; -- 删除数据库

-- comment Ctrl + /  Ctrl + Shift + /

select 1 /* as
df... */ + 1;

# truncate table db_test.student;

update db_test.student
set age = 19
where id = 1; # 行检索

delete
from db_test.student
where id = 2;

select name, age # 投影操作
from db_test.student;

show full columns from db_test.student;

select *
from db_test.student;

delete from db_test.student;

truncate table db_test.student;