package demo.day03;

public class Test {

    public static void main(String[] args) {

        Circle circle = new Circle(2.0, 3.0, 4.0, "black"); // Ctrl + P


//        circle.x = 1.0;
//        circle.y = 2.0;
//        circle.radius= 3.0;

        System.out.println(circle.getArea()); // ?
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getX()); // ? null 0 "" 0.0
        System.out.println(circle.getY()); // ?
        System.out.println(circle.color); // ?
    }
}
