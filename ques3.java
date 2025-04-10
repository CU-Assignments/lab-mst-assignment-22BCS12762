import java.util.Scanner;

public class StringEncoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three strings
        System.out.print("Enter first string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String input2 = scanner.nextLine();
        System.out.print("Enter third string: ");
        String input3 = scanner.nextLine();

        // Split the strings into FRONT, MIDDLE, and END parts
        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        // Generate output strings
        String output1 = parts1[0] + parts2[1] + parts3[2];
        String output2 = parts1[1] + parts2[2] + parts3[0];
        String output3 = parts1[2] + parts2[0] + parts3[1];

        // Toggle case for the third output string
        output3 = toggleCase(output3);

        // Print the final results
        System.out.println("Output 1: " + output1);
        System.out.println("Output 2: " + output2);
        System.out.println("Output 3: " + output3);

        scanner.close();
    }

    private static String[] splitString(String str) {
        int length = str.length();
        int partLength = length / 3;
        int remainder = length % 3;

        String front, middle, end;

        // Determine the lengths of each part based on the remainder
        if (remainder == 0) {
            front = str.substring(0, partLength);
            middle = str.substring(partLength, 2 * partLength);
            end = str.substring(2 * partLength);
        } else if (remainder == 1) {
            front = str.substring(0, partLength);
            middle = str.substring(partLength, partLength + 1 + partLength);
            end = str.substring(partLength + 1 + partLength);
        } else { // remainder == 2
            front = str.substring(0, partLength + 1);
            middle = str.substring(partLength + 1, partLength + 1 + partLength);
            end = str.substring(partLength + 1 + partLength);
        }

        return new String[]{front, middle, end};
    }

    private static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(Character.toLowerCase(c));
            }
        }
        return toggled.toString();
    }
}
