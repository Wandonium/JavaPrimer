public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // specify value_f as a float value
        float value_f = 9f;
        // specify value_d as a double value
        double value_d = 10d;

        // use specific character to mark floating point value
        // in calculation:
        int number = 512;
        double percentage = number * 0.46f;
        System.out.println("46% of " + number + " is: " + percentage);

        // outputting character variable
        char ampersand = '&';
        System.out.println("ampersand: " + ampersand);

        // printing out a smiley face in Java
        // ref: http://dplatz.de/blog/2019/emojis-for-java-commandline.html
        String smileyFace = "\uD83D\uDE00";
        System.out.println("Smiley face: " + smileyFace);

    }
}