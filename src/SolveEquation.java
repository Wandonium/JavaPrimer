public class SolveEquation {

    public static void main(String[] args) {
        // create a program for solving the equation
        // (a+b)square = ((a*a) + 2ab + (b*b));
        int a = 2;
        int b = 4;
        float af = 3.5f;
        float bf = 4.6f;
        System.out.println("(a+b)squared int = " + int_aPlus_bSquared(a, b));
        System.out.println("(a+b)squared float = " + float_aPlus_bSquared(af, bf));
    }

    public static int int_aPlus_bSquared(int a, int b) {
        int aSquared = a * a;
        int bSquared = b * b;
        int mid = 2 * a * b;
        return aSquared + bSquared + mid;
    }

    public static double float_aPlus_bSquared(float a, float b) {
        float aSquared = a * a;
        float bSquared = b * b;
        float mid = 2 * a * b;
        return aSquared + bSquared + mid;
    }
}
