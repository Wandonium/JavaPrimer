public class ComparableInterface {

    public static void main(String[] args) {
        Data<Integer> data = new Data<Integer>(3);
        System.out.println("using compareTo: "
                + data.compareTo(2));
    }

    static class Data<T extends Comparable> implements Comparable<T>{
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

        @Override
        public int compareTo(T o) {
            return getVar().compareTo(o);
        }
    }
}
