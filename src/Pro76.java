import java.util.HashMap;

public class Pro76 {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int left = 0, right, formed = 0, minLength = Integer.MAX_VALUE, start = 0;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int required = tMap.size();

        for (right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (tMap.containsKey(currentChar)) {
                sMap.put(currentChar, sMap.getOrDefault(currentChar, 0) + 1);

                if (sMap.get(currentChar).equals(tMap.get(currentChar))) {
                    formed++;
                }
            }

            while (formed == required) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (tMap.containsKey(leftChar)) {
                    sMap.put(leftChar, sMap.get(leftChar) - 1);
                    if (sMap.get(leftChar) < tMap.get(leftChar)) {
                        formed--;
                    }
                }
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLength);
    }

}
