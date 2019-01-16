show databases;

drop database if exists db_test;
create database db_test;

# use db_test;

drop table if exists db_test.student;
create table db_test.student (
  id     int auto_increment primary key, # 自增长
  sno    varchar(20),
  name   varchar(20) unique,
  age    int(2) not null,
  gender char(10),
  major  varchar(20),
  city   varchar(20),
  dob    date, # date of birth
  height double(2, 1) # 一共有两个数字，小数部分有 1 个数字 。1.x
);

DESC db_test.student; # desc - describe 描述表结构

select *
from db_test.student; -- 查询语句

insert into db_test.student
value (1, '185002', 'Tom', 18, 'M', 'SE', 'Beijing', '2000-1-1', 1.7); -- 插入语句 insert

insert into db_test.student (sno, name, age)
value ('1850002', 'Tom', 20);

insert into db_test.student (age)
value (21);

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


