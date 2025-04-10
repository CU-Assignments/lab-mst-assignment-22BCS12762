import java.util.Scanner;

public class AlphabetAppender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = appendAlphabets(input);
        System.out.println("Output string: " + output);
        scanner.close();
    }

    private static String appendAlphabets(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            result.append(currentChar); // Append the current character

            // Check if the current character is an alphabet and not the last character
            if (i < length - 1 && Character.isLetter(currentChar)) {
                char nextChar = input.charAt(i + 1);
                
                // Only process if the next character is also an alphabet
                if (Character.isLetter(nextChar)) {
                    int currentValue = getNumericValue(currentChar);
                    int nextValue = getNumericValue(nextChar);
                    int sum = currentValue + nextValue;
                    int remainder = sum % 26;

                    // Determine the character to append
                    char toAppend;
                    if (remainder == 0) {
                        toAppend = '0'; // Append '0' if remainder is 0
                    } else {
                        toAppend = (char) ('a' + remainder - 1); // Append corresponding alphabet
                    }
                    result.append(toAppend); // Append the new character
                }
            }
        }

        return result.toString().toLowerCase(); // Return the result in lowercase
    }

    private static int getNumericValue(char c) {
        // Convert character to numeric value (1 for 'a' or 'A', 2 for 'b' or 'B', ..., 26 for 'z' or 'Z')
        return Character.toLowerCase(c) - 'a' + 1;
    }
}
