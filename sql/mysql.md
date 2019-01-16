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