package demo.day05;

public class Test {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();

//        InterfaceTest interfaceTest = new InterfaceTest();

        InterfaceTestClass interfaceTestClass = new InterfaceTestClass();
        interfaceTestClass.method(1);

//        interfaceTestClass.ONE_TWO_THREE = 321;
        System.out.println(InterfaceTest.ONE_TWO_THREE);

        Shape square = new Circle(1); // new Square(2);
        System.out.println(square.getArea());
    }
}
