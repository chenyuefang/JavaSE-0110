package demo.day04;

/**
 * Array 数组: 存放同一类型数据的数据结构
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // 静态性
//        int ints [] = new int[10];

        numbers[0] = 1850001;

        System.out.println(numbers[0]);

        System.out.println(numbers.length);

        String[] strings = {"hello", "hi"};

        System.out.println(strings.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------");

        // for-each loop
        for (int n : numbers) {
            System.out.println(n);
        }

        // iter + Tab
        for (String string : strings) {
            System.out.println(string);
        }

        // 定义一个数组，可以存放任意类型数据？

        Object[] objects = {123, "hello", 1.23, true};

        int[][] ints = new int[100][999];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
            }
        }

        int x = ints.length - 1;
        System.out.println(x);
        int y = ints[ints.length - 1].length - 1;
        System.out.println(y);
        System.out.println(ints[x][y]);

        int[][] ints1 = {
                {1, 2, 3, 4},
                {1, 2},
                {1, 2, 3}
        };


    }
}
