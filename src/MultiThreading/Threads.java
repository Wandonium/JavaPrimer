package MultiThreading;

import java.util.Random;

class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe() {
        for(int i=0; i<=9; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i: " + i + "\tthreadNo: " + threadNo);
        }
    }
}

class MyCounter2 implements Runnable {
    private int threadNo;

    public MyCounter2(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i=0; i<=9; i++) {
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i: " + i + "\tthreadNo: " + threadNo);
        }
    }
}
public class Threads {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);
        long startTime = System.currentTimeMillis();
        // use start() instead of run() to do something in
        // a different thread. The run() method should be called by the JVM
        //counter1.run();
//        counter1.start();
//        System.out.println("*******************************");
//        counter2.start();
//        Thread.sleep(4500); // insufficient sleep time
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken in milliseconds: " + (endTime - startTime));
        runnableInterface();
    }

    public static void runnableInterface() {
        // creating Threads using the Runnable Interface:
        Thread thread1 = new Thread(new MyCounter2(1));
        Thread thread2 = new Thread(new MyCounter2(2));
        thread1.start();
        thread2.start();
    }
}
