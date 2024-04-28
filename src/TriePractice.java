import java.util.Arrays;

public class TriePractice {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int length = word.length();
        Node temp = root;
        for (int i = 0; i < length; i++) {
            int index = word.charAt(i) - 'a';
            if (temp.children[index] == null) {
                temp.children[index] = new Node();
            }
            if (i == length - 1) {
                temp.children[index].endOfWord = true;
            }
            temp = temp.children[index];
        }
    }

    public static boolean search(String word) {
        int length = word.length();
        int index;
        Node temp = root;
        for (int i = 0; i < length; i++) {
            index = word.charAt(i) - 'a';
            if (temp.children[index] == null) {
                return false;
            }
            if (i == length - 1 && !temp.children[index].endOfWord) {
                return false;
            }
            temp = temp.children[index];
        }
        return true;
    }

    public static boolean searchWithPrefix(String prefix) {
        int length = prefix.length();
        int index;
        Node temp = root;
        for (int i = 0; i < length; i++) {
            index = prefix.charAt(i) - 'a';
            if (temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return true;
    }

    public static boolean wordBreak(String key) {
        int len = key.length();
        if (len == 0) {
            return true;
        }
        for (int i = 1; i <= len; i++) {
//           String first = key.substring(0, i);
//           String second = key.substring(i);
            if (search(key.substring(0, i)) &&
                    wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static int countUniqueSubString(String word, int count) {
        int length = word.length();
        Node temp = root;
        for (int i = 0; i < length; i++) {
            int index = word.charAt(i) - 'a';
            if (temp.children[index] == null) {
                temp.children[index] = new Node();
                count++;
            }
            if (i == length - 1) {
                temp.children[index].endOfWord = true;
            }
            temp = temp.children[index];
        }
        return count;
    }

    public static boolean longestWordWithAllPrefix(String word, int length) {
        int index;
        Node temp = root;
        for (int i = 0; i < length; i++) {
            index = word.charAt(i) - 'a';
            if (temp.children[index] == null || !temp.children[index].endOfWord) {
                return false;
            }
            temp = temp.children[index];
        }
        return true;
    }


    public static void main(String[] args) {
        String[] strs = new String[]{"i", "like", "sam", "samsung", "mobile", "ice"};
        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            insert(strs[i]);
        }
//
//        int index = 0, heightLength = strs[0].length();
//        for (int i = 0; i < strs.length; i++) {
//            int length = strs[i].length();
//            if (longestWordWithAllPrefix(strs[i], length) && heightLength < length) {
//                heightLength = length;
//                index = i;
//            }
//        }
//        System.out.println(strs[index]);

//        System.out.println(search("flo"));

        boolean result = wordBreak("ilikesamsung"); // if the string can be divide into small words,the words present in tree or not

//        System.out.println(searchWithPrefix("car"));

//        String word = "ababa";
//        int count = 1;
//        for (int i = 0; i < word.length(); i++) {
//            count += countUniqueSubString(word.substring(i), 0);
//        }
    }
}
