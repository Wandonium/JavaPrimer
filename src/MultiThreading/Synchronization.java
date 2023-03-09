package MultiThreading;

class Brackets {
    synchronized public void generate() {
        for(int i=0; i<=10; i++) {
            if(i<=5) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }
}
public class Synchronization {
    public static int counter = 0;

    public static void main(String[] args) {
        problem();
        generateBrackets();
    }

    public static void generateBrackets() {
        Brackets brackets = new Brackets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=5; i++) {
                    // use of synchronized method
                    //brackets.generate();
                    // Synchronization is for when two threads are accessing
                    // the same object.
                    new Brackets().generate();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=5; i++) {
                    // use of synchronized method
                    //brackets.generate();
                    // Synchronization is for when two threads are accessing
                    // the same object.
                    new Brackets().generate();
                }
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
