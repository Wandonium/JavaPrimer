package MultiThreading;

public class Interrupts {
    static int balance = 0;

    public void withdraw(int amount) {
        // here this will be the obj object created in the main method below.
        synchronized (this) {
            if(balance <= 0) {
                try {
                    System.out.println("Waiting for balance update...");
                    wait(6000);
                } catch (InterruptedException e) {
                    System.out.println("Thread got interrupted");
                    return;
                }
            }
        }
        // no need for the else block since execution won't reach this part
        // if balance is 0 because of the call to wait() method.
        balance = balance - amount;
        System.out.println("Successfully withdrew amount: " + amount);
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Interrupts obj = new Interrupts();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(1000);
            }
        });
        thread.start();
        if(balance <= 0) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread.interrupt();
        }
    }
}
