package Collections;

import java.util.*;

public class SearchAndSort {
    public static void main(String[] args) {
        Set<Name> set = new HashSet<>();
        set.add(new Name("John"));
        set.add(new Name("Peter"));
        set.add(new Name("James"));
        set.add(new Name("Mark"));

        // Convert Set to List
        List<Name> list = new LinkedList<>();
        list.addAll(set);
        System.out.println("list: " + list);
        // sort list
        Collections.sort(list);
        System.out.println("sorted list: " + list);
        // using binary search
        System.out.println("search for Mark: " + Collections.binarySearch(list, new Name("Mark")));
    }

    static class Name implements Comparable<Name> {
        private String name;

        public Name(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Name name1 = (Name) o;
            return name.equals(name1.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Name{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Name o) {
            return name.compareTo(o.name);
        }
    }
}
