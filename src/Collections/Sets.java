package Collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Sets ignore duplicate values:
        Set<String> set = new HashSet<>();
        set.add("Peter");
        set.add("John");
        set.add("James");
        set.add("Peter");
        System.out.println("set: " + set);
    }
}
