package OOP.composition;

public class Demo {

    public static void main(String[] args) {
        GraphicsCard graphicsCard = new GraphicsCard(
                "Nvidia",
                940,
                "2GB"
        );
        Processor processor = new Processor(
                "Intel",
                "i5 7200u",
                7,
                2,
                4,
                "3MB",
                "2.5Ghz",
                "2.5Ghz",
                "3.1Ghz"
        );

        Laptop laptop = new Laptop(
                15.6f,
                processor,
                "DDR4",
                "2TB",
                graphicsCard,
                "MLT layer",
                "backlit"
        );
        System.out.println("Laptop: " + laptop);
    }
}
