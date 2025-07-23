class Solution extends Trie {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        Trie t = new Trie();
        for(int i=0;i<strs.length;i++){
            t.insert(strs[i]);
        }
        return t.common(strs[0],strs.length);

    }
}

class Trie{
    public class Node {
        char data;
        HashMap<Character, Node> child = new HashMap<>();
        boolean IsTerminal;
        int count = 0;
    }
    public Node root;

    public Trie() {
        root = new Node();
        root.data = '*';
    }

    public void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (temp.child.containsKey(ch)) {
                temp = temp.child.get(ch);
                temp.count++;

            } else {
                Node nn = new Node();
                nn.data = ch;
                nn.count = 1;
                temp.child.put(ch, nn);
                temp = nn;
            }
        }
        temp.IsTerminal = true;
    }

    public String common(String firstString,int sizeOfArray) {
        String ans = "";
        Node temp = root;
        for (int i = 0; i < firstString.length(); i++) {
            char ch = firstString.charAt(i);
            if (temp.child.containsKey(ch) && temp.child.get(ch).count==sizeOfArray) {
                ans += ch;
                temp = temp.child.get(ch);
            }
            else{
                break;
            }
        }
        return ans;
    }
}