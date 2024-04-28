import java.util.List;

public class Pro139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        Trie trie = new Trie();
        for (String x : wordDict) {
            insert(x, trie);
        }
        return solve(s, trie, 0, 1, dp);

//        NodeClass node = new NodeClass();
//        for (String word : wordDict) {
//            node.insert(word);
//        }
//        int n = s.length();
//        boolean[] dp = new boolean[n];
//
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i <= j; i++) {
//                if (node.search(s, i, j)) {
//                    dp[j] = i - 1 < 0 || dp[i - 1];
//                    if (dp[j]) break;
//                }
//            }
//        }
//        return dp[n - 1];

    }

    private boolean solve(String s, Trie trie, int i, int j, Boolean[] dp) {
        if (i == s.length()) {
            return true;
        }
        if (dp[i] != null) {
            return dp[i];
        }
        Trie dict = trie;
        for (int k = i; k < s.length(); k++) {
            dict = dict.child[s.charAt(k) - 'a'];
            if (dict == null) {
                return dp[i] = false;
            }
            if (dict.stop) {
                if (solve(s, trie, k + 1, k + 2, dp))
                    return true;
            }
        }
        return dp[i] = false;
    }

    private void insert(String s, Trie trie) {
        for (char ch : s.toCharArray()) {
            if (trie.child[ch - 'a'] == null) {
                trie.child[ch - 'a'] = new Trie();
            }
            trie = trie.child[ch - 'a'];
        }
        trie.stop = true;
    }
}

    class Trie {
        Trie[] child;
        boolean stop;

        public Trie() {
            child = new Trie[26];
            stop = false;
        }
    }

//    class NodeClass {
//        public Node root = new Node();
//
//        public void insert(String words) {
//            Node curr = root;
//            for (int i = 0; i < words.length(); i++) {
//                int idx = words.charAt(i) - 'a';
//                if (curr.children[idx] == null) {
//                    curr.children[idx] = new Node();
//                }
//                curr = curr.children[idx];
//            }
//            curr.ewo = true;
//        }
//
//        public boolean search(String key, int start, int end) {
//            Node curr = root;
//            for (int i = start; i <= end; i++) {
//                int idx = key.charAt(i) - 'a';
//                if (curr.children[idx] == null) {
//                    return false;
//                }
//                curr = curr.children[idx];
//            }
//            return curr.ewo;
//        }
//
//    }

//    class Node {
//        Node[] children = new Node[26];
//        boolean ewo = false;
//
//        public Node() {
//            for (int i = 0; i < 26; i++) {
//                children[i] = null;
//            }
//        }
//    }



