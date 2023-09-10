package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DoThread extends Thread {
    private String name;

    public DoThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread: " + name);
        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending thread: " + name);
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        DoThread t1 = new DoThread("Thread1");        
        DoThread t2 = new DoThread("Thread2");        
        DoThread t3 = new DoThread("Thread3");        
        DoThread t4 = new DoThread("Thread4");        
        DoThread t5 = new DoThread("Thread5");
        
        // Get the threads to run all at the same time in whichever order
        /* t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start(); */

        // Get the threads to run sequentially, 2 at a time
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);
        executorService.execute(t4);
        executorService.execute(t5);

        // Always remember to shutdown the executor service.
        executorService.shutdown();
    }
}
