package OOP.InnerClasses;

public class Door {
    private Lock lock;

    public Door() {
        lock = new Lock(true);
    }

    public void shopStatus() {
        if(lock.isLock()) {
            System.out.println("Shop is closed! Come back later.");
        } else {
            System.out.println("Welcome, we are open!");
        }
    }

    class Lock {
        private boolean lock;
        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}
