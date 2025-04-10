import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            readFile("nonexistent.txt"); // This will throw an IOException
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Method that throws an IllegalArgumentException using throw
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
    }

    // Method that declares it can throw an IOException using throws
    public static void readFile(String filePath) throws IOException {
        FileReader file = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
