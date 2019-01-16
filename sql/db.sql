show databases;

drop database if exists db_test;
create database db_test;

drop table if exists db_test.student;
create table db_test.student (
  sno    varchar(20),
  name   varchar(20),
  age    int(2),
  gender char(1),
  major  varchar(20),
  city   varchar(20)
);

desc db_test.student; # desc - describe 描述表结构

select * from db_test.student; -- 查询语句

insert into db_test.student value ('185001', 'TOm', 18, 'M', 'SE', 'Beijing'); -- 插入语句 insert

update db_test.student set age = 19, name = 'Tom'; -- 更新 update

delete from db_test.student; -- 删除语句

drop table db_test.student; -- 删除表

show tables from db_test; -- 查询数据库的表

# drop database db_test; -- 删除数据库

