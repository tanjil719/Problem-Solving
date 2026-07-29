public class Pro3517 {
    public String smallestPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return s;
        }

        int[] wordCount = new int[26];

        for (char c : s.toCharArray()) {
            wordCount[c - 'a']++;
        }

        char[] result = new char[s.length()];
        int left = 0;
        int right = s.length() - 1;

        for (int i = 0; i < 26; i++) {
            while (wordCount[i] >= 2) {
                result[left++] = (char) (i + 'a');
                result[right--] = (char) (i + 'a');
                wordCount[i] -= 2;
            }

            if (wordCount[i] == 1){
                result[s.length() / 2] = (char) (i + 'a');
            }
        }

        return new String(result);

    }
}
