package demo.day04;

public class Test {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.1, 2.2)); // 浮点数精度损失
        System.out.println(calculator.add(1, 1.1)); // Ctrl + B
        System.out.println(calculator.add(1.1, 1));

        Square square = new Square(1.2);
        System.out.println(square.getArea());

        Shape s = new Shape();
        System.out.println(s.getArea());

        Shape s1 = new Square(2);

//        Square s2 = new Shape(); // ?
        System.out.println(s1.getArea()); //
    }
}
