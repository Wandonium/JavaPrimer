package MultiThreading;

public class Join {
    public int counter = 0;

    public static void main(String[] args) {
        Join join = new Join();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 1000; i++) {
                    join.counter++;
                }
            }
        }).start();
        System.out.println("Counter: " + join.counter);
    }
}
