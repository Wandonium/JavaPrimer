public class ComparableInterface {

    public static void main(String[] args) {

    }

    static class Data<T> {
        private T var;

        public Data(T var) {
            this.var = var;
        }

        public T getVar() {
            return var;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "var=" + var +
                    '}';
        }
    }
}
