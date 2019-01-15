package demo.day05;

/**
 * 集合
 * <p>
 * String
 */
public class StringTest {

    public static void main(String[] args) {
        String student = "Tom";

        // 1. 构造方法
        // 选择 3 个构造方法创建一个 String 实例

        String s1 = new String();
        System.out.println(s1);

        byte[] bytes = {84, 111, 109};
        String s2 = new String(bytes);
        System.out.println(s2);

        char[] chars = {'H', 'i', '!'};
        String s3 = new String(chars);
        System.out.println(s3);

        String s4 = new String("hello");
        System.out.println(s4);

        // 2. 成员方法
        //
        // 调用一个成员方法
        System.out.println(student.charAt(0));
        System.out.println(student.contains("Tm"));
        System.out.println(student.endsWith("Tom"));
        byte[] bytes1 = student.getBytes();
        for (byte b : bytes1) {
            System.out.println(b);
        }
    }
}
