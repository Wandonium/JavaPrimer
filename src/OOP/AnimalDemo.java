package OOP;

public class AnimalDemo {

    public static void main(String[] args) {
        Eagle eagle = new Eagle(
                90.78d,
                70.89d,
                "Bird",
                "A+",
                true,
                true
        );
        eagle.showInfo();
    }
}
