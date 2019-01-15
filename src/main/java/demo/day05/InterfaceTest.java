package demo.day05;

/**
 * interface 接口
 * 1. 不能实例化
 * 2. 用来被实现的
 * 3. 对接口的所有实现类做了一个限制和约束的作用
 * 4. 接口可以多实现（类是单继承的）
 *
 * class = fields + methods
 * interface = constants + abstract methods
 */
public interface InterfaceTest {
    // 接口中的常量，默认是 public static 静态的 final 终态的 所有字母全部大写，多个单词 _ 分开
//    public static final int ONE_TWO_THREE = 123;
    int ONE_TWO_THREE = 123;
    double PI = 3.14;
    double E = 2.718;

    // 接口中的方法，都是抽象方法：只有方法的声明，没有实现。默认都是公有的
    void method(int x);

}

class InterfaceTestClass implements InterfaceTest {

    @Override
    public void method(int x) {

    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

class ABC implements A, B, C {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}