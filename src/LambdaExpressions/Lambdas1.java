package LambdaExpressions;

interface Lambda {
    public void demo();
}

public class Lambdas1 {
    public static void main(String[] args) {
        Lambda lambda = new Lambda() {
            
            @Override
            public void demo() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'demo'");
            }
            
        };
    }    
}
