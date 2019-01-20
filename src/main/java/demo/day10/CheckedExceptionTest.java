package demo.day10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionTest {

    public void method() throws IOException {

    }

    public void m() throws IOException {
            method();
    }

    public static void main(String[] args) {
        CheckedExceptionTest checkedExceptionTest = new CheckedExceptionTest();

        try {
            checkedExceptionTest.m();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
