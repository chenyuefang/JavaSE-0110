package demo.day04;

public class Test {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.1, 2.2)); // 浮点数精度损失
        System.out.println(calculator.add(1, 1.1)); // Ctrl + B
        System.out.println(calculator.add(1.1, 1));
    }
}
