package demo.day04;

/**
 * 封装性
 *
 * 包 package
 * 组织类的目录结构
 *
 * 访问限定修饰符
 *
 * 类的访问方式
 *      public 公有 所有包都可以访问
 *      default 缺省 只有当前包可以访问
 *
 *
 * 类成员的访问方式
 *      public
 *      default
 *      private 私有 只有当前类内部可以访问
 *      protected 受保护的 同一个包可以访问，外包中当前类的子类的实例可以访问
 *
 */


public class Human {

    protected String name;

    public void study(){
        name = "";
    }
}
