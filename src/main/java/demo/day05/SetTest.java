package demo.day05;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("hello");
        strings.add("hi");
        strings.add("hi");

        System.out.println(strings.size());
    }
}
