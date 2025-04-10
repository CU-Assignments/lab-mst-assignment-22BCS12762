import java.util.HashMap;

public class FindAddedLetter {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count characters in the original string s
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrease the count for characters in the shuffled string t
        for (char c : t.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) - 1);
                if (charCount.get(c) == 0) {
                    charCount.remove(c);
                }
            } else {
                // If the character is not in s, it must be the added character
                return c;
            }
        }

        // In case no character is found (should not happen with valid input)
        return ' ';
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char addedLetter = findTheDifference(s, t);
        System.out.println("The added letter is: " + addedLetter);
    }
}
