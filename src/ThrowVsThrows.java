import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowVsThrows {

    // illustrating the difference between throw and
    // throws keywords in Java when dealing with exceptions
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    public static void someMethod() throws FileNotFoundException {
        FileReader in = new FileReader("file.txt");
    }

    public static void throwException() throws Exception {
        throw new Exception("I'm throwing an exception!");
    }
}
