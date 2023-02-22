public class Generics {

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
