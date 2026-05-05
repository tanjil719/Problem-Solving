import java.util.HashMap;

public class Pro242 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            if (!sMap.containsKey(currentChar) || sMap.get(currentChar) == 0) {
                return false;
            }
            sMap.put(currentChar, sMap.get(currentChar) - 1);
        }

        return true;
    }

}
