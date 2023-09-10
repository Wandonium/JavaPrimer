package MultiThreading;

public class Join {
    public int counter = 0;

    public static void main(String[] args) {
        Join join = new Join();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    join.counter++;
                }
            }
        });
        //thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int i = 0; i < 1000; i++) {
                    join.counter++;
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            //Thread.sleep(2000);
            //thread2.join();
            // we can also use this version of join with the given milliseconds.
            // this version will wait for the given milliseconds or until thread2 finishes
            // executing before returning to the main thread
            thread2.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // using the join method to synchronize two threads:
        /*try {
            // main thread will now wait for thread1 to finish executing
            // before moving forward.
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("Counter: " + join.counter);
    }
}
