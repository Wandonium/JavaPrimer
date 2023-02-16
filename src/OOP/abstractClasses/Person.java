package OOP.abstractClasses;

public abstract class Person implements IsAlive, LiveLife {
    public void speak() {
        System.out.println("Share his/her thoughts");
    }

    @Override
    public void breathe() {

    }

    @Override
    public void message() {

    }

    public abstract void eat();
}
