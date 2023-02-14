package OOP.interfaces;

public class Demo {

    public static void main(String[] args) {
        // Polymorphism using interfaces.
        Phone phone = new OnePlus5();
        System.out.println("Processor: " + phone.processor());
        Phone phone2 = new Iphone8();
        System.out.println("Processor: " + phone2.processor());
    }
}
