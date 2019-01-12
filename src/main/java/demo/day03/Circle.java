package demo.day03;

public class Circle {
    double pi = 3.14;
    double x;
    double y;
    double radius;
    String color;

    // Alt + Insert
    public Circle(double x, double y, double radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    /**
     * 构造方法 / 构造器 / Constructor
     * <p>
     * 1. 没有返回类型
     * 2. 与类同名
     * <p>
     * 作用：在创建对象时起作用，初始化域
     * <p>
     * 默认构造方法：初始化域为默认值：整形-0，浮点型-0.0，String-null，boolean-false
     */

    Circle(){}

//   Circle(double x, double y, double radius, String color) {
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//         this.color = color;
//    }


    double getArea() {
        return pi * radius * radius;
    }

    double getPerimeter() {
        return 2 * pi * radius;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

}
