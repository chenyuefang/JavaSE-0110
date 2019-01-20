package demo.day10;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class ExceptionDemo {



    public static void a() throws NullPointerException { // NPE
        try {
            b();
            System.out.println(6);
        } catch (FileNotFoundException e) {
            System.out.println(7);
        }
        System.out.println(8);
        throw new NullPointerException();
    }

    private static void b() throws FileNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("c:/Hello.java", "rw");
        System.out.println(0);
    }

    public static void main(String[] args) {
        try {
            System.out.println(1);
            a();
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
}

// 178345
// 1068345
