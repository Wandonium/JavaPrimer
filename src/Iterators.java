import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterators {

    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Kenya");
        countries.add("Uganda");
        countries.add("Tanzania");
        printList(countries);
    }

    public static void printList(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
