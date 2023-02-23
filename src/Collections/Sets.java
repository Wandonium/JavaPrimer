package Collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Sets ignore duplicate values!
        // Also note that the order of input is not respected
        // in the output.
        Set<String> set = new HashSet<>();
        set.add("Peter");
        set.add("John");
        set.add("James");
        set.add("Peter");
        // Note that Sets do not ignore values with a different
        // case i.e. lowercase vs uppercase
        set.add("peter");
        System.out.println("set: " + set);
    }
}
