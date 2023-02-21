import java.util.*;

public class Iterators {

    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Kenya");
        countries.add("Uganda");
        countries.add("Tanzania");
        printList(countries);
        System.out.println("**********************");
        printListBackwards(countries);
        // sorting list in the default order i.e ascending
        // alphabetic for strings, numerical for ints and floats
        countries.sort(null);
        System.out.println("Sorted countries: " + countries);
        // reversing list
        Collections.reverse(countries);
        System.out.println("Reversed countries: " + countries);

        // illustrating use of Comparable interface, and it's
        // compareTo method to sort lists
        List names = new LinkedList<>();
        names.add(new Names("Matthew"));
        names.add(new Names("Mark"));
        names.add(new Names("Peter"));
        Collections.sort(names);
        System.out.println("Sorted by country name length: " + names);
    }

    public static void printList(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }

    public static void printListBackwards(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            iterator.next();
        }
        while(iterator.hasPrevious()) {
            System.out.println("Element: " + iterator.previous());
        }
    }

    static class Names implements Comparable<Names> {
        private String name;

        public Names(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Names o) {
            if(name.length() == o.name.length())
                return 0;
            else if(name.length() < o.name.length())
                return -1;
            else return 1;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
