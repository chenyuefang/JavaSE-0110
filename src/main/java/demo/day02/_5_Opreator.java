package demo.day02;

/**
 * 运算符
 * <p>
 * 1. 算术运算符
 * 2. 关系运算符
 * 3. 逻辑运算符
 * 4. 位运算
 * 5. 条件运算符 三目
 * 6. 赋值运算符
 */
public class _5_Opreator {
    public static void main(String[] args) {
//        1.
        int x = 1;
        int y = 2;

        int z = x + y;
        System.out.println(z);

        z = x - y;
        System.out.println(z);

        z = x * y;
        System.out.println(z);

        z = x / y;
        System.out.println(z);

        z = x % y;
        System.out.println(z);

        // ++ 自增
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);

        // -- 自减

//        2.

        double a = 1.2;
        double b = 3.4;

        // 行复制 Ctrl + D
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Java String pool
        String s1 = "hello";
//        String s2 = "Hello";
        String s2 = new String("hello");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);

//        3.
        boolean t = true;
        boolean f = false;

        System.out.println(t & f); // false
        System.out.println(t | f); // true
        System.out.println(t ^ f); // true 异或
        System.out.println(!f); // true
        System.out.println(!t); // false

        System.out.println(t && f); // false
        System.out.println(t || f); // true

        // & | 逻辑
        // && || 条件
        // 1. 他们的运算结果是一样的
        // 2. 短路规则

//        4.

//        5.

        String str1 = "hello";
        String str2 = "hi";

        int n = (str1.length() < str2.length()) ? 1 : 2;
        System.out.println(n);

//        6.

        int m = 100;

        // 二元赋值运算符 += -= *= /= %=

        m += 1; // m += 1 等价于 m = m + 1;
        System.out.println(m);

        m %= 100;
        System.out.println(m);


    }
}
