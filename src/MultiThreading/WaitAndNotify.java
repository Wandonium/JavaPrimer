package MultiThreading;

public class WaitAndNotify {
    int balance = 0;

    public void withdraw(int amount) {
        if(balance <= 0) {
            try {
                System.out.println("Waiting for balance update...");
                // Causes the current thread to wait until it is awakened,
                // typically by being notified (notify() method) or interrupted.
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // no need for the else block since execution won't reach this part
        // if balance is 0 because of the call to wait() method.
        balance = balance - amount;
        System.out.println("Successfully withdrawed amount: " + amount);
    }

    public void deposit(int amount) {
        System.out.println("Depositing the amount: " + amount);
        balance += amount;
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
                obj.deposit(2000);
            }
        }).start();
    }
}
