class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) 
            return false;

        Map<Character, Character> mapST = new HashMap<>();
        Set<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (mapST.containsKey(sc)) {
                if (mapST.get(sc) != tc)
                    return false;  // Inconsistent mapping
            } else {
                if (mappedValues.contains(tc))
                    return false;  // tc already used for another sc
                mapST.put(sc, tc);
                mappedValues.add(tc);
            }
        }

        return true;
    }
}