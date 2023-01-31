import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {
        // illustrate use of BigDecimalDemo in Java
        // to avoid rounding off errors during calculations
        double x = 1.05;
        double y = 2.55;
        System.out.println("x + y in double form: " + (x+y));
        BigDecimal xd = new BigDecimal(1.05);
        BigDecimal yd = new BigDecimal(2.55);
        System.out.println("x + y in BigDecimal raw: " + (xd.add(yd)));
        BigDecimal xD = new BigDecimal("1.05");
        BigDecimal yD = new BigDecimal("2.55");
        System.out.println("x + y in BigDecimal string: " + (xD.add(yD)));

    }
}
