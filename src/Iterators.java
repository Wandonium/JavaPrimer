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
}
