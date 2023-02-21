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

        // Notice that names is passed to the function by reference
        // rather than by value. Hence, changing the names[0] value in
        // the method also changes it in the main method.
        String[] names = {"Chaand", "John", "James"};
        System.out.println("First name before method call: " + names[0]);
        displayNames(names);
        System.out.println("First name after method call: " + names[0]);
    }

    static void displayValue(int var) {
        var += 10;
        System.out.println("var inside method: " + var);
    }

    static void displayNames(String[] arr) {
        arr[0] = "Peter";
        System.out.println("Names inside method:");
        for(String name: arr) {
            System.out.println(name);
        }
    }
}
