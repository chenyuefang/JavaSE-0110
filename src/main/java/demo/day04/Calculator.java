package demo.day04;

/**
 * 静态多态性
 *
 * 同一个类内部有同名的方法
 * 区分的标志是方法的参数
 *
 * 1. 参数的类型
 * 2. 参数的个数
 * 3. 参数的顺序
 *
 */
public class Calculator {

//    int add(int x, int y) {
//        return x + y;
//    }

    double add(double x, double y) {
        return x + y;
    }

    double add(int x, double y) {
        return x + y;
    }

    String add(int a, int b) {
        return a + "" + b;
    }

    String add(double x, int y) {
        return x + "" + y;
    }

//    String add(int x, double y) {return "";}

}
