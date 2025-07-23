class Trie {
    private class Node {
        char data;
        HashMap<Character, Node> child = new HashMap<>();
        boolean IsTerminal;

    }

    private Node root;

    public Trie() {
        Node nn = new Node();
        nn.data = '*';
        root = nn;
    }

    public void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (temp.child.containsKey(ch)) {
                temp = temp.child.get(ch);

            } else {
                Node nn = new Node();
                nn.data = ch;
                temp.child.put(ch, nn);
                temp = nn;
            }

        }
        temp.IsTerminal = true;
    }

    public boolean search(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!temp.child.containsKey(ch)) {
                return false;
            }
            temp = temp.child.get(ch);

        }
        return temp.IsTerminal;
    }

    public boolean startsWith(String prefix) {
        Node temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!temp.child.containsKey(ch)) {
                return false;
            }
            temp = temp.child.get(ch);

        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */