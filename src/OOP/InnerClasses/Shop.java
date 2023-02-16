package OOP.InnerClasses;

public class Shop {

    public static void main(String[] args) {
        Door door = new Door();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();

        Door2 door2 = new Door2();
        //System.out.println(door2.isLocked("qwerty"));
        //System.out.println(door2.isLocked("qwerty2"));
        if(door2.isLocked(args[0])) {
            System.out.println("Shop is closed! Come back later.");
        } else {
            System.out.println("Welcome, we are open!");
        }
    }
}
