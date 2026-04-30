import java.util.HashMap;
import java.util.HashSet;

public class Pro3 {
    public int lengthOfLongestSubstring(String s) {

//        Sliding Window Approach with HashSet (O(n) time, O(min(m, n)) space):
//        int left = 0;
//        int right = 0;
//        int maxLength = 0;
//        HashSet<Character> set = new HashSet<>();
//
//        while (right < s.length()) {
//            if (!set.contains(s.charAt(right))) {
//                set.add(s.charAt(right));
//                maxLength = Math.max(maxLength, right - left + 1);
//                right++;
//            }
//            else {
//                set.remove(s.charAt(left));
//                left++;
//            }
//        }
//        return maxLength;


        //        Sliding Window Approach with HashMap

        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
}
