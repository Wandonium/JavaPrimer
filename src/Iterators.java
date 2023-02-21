import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Kenya");
        countries.add("Uganda");
        countries.add("Tanzania");
        printList(countries);
        System.out.println("**********************");
        printListBackwards(countries);
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
