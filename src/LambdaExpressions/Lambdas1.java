package LambdaExpressions;

interface Lambda {
    public void demo();
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

        Lambda lambda2 = ()->System.out.println("Inside demo method of Lambda interface using lambda expression...");
        lambda2.demo();
    }    
}
