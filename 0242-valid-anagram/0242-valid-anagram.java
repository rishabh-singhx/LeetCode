class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length())
        //     return false;
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char c : s.toCharArray()){
        //     if(map.containsKey(c)){
        //         map.put(c,map.get(c)+1);
        //     }
        //     else{
        //         map.put(c,1);
        //     }
        // }
        // for (char c : t.toCharArray()) {
        //     if (!map.containsKey(c)) 
        //         return false;
        //     map.put(c, map.get(c) - 1);
        //     if (map.get(c) < 0) 
        //         return false;
        // }
        // return true;



        if (s.length() != t.length()) return false;
        int[] count = new int[26]; // Fixed size for a-z
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increment for s
            count[t.charAt(i) - 'a']--; // decrement for t
        }
        for (int c : count) {
            if (c != 0) return false; // imbalance found
        }
        return true;
    }
}