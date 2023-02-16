package OOP.InnerClasses;

abstract class Lock {
    public abstract boolean isUnLocked(String keycode);
}
public class Door3 {
    Lock lock = new Lock() {
        @Override
        public boolean isUnLocked(String keycode) {
            if(keycode.equals("qwerty")) {
                return false;
            } else return true;
        }
    };

    public Lock getLock() {
        return lock;
    }
}
