package demo.day03;

import java.util.*;

/**
 * 形状
 */
public class Shape {

    //    fields
    String color;

//    public Shape() {
//    }

    public Shape(String color) {
        this.color = color;
    }

    //    methods
    double getArea() {
        return 0d;
    }

    double getPerimeter() {
        return 0d;
    }

    String getColor() {
        return color;
    }

    public static void main(String[] args) {
//        Square square = new Square("red", 2.0);
//        square.length = 1.0;
//        System.out.println(square.color);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());

        Triangle triangle = new Triangle("black", 4.0, 5.0, 3.0);
        System.out.println(triangle.color);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}

/**
 * 正方形 Square
 * 长方形 Rectangle
 * 三角形 Triangle
 * 圆形 Circle
 */

// 正方形 Square
class Square extends Shape { // 自动修复 Alt + Enter
    double length;

    public Square(String color, double length) {
        super(color); // 调用了父类的有参构造方法
        this.length = length;
    }

    @Override
        // 子类重写 overwrite / 覆盖 override 了父类的方法
    double getArea() {
        return length * length;
    }

    // Ctrl + O
    @Override
    double getPerimeter() {
        return length * 4;
    }
}

// 长方形 Rectangle
class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }
}

// 圆形 Circle
class Circle extends Shape {

    double pi = 3.14;
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return pi * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * pi * radius;
    }
}

//  三角形 Triangle

class Triangle extends Shape {

    double a;
    double b;
    double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        if (!((a + b > c) && (b + c > a) && (c + a > b))) {
            System.out.println("Error.");
            System.exit(1);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}

