public class Generics {

    public static void main(String[] args) {
        // use of the Data class with type casting
        Data data = new Data("Some String");
        String var = (String) data.getObj();
        System.out.println("var: " + var);
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
