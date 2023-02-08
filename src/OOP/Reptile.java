package OOP;

public class Reptile extends Animal{

    private boolean drySkin;
    private boolean backbone;
    private String eggType = "Soft-Shelled";

    public Reptile(double height, double weight, String type, String bloodType, boolean drySkin, boolean backbone) {
        super(height, weight, type, bloodType);
        this.drySkin = drySkin;
        this.backbone = backbone;
    }

    public Reptile() {
    }

    public boolean isDrySkin() {
        return drySkin;
    }

    public void setDrySkin(boolean drySkin) {
        this.drySkin = drySkin;
    }

    public boolean isBackbone() {
        return backbone;
    }

    public void setBackbone(boolean backbone) {
        this.backbone = backbone;
    }
}
