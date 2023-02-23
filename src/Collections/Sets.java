package Collections;

import java.util.*;

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

        // HashSet returns random ordering while LinkedHashSet
        // returns the input order.
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        for(int i=10; i>0; i--) {
            hashSet.add(i);
            linkedSet.add(i);
        }
        System.out.println("hashSet: " + hashSet);
        System.out.println("linkedSet: " + linkedSet);

        // TreeSet sorts the values it's given in an ascending order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Car");
        treeSet.add("Bus");
        treeSet.add("Motorbike");
        treeSet.add("Bicycle");
        treeSet.add("Truck");
        System.out.println("treeSet: " + treeSet);

        // Sets do not ignore duplicate objects:
        ObjectSet();

        // TreeSet with objects and Comparator
        ObjectTreeSet();
    }

    public static void ObjectSet() {
        Set<Data> set = new HashSet<>();
        set.add(new Data(1, "one"));
        set.add(new Data(2, "two"));
        set.add(new Data(3, "three"));
        set.add(new Data(3, "three"));
        // Notice how we do not ignore the duplicated new Data(3, "three")
        // because this is an object which has a different memory location
        System.out.println("set: " + set);
    }

    public static void ObjectTreeSet() {
        // This causes an error because the Data class does not have a
        // compareTo method to be used by the TreeSet to sort the values
        //Set<Data> set = new TreeSet<>();

        Comparator<Data<Integer, String>> compareKey = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
                if(o1.getKey() > o2.getKey()) {
                    return 1;
                } else if(o1.getKey() < o2.getKey()) {
                    return -1;
                } else return 0;
            }
        };
        Set<Data<Integer, String>> set = new TreeSet<>(compareKey);
        set.add(new Data(3, "three"));
        set.add(new Data(1, "one"));
        set.add(new Data(2, "two"));
        set.add(new Data(3, "three"));
        // Note that the value new Data(3, "three") will not be repeated:
        System.out.println("treeSet: " + set);
    }

    static class Data<K,V> {
        private K key;
        private V value;

        public Data(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
