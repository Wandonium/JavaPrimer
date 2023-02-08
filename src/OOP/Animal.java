package OOP;

public class Animal {

    private double height;
    private double weight;
    private String type;
    private String bloodType;

    public Animal(double height, double weight, String type, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.type = type;
        this.bloodType = bloodType;
    }

    public Animal() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
