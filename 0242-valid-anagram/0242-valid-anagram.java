class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }
            else{
                map1.put(c,1);
            }
        }
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }
            else{
                map2.put(c,1);
            }
        }
        for (char c : map1.keySet()) {
            if (!map2.containsKey(c) || !map2.get(c).equals(map1.get(c))) {
                return false;
            }
        }
        return true;
    }
}