import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro30 {
    public List<Integer> findSubstring(String s, String[] words) {
         List<Integer> result = new ArrayList<>();
        int strLen = s.length(), wordsLen = words.length, wordLen = words[0].length();

        Map<String, Integer> counts = new HashMap<>();
        for (String w : words) counts.put(w, counts.getOrDefault(w, 0) + 1);

        for (int i = 0; i < wordLen; i++) {
            Map<String, Integer> window = new HashMap<>();
            int left = i, count = 0;

            for (int j = i; j <= strLen - wordLen; j += wordLen) {
                String word = s.substring(j, j + wordLen);

                if (counts.containsKey(word)) {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    while (window.get(word) > counts.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }


                    if (count == wordsLen) result.add(left);

                } else {
                    window.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }
        return result;
    }
}
