class Solution {
    public String sortVowels(String s) {
        List<Character> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                l.add(c);
            }
        }
        Collections.sort(l);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                ans.append(l.get(0));
                l.remove(0);

            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}