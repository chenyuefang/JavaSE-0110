package demo.day04;

public class RandomTest {
    public static void main(String[] args) {
//        Math math = new Math();
        System.out.println(Math.random()); // static

        for (int i = 0; i < 10000; i++) {
            double r = Math.random(); //  [0.0, 1.0)
            int n = (int) (r * 20) + 1; // [1, 20]

            System.out.println(n);
        }

        // java.util.Random

    }
}
