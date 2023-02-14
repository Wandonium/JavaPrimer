package OOP.interfaces;

public class OnePlus5 implements Phone {
    @Override
    public String processor() {
        return "SD835";
    }

    @Override
    public String os() {
        return "Android";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }
}
