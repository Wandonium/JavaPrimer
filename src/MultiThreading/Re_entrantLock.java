package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Re_entrantLock {
    static int counter = 0;
    // add the Reentrant lock
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // lock execution here until for loop completes. No other thread
                // will be able to execute until we unlock.
                lock.lock();
                // add try-finally block just in case there is an exception in 
                // the code we locked. This is to avoid a scenario where we never
                // unlock.
                try {
                    for(int i = 0; i <= 1000; i++) {
                        Re_entrantLock.counter++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // lock execution here until for loop completes.
                lock.lock();
                for(int i = 0; i <= 500; i++) {
                    Re_entrantLock.counter++;
                }
                lock.unlock();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Value of counter: " + Re_entrantLock.counter);
    }
}
