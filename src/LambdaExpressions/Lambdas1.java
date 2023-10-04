package LambdaExpressions;


interface Lambda {
    public void demo();
    // We can use lambda expressions only with functional interfaces
    // i.e interfaces with a single function.
    // public void demo2(int x);
}

interface Lambda2 { public int demo(); }

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

        Lambda2 lambda4 = ()->10;
        System.out.println("Lambda expresion that returns a value: " + lambda4.demo());
        

        // Runnable interface is a functional interface so it's perfect for lambda expressions
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable interface is a functional interface...");
            }
        });
        Thread t2 = new Thread(()->System.out.println("Runnable interface using lambda expression"));
        t1.start(); t2.start();
        new Thread(()->{
            System.out.println("Runnable interface multiple statements");
            System.out.println("Runnable interface lambda expression multiple stmts");
        }).start();
    }    
}
