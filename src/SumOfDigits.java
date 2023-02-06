import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        // get sum of the digits of a given number
        // e.g sum of digits of 1234 is 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        System.out.print("Sum of the digits of " + num + " is: ");
        int sum = 0;
        while(num > 0) {
            int mod = num % 10;
            if(mod != 0) {
                sum+= mod;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}
