package MultiThreading;

public class Synchronization {
    public static int counter = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++) {
                    counter++;
                }
                System.out.println("Thread 1 loop is over...");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++) {
                    counter++;
                }
                System.out.println("Thread 2 loop is over...");
            }
        }).start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Notice that both Threads edit counter hence this
        // statement might produce different results each time
        // so we need to synchronize the variable.
        System.out.println("counter: " + counter);
    }
}
