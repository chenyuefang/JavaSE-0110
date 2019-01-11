package demo.day02;

/**
 * 运算符
 * <p>
 * 1. 算术运算符
 * 2. 关系运算符
 * 3. 逻辑运算符
 * 4. 位运算
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


    }
}
