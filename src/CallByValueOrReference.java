public class CallByValueOrReference {

    public static void main(String[] args) {
        // Notice that var is passed to the function by value
        // rather than by reference. Hence, it doesn't change in
        // the main method even though it changed in the displayValue
        // method.
        int var = 10;
        System.out.println("var before method call: " + var);
        displayValue(var);
        System.out.println("var after method call: " + var);
    }

    static void displayValue(int var) {
        var += 10;
        System.out.println("var inside method: " + var);
    }
}
