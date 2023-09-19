package MultiThreading;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread {
    private CountDownLatch latch;

    public SomeThread(CountDownLatch mLatch) {
        latch = mLatch;
    }

    @Override
    public void run() {
        System.out.println("Thread running with name: " + Thread.currentThread().getName());
        System.out.printf("%s execution completed\n", Thread.currentThread().getName());
        System.out.println("***********************************************************************");
        // Do countdown for each thread
        latch.countDown();
    }
}
public class MyCountDownLatch {
    public static void main(String[] args) {
        // Create a CountDown latch with a count of 4
        CountDownLatch latch = new CountDownLatch(4);
        SomeThread thread1 = new SomeThread(latch);
        SomeThread thread2 = new SomeThread(latch);
        SomeThread thread3 = new SomeThread(latch);
        SomeThread thread4 = new SomeThread(latch);
        SomeThread thread5 = new SomeThread(latch);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            // Lock execution here with the latch until the count down
            // is complete.
            latch.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("I am in main thread...");
    }
}
