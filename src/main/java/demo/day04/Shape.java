package demo.day04;

/**
 * 动态多态性
 *
 * 子类重写 overwrite / 覆盖了 overrides 了父类的方法
 *
 */
public class Shape {

    double getArea() {
        return 0d;
    }
}

class Square extends Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    //    double getArea() {
//        return length * length;
//    }


    @Override
    double getArea() {
        return length * length;
    }
}
