# Java SE Project

> 2019.01.10

### Day 01 

#### Github

1. 安装 Git

2. 注册 GitHub 账号，验证邮箱

3. 创建文件 .gitconfig 放在用户目录下

4. 创建项目，创建文件 .gitignore
- .idea
- *.iml

5. 把项目上传到 GitHub

   > VCS | Import Into Version Control | Share Project on GitHub

5. 检出项目

   > VCS | Checkout from Version Control | Git | URL| Clone | Create Project

6. 提交 Ctrl + K

7. 更新 Ctrl + T


### Day 02

1. 什么是 Java 的关键字列表
2. Java SE 的所有数据类型
3. 用条件运算符实现：
- 接收用户输入的成绩 int score
- 大于等于 85，输出 A
- 大于等于60， 输出 B
- 小于 60，输出 C

#### 作业
1. 判断 101-200 之间有多少个素数，并输出所有素数。素数：只能被 1 和它本身整除的正整数（1 不是素数）
2. 打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。

    ```
    例如：153 是一个“水仙花数”，因为 153 = 1的三次方 ＋ 5的三次方 ＋ 3的三次方
    ```

3. 输入两个正整数 m 和 n，求其最大公约数和最小公倍数


### Day 03

1. 定义类 Student

    ```
    /**
     * 学生管理系统
     * <p>
     * 1. 权限认证
     * 2. 学生管理
     * 3. 学生数据统计与分析
     */
    ```

2. 定义类 ATM

    ```
    /*
     * 模拟 ATM 机的相关操作
     * <p>
     * 1. 插卡登录
     * 2. 密码验证
     * 3. 存款取款
     * 4. 查询余额
     * 5. 修改密码
     */
    ```

3. 定义类 Poker

    ```
    /**
     * 设计一款纸牌游戏
     * <p>
     * 1. 玩家角色动态生成
     * 2. 纸牌分发规则
     * 3. 纸牌花色及大小比较规则
     */
    ```   
    
    
### Day 04

1. package: java.lang / String Class
- 列出 String 类所有的重载方法
- 列出 String 类重写了父类的方法    

2. 随机生成 [1， 20] 数 10000 次
- java.lang.Math
- java.util.Random
- 并判断两种方法的效率

3. 

```
/ * 
  * 结论：
  * 类一般是公有的
  * 域一般是私有的：保护类内部的数据
  * 方法一般是公有的：对外开放调用接口
  * 
  * 按以上结论重写 Human 类
  * 
  * 在 Test 类中怎么获取 name 的值？
  * 在 Test 类中怎么修改 name 的值？
*/    
```

4. 定义一个学生类，包含三个属性（学号，姓名，成绩）均为私有的，分别给这三个属性定义两个方法，一个设置它的值，另一个获得它的值。
   在一个测试类里调用

5. 创建一个汽车类 Car，为其定义两个属性：颜色和型号。
   为该类创建两个构造方法： 第一个为无形参的构造方法，利用其中方法将颜色和型号设置为红色、轿车。
   第二个为带参构造方法，利用构造方法将颜色和型号设置为黑色、轿车.
   另外为该类创建两个方法，分别用来显示颜色和型号。
   在一个测试类里调用

6. 构造一个日期类，包含年、月、日的属性和以下构造方法：   
- 不带参数
- 包含年月日三个参数
- yyyy-MM-dd 格式的字符串
- 提供存取日期的方法，实例化一个该类后，输入一个日期，可以计算出该日期是当年的第几天
  要求计算天数的方法由日期类 `java.util.Calendar` 提供，可直接通过该类的实例去调用
  
7. 编写程序，实现随机点名
- 按 Enter 键，随机输出人名  

```
陈月芳
刘立超
邓超元
赵明睿
赵晨锦
金谡
杨斌
杨恒
李静雅
王雅雯
王强
师尧
吴凯平
韩思远
陈慧慧
李欣
王一茗
李奕霖
苏宏月
赵灿
```

### Day 05

1. String 方法
- `charAt`
- `concat` `abbr of concatenate [kɒn'kætɪneɪt]`
- `contains`
- `endsWith`
- `equals`
- `equalsIgnoreCase`
- `getBytes`
- `indexOf`
- `isEmpty`
- `lastIndexOf`
- `length`
- `matches`
- `replace`
- `replaceAll`
- `replaceFirst`
- `split`
- `startWith`
- `subString`
- `toCharArray`
- `toLowerCase`
- `toUpperCase`
- `trim`
- `valueOf`

2. 定义 Shape 接口，声明了求面积和求周长的方法。做实现类 Square， Circle
   
3. 查看文档，学习 Set 接口的实现类 HashSet，Map 接口的实现类 HashMap，测试相关的方法   
- `java.util.Set`
- `java.util.Map`

4. 执行命令注意事项
- 命名是干什么的？
- 命令在哪执行？
- 命令的具体写法：不能变的，可以变的
- 命令执行后的结果

### Day 06
1. DDL 学生选课系统

```
学生表 student
   id
   name
   age
   gender
   dob
   departmentId
   
系别表 department
   id
   title 系名称
   tel
 
课程表 course
   id
   title 课程名称
   credit 学分
 
选课表 sc
   id
   studentId
   courseId
   grade 考试成绩
```

2. 设计实训题目的数据库表结构
- 建库见表语句和样本数据
- 提交一份 组名.sql 文件