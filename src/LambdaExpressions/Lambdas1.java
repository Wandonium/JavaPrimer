package LambdaExpressions;


interface Lambda {
    public void demo();
    // We can use lambda expressions only with functional interfaces
    // i.e interfaces with a single function.
    // public void demo2(int x);
}

public class Lambdas1 {
    public static void main(String[] args) {
        Lambda lambda = new Lambda() {

            @Override
            public void demo() {
                System.out.println("Inside the demo method of the Lambda interface...");
            }
            
        };
        lambda.demo();

        // lambda expression with a single statement.
        Lambda lambda2 = ()->System.out.println("Inside demo method of Lambda interface using lambda expression...");
        lambda2.demo();

        // lambda expression with multiple statements.
        Lambda lambda3 = ()-> {
            System.out.println("Inside demo method 1...");
            System.out.println("Inside demo method 2...");
        };
        lambda3.demo();
    }    
}
