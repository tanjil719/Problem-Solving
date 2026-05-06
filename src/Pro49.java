import java.util.*;

public class Pro49 {

    public List<List<String>> groupAnagrams(String[] strs) {

//        Map<String, List<String>> map = new HashMap<>();
//
//        for (String s : strs) {
//            char[] chars = s.toCharArray();
//            Arrays.sort(chars);
//
//            String key = new String(chars);
//
//            if (!map.containsKey(key)) {
//                map.put(key, new ArrayList<>());
//            }
//            map.get(key).add(s);
//        }
//
//        return new ArrayList<>(map.values());


        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());

    }

}
