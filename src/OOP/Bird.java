package OOP;

public class Bird extends Animal {

    private boolean hasFeathers;
    private boolean canFly;

    public Bird(double height, double weight, String type, String bloodType, boolean hasFeathers, boolean canFly) {
        super(height, weight, type, bloodType);
        this.hasFeathers = hasFeathers;
        this.canFly = canFly;
    }

    public Bird() {
    }

    public boolean isHasFeathers() {
        return hasFeathers;
    }

    public void setHasFeathers(boolean hasFeathers) {
        this.hasFeathers = hasFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Bird{" +
                "hasFeathers=" + hasFeathers +
                ", canFly=" + canFly +
                '}';
    }
}
