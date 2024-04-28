//import java.util.Arrays;
//import java.util.List;
//import java.util.Objects;
//
//public class Pro14 {
//    public String longestCommonPrefix(String[] strs) {
//        Node root = new Node();
//        int n = strs.length;
//        String ans = "";
//
//        for (int i = 0; i < n; i++) {
//            if (Objects.equals(strs[i], "")) {
//                return "";
//            } else {
//                root.insert(strs[i]);
//            }
//        }
//
//        String first = strs[0];
//        return root.solve(first);
//    }
//}
//
//class TrieNode {
//    public TrieNode[] children;
//    public boolean isTerminal;
//    public int childCount;
//
//    public TrieNode() {
//        this.children = new TrieNode[26];
//        for (int i = 0; i < 26; i++) {
//            this.children[i] = null;
//        }
//        this.isTerminal = false;
//        this.childCount = 0;
//    }
//}
//
//class Node {
//    public TrieNode root = new TrieNode();
//
//    public void insert(String key) {
//        TrieNode currNode = root;
//        int n = key.length();
//
//        for (int i = 0; i < n; i++) {
//            int index = key.charAt(i) - 'a';
//
//            if (currNode.children[index] == null) {
//                TrieNode newNode = new TrieNode();
//                currNode.children[index] = newNode;
//                currNode.childCount++;
//            }
//
//            currNode = currNode.children[index];
//        }
//
//        currNode.isTerminal = true;
//    }
//
//    public String solve(String str) {
//        TrieNode currNode = root;
//        int n = str.length();
//        StringBuilder ans = new StringBuilder();
//
//        for (int i = 0; i < n; i++) {
//            if (currNode.childCount == 1) {
//                ans.append(str.charAt(i));
//                currNode = currNode.children[str.charAt(i) - 'a'];
//            } else {
//                break;
//            }
//
//            if (currNode.isTerminal) {
//                break;
//            }
//        }
//
//        return ans.toString();
//    }
//}
//
//

