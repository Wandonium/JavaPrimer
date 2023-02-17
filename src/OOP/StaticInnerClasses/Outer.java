package OOP.StaticInnerClasses;

public class Outer {

    private static int testVar = 5;
    private static void testOuterMethod() {
        System.out.println("From outer method");
    }
    public static class Inner {
        public static String var = "Testing inner class static variable";
        public static void testing() {
            System.out.println("Testing inner class method");
            System.out.println("Outer variable test: " + testVar);
            testOuterMethod();
        }
    }
}
