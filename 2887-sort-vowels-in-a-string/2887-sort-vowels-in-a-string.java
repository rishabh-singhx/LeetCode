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
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                ans += l.get(0);
                l.remove(0);

            } else {
                ans += c;
            }
        }
        return ans;
    }
}