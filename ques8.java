import java.util.Scanner;

public class CustomExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word with one character replaced by an underscore (_): ");
        String input1 = scanner.nextLine();
        System.out.print("Enter a series of words separated by colons: ");
        String input2 = scanner.nextLine();

        try {
            String output1 = matchFound(input1, input2);
            System.out.println("Matching words: " + output1);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static String matchFound(String input1, String input2) throws InvalidInputException {
        // Validate input1
        if (input1.length() != 1 || !input1.contains("_")) {
            throw new InvalidInputException("Input1 must be a single word with one character replaced by an underscore.");
        }

        // Extract the character to match
        char charToMatch = input1.charAt(0);

        // Split input2 into words
        String[] words = input2.split(":");
        StringBuilder output = new StringBuilder();

        // Find matching words
        for (String word : words) {
            if (word.replace('_', charToMatch).equals(word)) {
                if (output.length() > 0) {
                    output.append(":");
                }
                output.append(word.toUpperCase());
            }
        }

        return output.toString();
    }
}
