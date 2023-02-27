package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Peter");
        map.put(1, "John");
        map.put(2, "James");
        // HashMap does not guarantee the sorting of the entries
        System.out.println("unsorted map: " + map);
        // for-each loop when dealing with maps:
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
