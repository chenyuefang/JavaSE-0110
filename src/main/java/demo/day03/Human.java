package demo.day03;

/**
 * 类 = 域 + 方法
 */
public class Human {
    // 1. 域：类似于变量的定义
    String name;
    char gender; // '男' '女' "Male" "Female"
    int age; // int [?]
    double height;
    double weight;

    // 2. 方法
    // void：返回类型，没有返回任何值
    void study(int hours) {
        System.out.println(name + " is study " + hours + " hours.");
    }

    void work(int days) {
        System.out.println(name + " is work " + days + " days in this month.");
//        return;
    }

    String getName() {
       return name;
    }

/*
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hi";
        System.out.println(s1 + s2); // + 字符串的拼接
        System.out.println(1 + 2);
        System.out.println(1 + s1);
        System.out.println(1 + "" + 2);
    }
    */
}
