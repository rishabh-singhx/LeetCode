class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            s1.setCharAt(indices[i],s.charAt(i));
        }
        return s1.toString();
    }
}