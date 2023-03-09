package MultiThreading;

class Brackets {
    //synchronized public void generate() {
    public void generate() {
        // synchronized block of code:
        synchronized (this) {
            for(int i=0; i<=10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(i<=5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }

        for(int j=0; j<=10; j++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Synchronization {
    public static int counter = 0;

    public static void main(String[] args) {
        //problem();
        generateBrackets();
    }

    public static void generateBrackets() {
        Brackets brackets = new Brackets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i=1; i<=5; i++) {
                    // use of synchronized method
                    brackets.generate();
                    // Synchronization is for when two threads are accessing
                    // the same object.
                    //new Brackets().generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Thread 1 duration: " + (endTime - startTime));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i=1; i<=5; i++) {
                    // use of synchronized method
                    brackets.generate();
                    // Synchronization is for when two threads are accessing
                    // the same object.
                    //new Brackets().generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Thread 2 duration: " + (endTime - startTime));
            }
        }).start();
    }

    public static void problem() {
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
