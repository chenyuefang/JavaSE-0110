# Database

### 数据管理的历史过程
- 人工管理
- 文件管理
    - 可以处理超大规模数据
    - 可以处理超大规模并发
    - 不能实现数据共享
- 数据库管理
    - 不能很好的处理超大规模数据 bit - byte - KB - MB - GB - TB - PB
    - 不能很好的处理超大规模并发
    
#### DBMS
- Database Manage System
- Software
- RDBMS `Relational 关系型数据库` 
    - MySQL - MariaDB
    - Oracle
    - SQL Server
    - DB2
    - SQLite
    - Access
- No SQL
    - MongoDB
    - Redis
    
#### 重点
1. SQL 命令式的语言 `DQL`
2. 数据库的设计    

#### 概念
1. 数据库
2. 表 二维表
3. 行 record
4. 列 attribute
5. 字段
6. 数据类型
7. CRUD 增删改查
    - C - Create `insert`
    - R - Retrieve `select`
    - U - Update `update`
    - D - Delete `delete`
    
8. SQL
    - DDL `create / alter / drop`
        - `truncate` vs. `delete`
    - DML `insert / update / delete`
    - DQL
    - JDBC `Java DataBase Connector`
    
9. Sample database structure

> Table `emp` 员工表

Field    | Type        | Null | Key | Default | Comment
----------|-------------|------|-----|---------|-------
EMPNO    | int(4)      | NO   | PRI | NULL    | 员工编号
ENAME    | varchar(10) | YES  |     | NULL    | 员工姓名
JOB      | varchar(9)  | YES  |     | NULL    | 工作工种
MGR      | int(4)      | YES  |     | NULL    | 经理编号
HIREDATE | date        | YES  |     | NULL    | 入职日期
SAL      | double(7,2) | YES  |     | NULL    | 基本工资
COMM     | double(7,2) | YES  |     | NULL    | 奖金
DEPTNO   | int(2)      | YES  | MUL | NULL    | 部门编号

> Table `dept` 部门表

Field  | Type        | Null | Key | Default | Comment
--------|-------------|------|-----|---------|-------
DEPTNO | int(2)      | NO   | PRI | NULL    | 部门编号
DNAME  | varchar(14) | YES  |     | NULL    | 部门名称
LOC    | varchar(13) | YES  |     | NULL    | 所在地区

> Table `salgrade` 工资级别表

Field | Type    | Null | Key | Default | Comment
-------|---------|------|-----|---------|-------
GRADE | int(11) | YES  |     | NULL    | 工资级别
LOSAL | int(11) | YES  |     | NULL    | 最低工资
HISAL | int(11) | YES  |     | NULL    | 最高工资


## 数据库的设计

> 根据应用的**业务需求**，定义数据库表结构

- 建库
- 见表
    - 有几个表
    - 表中有哪些字段（名字 / 数据类型 / 约束）
    - 表之间的关联（外键）
    
#### 范式（规范的形式）
1. 第一范式 `1NF`
- 没有重复的列
- 列中没有复义

2. 第二范式 `2NF`
- 表中的行可以被唯一确定
- 主键
   
3. 第三范式 `3NF`
- 表中不能有冗余的列
- 表中不能含有其他表的非主关键字值   
- 对表做拆分，两个表产生关联