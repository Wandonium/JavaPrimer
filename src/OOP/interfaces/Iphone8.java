package OOP.interfaces;

public class Iphone8 implements Phone{
    @Override
    public String processor() {
        return "A11";
    }

    @Override
    public String os() {
        return "IOS";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }
}
