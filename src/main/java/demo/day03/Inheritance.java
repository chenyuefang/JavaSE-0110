package demo.day03;

public class Inheritance {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.brand);
        car.run();
    }
}

/**
 * Vehicle: 交通工具
 * <p>
 * class = fields + methods
 */
class Vehicle {
    String color;
    double speed;
    String brand;

    public Vehicle() {
    }

    public Vehicle(String color, double speed, String brand) {
        this.color = color;
        this.speed = speed;
        this.brand = brand;
    }

    void run() {
        System.out.println("run...");
    }

    void stop() {

    }
}

class Car extends Vehicle {

}
