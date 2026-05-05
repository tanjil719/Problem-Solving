import java.util.HashMap;

public class Pro383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char currentChar = ransomNote.charAt(i);
            if (!magazineMap.containsKey(currentChar) || magazineMap.get(currentChar) == 0) {
                return false;
            }
            magazineMap.put(currentChar, magazineMap.get(currentChar) - 1);
        }

        return true;

    }
}
