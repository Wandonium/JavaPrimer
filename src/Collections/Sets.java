package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
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
        // No get method in sets
        System.out.println("set contains 'peter': " + set.contains("peter"));

        // HashSet returns random ordering while LinkedSet
        // returns the input order.
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        for(int i=10; i>0; i--) {
            hashSet.add(i);
            linkedSet.add(i);
        }
        System.out.println("hashSet: " + hashSet);
        System.out.println("linkedSet: " + linkedSet);

    }
}
