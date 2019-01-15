package demo.day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List 列表
 */
public class ListTest {

    public static void main(String[] args) {
        // Java 的泛型 generic 泛华的  general 普遍的 一般的
        List<String> strings = new ArrayList<>();

        // 1. 存
        strings.add("hello");
        strings.add("hi");
        strings.add("hi");

        // 2. 取
        System.out.println(strings.get(0));

        // 3. 统计
        System.out.println(strings.size());

        // 4. 迭代
        for (String string : strings) {
            System.out.println(string);
        }
    }
}