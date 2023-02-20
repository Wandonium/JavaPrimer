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

        try {
            userDefinedExceptions();
        } catch (UserDefinedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void someMethod() throws FileNotFoundException {
        FileReader in = new FileReader("file.txt");
    }

    public static void throwException() throws Exception {
        throw new Exception("I'm throwing an exception!");
    }

    public static void userDefinedExceptions()
            throws FileNotFoundException, Exception, UserDefinedException {
        int x = 3;

        switch(x) {
            case 1: throw new FileNotFoundException();
            case 2: throw new Exception();
            default: throw new UserDefinedException("Throwing user defined exception");
        }
    }

    public static class UserDefinedException extends Throwable {
        public UserDefinedException(String message) {
            super(message);
        }
    }
}
