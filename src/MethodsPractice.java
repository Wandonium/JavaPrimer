import java.util.Scanner;

public class MethodsPractice {

    // practicing use of methods in Java.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle is: " + area(length, width));
        System.out.println("Area of rectangle of length 14.25 and width 10.65 is: " +
                area(14.25d, 10.65d));
        System.out.println("Area of rectangle of length 14 and width 10 is: " +
                area(14, 10));
        System.out.println("Area of rectangle of length 14 and width 14 is: " +
                area(14));
    }

    public static double area(double length, double width) {
        return length * width;
    }

    // Illustrating method overloading in Java using different
    // parameter types.
    public static int area(int length, int width) {
        return length * width;
    }

    // Illustrating method overloading in Java using different
    // number of parameters
    public static double area(double length) {
        return length * length;
    }
}
