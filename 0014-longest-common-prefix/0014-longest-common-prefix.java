import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Trie trie = new Trie();
        for (String word : strs) {
            trie.insert(word);
        }

        return trie.getCommonPrefix(strs[0], strs.length);
    }
}

class Trie {
    private static class Node {
        Map<Character, Node> children = new HashMap<>();
        int count = 0;
    }

    private final Node root = new Node();

    public void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            current = current.children.computeIfAbsent(ch, k -> new Node());
            current.count++;
        }
    }

    public String getCommonPrefix(String base, int totalWords) {
        StringBuilder prefix = new StringBuilder();
        Node current = root;

        for (char ch : base.toCharArray()) {
            Node next = current.children.get(ch);
            if (next != null && next.count == totalWords) {
                prefix.append(ch);
                current = next;
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}
