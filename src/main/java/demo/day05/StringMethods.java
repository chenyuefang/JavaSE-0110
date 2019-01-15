package demo.day05;

public class StringMethods {
    public static void main(String[] args) {
        String str = " Hello, World! "; // 直接量
//        - `charAt`
        System.out.println(str.charAt(0));
//        - `concat` `abbr of concatenate [kɒn'kætɪneɪt]`
        System.out.println(str.concat("test"));
//        - `contains`
        System.out.println(str.contains("world"));
//        - `endsWith`
        System.out.println(str.endsWith("!"));
//        - `equals`
        System.out.println(str.equals("Hello, world!"));
//        - `equalsIgnoreCase`
        System.out.println(str.equalsIgnoreCase("Hello, world!"));
//        - `getBytes`
        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
//        - `indexOf`
        System.out.println(str.indexOf('H'));
        System.out.println(str.indexOf("Hello"));
        System.out.println(str.indexOf("l", 3)); // Ctrl + Q
//        - `isEmpty`
        System.out.println(str.length());
        System.out.println(str.isEmpty());
//        - `lastIndexOf`
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));
//        - `length`
        System.out.println("".length());
        System.out.println("".isEmpty());
//        - `matches`
        System.out.println(str.matches("[A-z\\s,!]+")); // Regular Expression 正则表达式 JavaScript
//        - `replace`
        System.out.println(str.replace("Hello", "hELLO"));
//        - `replaceAll`
        System.out.println(str.replaceAll("[A-z]", " "));
//        - `replaceFirst`
        System.out.println(str.replaceFirst("[a-z]", "@"));
//        - `split`
        String[] strings = str.split("[a-z]+");
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
//        - `startsWith`
        System.out.println(str.startsWith("Hello"));
//        - `subString`
        System.out.println(str.substring(str.indexOf('W'), str.lastIndexOf('l')));
//        - `toCharArray`
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
//        - `toLowerCase`
        System.out.println(str.toLowerCase());
//        - `toUpperCase`
        System.out.println(str.toUpperCase());
//        - `trim`
        System.out.println("a" + str + "a");
        System.out.println("a" + str.trim() + "a");
//        - `valueOf`
        System.out.println(String.valueOf(123).length());

        // 类型转换 int double
        // 123 -> "123"
        // "123" -> 123 ?
    }
}
