package Collections;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedBlockingDeque<>();
        for(int i=0; i<5; i++) {
            deque.add(i);
        }
        System.out.println("LinkedBlockingDeque: " + deque);
    }
}
