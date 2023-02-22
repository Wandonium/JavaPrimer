import java.util.LinkedList;
import java.util.List;

public class Generics {

    /*
    *   Java naming conventions when using Generics:
    *   T - Type
    *   E - Element
    *   K - Key
    *   N - Number
    *   V - Value
     */

    public static void main(String[] args) {
        // use of the Data class with type casting
        // no use of generics
        Data data = new Data("Some String");
        String var = (String) data.getObj();
        System.out.println("var: " + var);

        // using generics
        GenericClass<String> genericClass = new GenericClass<String>("Some data");
        String genericData = genericClass.getData();
        System.out.println("genericData: " + genericData);

        // using generics to create a list with elements
        // of multiple data types
        List<ListData> list = new LinkedList<>();
        list.add(new ListData("Some text"));
        list.add(new ListData(1.0));
        list.add(new ListData(1));
        list.add(new ListData('%'));
        list.add(new ListData(5.0f));
        System.out.println("list: " + list);

        // using generics to create a custom Map class
        KeyVal<Integer, String> keyVal = new KeyVal<>(1, "Text");
        System.out.println("keyVal: " + keyVal);
    }

    static class KeyVal<K,V> {
        private K key;
        private V value;

        public KeyVal(K key, V value) {
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
            return "KeyVal{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    static class ListData<T> {
        private T var;

        public ListData(T var) {
            this.var = var;
        }

        public T getVar() {
            return var;
        }

        @Override
        public String toString() {
            return "ListData{" +
                    "var=" + var +
                    '}';
        }
    }

    static class GenericClass<T> {
        private T data;

        public GenericClass(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        @Override
        public String toString() {
            return "GenericClass{" +
                    "data=" + data +
                    '}';
        }
    }

    static class Data {
        private Object obj;

        public Data(Object obj) {
            this.obj = obj;
        }

        public Object getObj() {
            return obj;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "obj=" + obj +
                    '}';
        }
    }
}