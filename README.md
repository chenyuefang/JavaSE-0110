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
  * 域一般是私有的
  * 方法一般是公有的
  * 
  * Human 类重写
  * 
  * 在 Test 中怎么获取 name 的值？
  * 在 Test 中怎么修改 name 的值？
*/    
```
   
  
