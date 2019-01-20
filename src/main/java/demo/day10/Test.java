package demo.day10;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 异常处理
 * Exception
 * <p>
 * 在 try 中，发生异常处后面的代码都不再执行，无论这个异常有没有被 catch
 * finally 语句总是会被执行
 * <p>
 * 异常的类层次结构：
 * <p>
 * Object
 *      Throwable
 *          Exception
 *              RuntimeException 非受检异常
 *              ... 受检异常
 *          Error
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println("hello");
//        int[] ints = {1, 2, 3};
//
//        System.out.println(1 / 0);
//
//        try {
//            System.out.println(ints[3]); // ArrayIndexOutOfBoundsException
//
//            String s = "hello";
//            System.out.println(s.charAt(5));
//            System.out.println("test");
//        } catch (ArithmeticException e) {
//
////            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            //
//        }finally {
//            System.out.println("finally");
//        }
//
//        System.out.println("hi");


        // 受检异常
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("", "");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
java.lang.ArithmeticException: / by zero
	at demo.day10.Test.main(Test.java:13)

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at demo.day10.Test.main(Test.java:13)
 */


