package demo.day05;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "abc");
        map.put(2, "def");
        map.put(1, "ghi");

        System.out.println(map.get(1));
    }
}
