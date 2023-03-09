package MultiThreading;

public class VolatileKeyword {
    // Mark variable as volatile so that it won't be cached by
    // the thread. Whenever a thread is based on a variable, mark
    // the variable as volatile!!
    volatile public static int flag = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    if(flag != 0) break;
                    System.out.println("Running");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag = 1;
                System.out.println("Flag updated!");
            }
        }).start();
    }
}
