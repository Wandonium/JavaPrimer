package OOP;

public class Eel extends Fish {

    private boolean releasesElectricCharge;

    public Eel(double height, double weight, String type, String bloodType, boolean livesInWater, boolean hasGills, boolean releasesElectricCharge) {
        super(height, weight, type, bloodType, livesInWater, hasGills);
        this.releasesElectricCharge = releasesElectricCharge;
    }

    public Eel() {
    }

    public boolean isReleasesElectricCharge() {
        return releasesElectricCharge;
    }

    public void setReleasesElectricCharge(boolean releasesElectricCharge) {
        this.releasesElectricCharge = releasesElectricCharge;
    }

    @Override
    public String toString() {
        return "Eel{" +
                "releasesElectricCharge=" + releasesElectricCharge +
                '}';
    }

    public void showInfo() {
        System.out.println(this);
    }
}
