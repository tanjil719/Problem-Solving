import java.util.HashMap;

public class Pro205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (charMap.containsKey(sChar)) {
                if (charMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (charMap.containsValue(tChar)) {
                    return false;
                }
                charMap.put(sChar, tChar);
            }
        }
        return true;
    }

}
