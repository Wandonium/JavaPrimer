public class Generics {

    public static void main(String[] args) {

    }

    class Data {
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
