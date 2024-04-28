import java.util.HashMap;
import java.util.Map;

public class Pro13 {
    public int romanToInt(String s) {
//        Map<Character, Integer> romanNumerals = new HashMap<>();
//        romanNumerals.put('I', 1);
//        romanNumerals.put('V', 5);
//        romanNumerals.put('X', 10);
//        romanNumerals.put('L', 50);
//        romanNumerals.put('C', 100);
//        romanNumerals.put('D', 500);
//        romanNumerals.put('M', 1000);
//        if (s.length() ==1){
//            return romanNumerals.get(s.charAt(0));
//        }
//        int result = 0;
//        int fast = 1, slow = 0;
//        while (slow < s.length()) {
//            int low = romanNumerals.get(s.charAt(slow));
//            int high = romanNumerals.get(s.charAt(fast));
//            if (high > low) {
//                result += high - low;
//                fast = fast + 2 >= s.length() ? s.length()-1 : fast + 2;
//                slow += 2;
//            } else {
//                result += low;
//                fast = fast + 1 > s.length() - 1 ? fast : fast + 1;
//                slow++;
//            }
//        }
//
//        return result;


        HashMap<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for(int i=0; i<s.length(); i++){

            if(i < s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }

        }
        return ans;




    }
}
