package demo.project.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
