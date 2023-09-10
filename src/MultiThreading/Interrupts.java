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
                    System.out.println("Original balance: " + balance);
                    // Making use of the interrupt method to do stuff when balance > 0
                    balance = balance - amount;
                    System.out.println("Successfully withdrew amount: " + amount);
                    System.out.println("Current balance: " + balance);
                }
            }
        }
    }

    public void deposit(int amount) {
        System.out.println("Depositing the amount: " + amount);
        balance += amount;
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
        /*if(balance <= 0) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread.interrupt();
        }*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(4554);
                thread.interrupt();
            }
        }).start();
    }
}
