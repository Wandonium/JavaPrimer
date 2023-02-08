package OOP;

public class Eagle extends Bird {

    public Eagle(double height, double weight, String type, String bloodType, boolean hasFeathers, boolean canFly) {
        super(height, weight, type, bloodType, hasFeathers, canFly);
    }

    public Eagle() {
    }

    @Override
    public String toString() {
        return "Eagle{}";
    }

    public void showInfo() {
        System.out.println(super.toString() + "\n" + this);
    }
}
