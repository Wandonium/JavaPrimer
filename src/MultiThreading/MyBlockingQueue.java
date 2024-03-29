package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                queue.put(MyBlockingQueue.counter++);
                System.out.println("Value added in queue: " + MyBlockingQueue.counter);
                System.out.println("Array blocking queue: " + queue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
}
class Consumer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(5000);
                queue.take();
                MyBlockingQueue.counter--;
                System.out.println("Value removed in queue: " + MyBlockingQueue.counter);
                System.out.println("Array blocking queue: " + queue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
}
public class MyBlockingQueue {

    static int counter = 0;
    public static void main(String[] args) {
        // ArrayBlockingQueue is a Thread-Safe collection.
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Thread producerThread = new Thread(producer);
        // Runs until the queue has reached it's capacity i.e 10 and 
        // then blocks/stops the execution until the queue has capacity again.
        producerThread.start();

        Consumer consumer = new Consumer(queue);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
    }
}
