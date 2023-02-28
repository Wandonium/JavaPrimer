package MultiThreading;

class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    public void countMe() {
        for(int i=0; i<=9; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i: " + i + "\tthreadNo: " + threadNo);
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);
        counter1.countMe();
        System.out.println("*******************************");
        counter2.countMe();
    }
}
