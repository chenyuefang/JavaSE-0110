package demo.day03;

/**
 * 类 = 域 + 方法
 *
 * 类是创建对象的模板
 */
public class _2_Human {
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

    // 对象：Object 对象是具体的

    public static void main(String[] args) {
        _2_Human tom = new _2_Human(); // instance 实例对象

        _2_Human jerry = new _2_Human();

        tom.name = "Tom";
        System.out.println(tom.name);

        tom.study(1);
    }
}
