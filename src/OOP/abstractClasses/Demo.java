package OOP.abstractClasses;

public class Demo {

    public static void main(String[] args) {
        Person john = new Vegan();
        john.speak();
        john.eat();
        john.breathe();
        john.message();
        System.out.println("*********************");
        Person mia = new NonVegan();
        mia.speak();
        mia.eat();
        mia.breathe();
        mia.message();
    }
}
