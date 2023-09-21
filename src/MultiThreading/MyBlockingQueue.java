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
public class MyBlockingQueue {

    static int counter = 0;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Thread produceThread = new Thread(producer);
        produceThread.start();
    }
}
