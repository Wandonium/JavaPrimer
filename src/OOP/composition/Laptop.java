package OOP.composition;

public class Laptop {

    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyboard;

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
                  String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    public Laptop() {
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public String gamingMode() {
        this.processor.setFrequency(this.processor.getMaxFrequency());
        return this.processor.getFrequency();
    }
}
