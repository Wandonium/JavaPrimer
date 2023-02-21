import java.util.Stack;

public class StacksInJava {

    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        for(int i =0; i<=5; i++) {
            demo.push(i);
        }
        System.out.println("demo: " + demo);
    }
}
