import java.util.Scanner;

public class MethodsPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle is: " + area(length, width));
    }

    public static double area(double length, double width) {
        return length * width;
    }
}
