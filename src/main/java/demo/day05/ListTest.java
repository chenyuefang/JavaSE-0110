package demo.day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List 列表
 * 有序的（索引）
 * 元素可重复
 *
 * Set 集合
 * 无序的
 * 元素不能重复 -> 去重
 *
 * Map 映射
 * key - value pairs 键 - 值 对
 *
 */
public class ListTest {

    public static void main(String[] args) {
        // Java 的泛型 generic 泛华的  general 普遍的 一般的
        List<String> strings = new ArrayList<>();

        // 1. 存
        strings.add("hello");
        strings.add("hi1");
        strings.add("hi2");

        // 2. 取
        System.out.println(strings.get(0));

        // 3. 统计
        System.out.println(strings.size());

        // 4. 迭代
        for (String string : strings) {
            System.out.println(string);
        }

        /**
         * Integer 是 int 的封装类
         * Double 是 double 的封装类
         * Boolean 是 boolean 的封装类
         */
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(1);
        ints.add(1);

        for (Integer anInt : ints) {
            System.out.println(anInt);
        }

    }
}