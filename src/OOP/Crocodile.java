package OOP;

public class Crocodile extends Reptile {

    private String eggType = "Hard-Shelled";

    public Crocodile(double height, double weight, String type, String bloodType, boolean drySkin, boolean backbone) {
        super(height, weight, type, bloodType, drySkin, backbone);
    }

    public Crocodile() {
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "eggType='" + eggType + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println(this);
    }
}
