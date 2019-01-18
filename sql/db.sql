drop database if exists db_student;
create database db_student;

drop table if exists db_student.admin;
create table db_student.admin (
  id       int auto_increment primary key
  comment 'id PK',
  username varchar(255) not null
  comment 'username',
  password varchar(255) not null
  comment 'password'
)
  comment 'admin table';

drop table if exists db_student.student;
create table db_student.student (
  id           int                  auto_increment primary key
  comment 'id 主键', # 自增长
  name         varchar(20) not null
  comment '学生姓名',
  age          int(2)      not null,
  gender       char(1)     not null default 'M',
  dob          date, # date of birth
  departmentId int
);

drop table if exists db_student.department;
create table db_student.department (
  id    int auto_increment primary key,
  title varchar(50),
  tel   varchar(20)
);

alter table db_student.student
  add constraint
  student_fk_departmentId
foreign key (departmentId)
references db_student.department (id);

insert db_student.admin
value (1, 'admin', 'admin');
