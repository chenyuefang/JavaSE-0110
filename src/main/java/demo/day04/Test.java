package demo.day04;

public class Test extends Object {

    public static void main(String[] args) {


        Division division = new Division(1, 0);
//        division.y = 0;
//        division.setY(0);
        System.out.println(division.div());


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

        String a = "hello";
//        String b = "hello";
        String b = new String("hello");

        System.out.println(a + b);

        System.out.println(a == b);

        System.out.println(a.equals(b));

        // Ctrl + O

        Human human = new Human("Tom", 18, 'M', 1.8, false);

        human.study();
        human.work();

        System.out.println(human.getName());

        human.setName("Jerry");

        System.out.println(human.getName());

//        human.name = "Jerry";
//        System.out.println(human.name);

    }
}
