package Collections;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Deques {
    // Deques stand for 'double-ended-queues'. You can insert or remove
    // from both ends i.e both head and tail of a deque.
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedBlockingDeque<>();
        for(int i=0; i<5; i++) {
            deque.add(i);
        }
        System.out.println("LinkedBlockingDeque: " + deque);
        // adding to the head of the deque instead of the tail:
        deque.addFirst(-1);
        System.out.println("Add first deque: " + deque);
        // removing from the tail of the deque instead of the head:
        deque.removeLast();
        System.out.println("Remove last deque: " + deque);
    }
}
