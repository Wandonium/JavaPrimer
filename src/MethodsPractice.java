import java.util.Scanner;

public class MethodsPractice {

    // practicing use of methods in Java.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("\nEnter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("\nArea of rectangle is: " + area(length, width));
    }

    public static double area(double length, double width) {
        return length * width;
    }
}
