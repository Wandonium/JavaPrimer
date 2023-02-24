package Collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> listQueue = new LinkedBlockingQueue<>();
        // Notice that with ArrayBlockingQueue we have to provide a
        // length/size variable
        Queue<Integer> arrayQueue = new ArrayBlockingQueue<>(5);
        for(int i=0; i<5; i++) {
            // add element to the end of the queue i.e LIFO
            listQueue.add(i);
            arrayQueue.add(i);
        }
        System.out.println("listQueue: " + listQueue);
        System.out.println("arrayQueue: " + arrayQueue);

        // get first element in queue i.e LIFO
        System.out.println("First element: " + listQueue.element());
        // remove first element in queue i.e LIFO
        listQueue.remove();
        System.out.println("listQueue after remove operation: " + listQueue);
    }
}
