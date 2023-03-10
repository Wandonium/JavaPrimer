package Collections;

import java.sql.SQLOutput;
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
            // add element to the end of the queue i.e FIFO
            listQueue.add(i);
            arrayQueue.add(i);
        }
        System.out.println("listQueue: " + listQueue);
        System.out.println("arrayQueue: " + arrayQueue);

        // get first element in queue i.e FIFO
        System.out.println("First element: " + listQueue.element());
        // remove first element in queue i.e FIFO
        listQueue.remove();
        System.out.println("listQueue after remove operation: " + listQueue);

        Queue<Integer> emptyQueue = new LinkedBlockingQueue<>();
        // Causes an exception. Cannot remove from an empty queue.
        try {
            emptyQueue.remove();
        } catch (Exception e) {
            System.out.println("Queue is empty");
        }
        // Does not cause an exception. Returns null if queue is empty.
        System.out.println("poll empty queue: " + emptyQueue.poll());

        // Causes an exception. Cannot get first element of an empty queue.
        try {
            emptyQueue.element();
        } catch (Exception e) {
            System.out.println("No element in queue");
        }
        // Does not cause an exception. Returns null if queue is empty.
        System.out.println("peek empty queue: " + emptyQueue.peek());

        Queue<Integer> fullArrQueue = new ArrayBlockingQueue<>(2);
        fullArrQueue.add(1);
        fullArrQueue.add(2);
        // Causes an exception. Cannot add to a full ArrayBlockingQueue
        try {
            fullArrQueue.add(3);
        } catch(Exception e) {
            System.out.println("Queue is full!");
        }
        // Does not cause an exception. Returns false if queue is full.
        System.out.println("offer into full array based queue: " + fullArrQueue.offer(3));
    }
}
