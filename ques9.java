public class MatchFinder {

    public static void main(String[] args) {
        String input1 = "a_c"; // Example input with underscore
        String input2 = "abc:def:ghi:acj:xyz"; // Example series of words

        String output1 = matchFound(input1, input2);
        System.out.println("Matching words: " + output1);
    }

    public static String matchFound(String input1, String input2) {
        // Extract the character to match
        char charToMatch = input1.charAt(input1.indexOf('_'));

        // Split input2 into words
        String[] words = input2.split(":");
        StringBuilder output = new StringBuilder();

        // Find matching words
        for (String word : words) {
            // Replace the underscore in input1 with the character to match
            String modifiedInput1 = input1.replace('_', charToMatch);
            if (word.equals(modifiedInput1)) {
                if (output.length() > 0) {
                    output.append(":");
                }
                output.append(word.toUpperCase());
            }
        }

        return output.toString();
    }
}
