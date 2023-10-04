package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyDeadlock2 {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock1.lock();
                System.out.println("Inside thread 1 lock 1");
                lock2.lock();
                System.out.println("Inside thread 1 lock 2");
                lock2.unlock();
                lock1.unlock();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock2.lock();
                System.out.println("Inside thread 2 lock 2");
                lock1.lock();
                System.out.println("Inside thread 2 lock 1");
                lock2.unlock();
                lock1.unlock();
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Inside main thread");
    }
}
