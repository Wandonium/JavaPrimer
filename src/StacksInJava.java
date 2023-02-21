import java.util.Stack;

public class StacksInJava {

    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        for(int i =0; i<=5; i++) {
            demo.push(i);
        }
        System.out.println("demo: " + demo);
        // using peek method to check the last element
        // in the stack without popping it.
        System.out.println("peek: " + demo.peek());
        // using pop to remove last element coz its LIFO
        System.out.println("pop: " + demo.pop());
        // stack after pop operation
        System.out.println("after pop: " + demo);
    }
}
