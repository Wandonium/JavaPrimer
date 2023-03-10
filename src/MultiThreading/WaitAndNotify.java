package MultiThreading;

public class WaitAndNotify {
    int balance = 0;

    public void withdraw(int amount) {
        // here this will be the obj object created in the main method below.
        synchronized (this) {
            if(balance <= 0) {
                try {
                    System.out.println("Waiting for balance update...");
                    // Causes the current thread to wait until it is awakened,
                    // typically by being notified (notify() method) or interrupted.
                    //wait();
                    // wait until either notify() method is called or the timeout
                    // has elapsed
                    wait(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        // no need for the else block since execution won't reach this part
        // if balance is 0 because of the call to wait() method.
        balance = balance - amount;
        System.out.println("Successfully withdrew amount: " + amount);
        System.out.println("Current balance: " + balance);
    }

    public void deposit(int amount) {
        System.out.println("Depositing the amount: " + amount);
        balance += amount;
        // making use of synchronized block for the notify() and notifyAll() method calls
        synchronized (this) {
            // Difference between the two: notify() wakes up the longest waiting thread or the
            // thread with the highest priority while notifyAll() wakes up all the threads that
            // are waiting
            //notifyAll();
            notify();
        }
    }

    public static void main(String[] args) {
        WaitAndNotify obj = new WaitAndNotify();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(1000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(4554);
            }
        }).start();
    }
}
