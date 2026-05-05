import java.util.HashMap;
import java.util.HashSet;

public class Pro290 {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();

        HashSet<String> claimedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (charToWord.containsKey(currentChar)) {
                if (!charToWord.get(currentChar).equals(currentWord)) {
                    return false;
                }
            }
            else {
                if (claimedWords.contains(currentWord)) {
                    return false;
                }

                charToWord.put(currentChar, currentWord);
                claimedWords.add(currentWord);
            }
        }

        return true;

    }
}
