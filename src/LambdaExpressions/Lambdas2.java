package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
    private String name;

    public Data(String name) {
        super();
        this.name = name;
    }

    public String getName() { return this.name; }

    @Override
    public String toString() {
        return "Data [name=" + name + "]";
    }
}

public class Lambdas2 {
    public static void main(String[] args) {
        List<Data> list = new ArrayList();
        list.add(new Data("Peter"));
        list.add(new Data("Matthew"));
        list.add(new Data("Mark"));
        list.add(new Data("John"));
        list.add(new Data("James"));

        // Sort list of names using Comparator interface:
        /* Collections.sort(list, new Comparator<Data>() {
           @Override
           public int compare(Data o1, Data o2) {
                return o1.getName().compareTo(o2.getName());
           } 
        }); */
        
        // Sort list of names using Lambda expression with Comparator interface
        Collections.sort(list, (Data o1, Data o2)->o1.getName().compareTo(o2.getName()));
        for(Data d: list) {
            System.out.println(d.getName());
        }
    }
}
