package OOP.inheritance;

public class Fish extends Animal {

    private boolean livesInWater;
    private boolean hasGills;

    public Fish(double height, double weight, String type, String bloodType, boolean livesInWater, boolean hasGills) {
        super(height, weight, type, bloodType);
        this.livesInWater = livesInWater;
        this.hasGills = hasGills;
    }

    public Fish() {
    }

    public boolean isLivesInWater() {
        return livesInWater;
    }

    public void setLivesInWater(boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    public boolean isHasGills() {
        return hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "livesInWater=" + livesInWater +
                ", hasGills=" + hasGills +
                '}';
    }
}
