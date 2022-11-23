class Solution {
    public String restoreString(String s, int[] indices) {
        String n="";
        for(int i=0;i<s.length();i++)
        {
            n =n+"a";
        }
        StringBuilder s1 = new StringBuilder(n);
        for(int i=0;i<s.length();i++)
        {
            s1.setCharAt(indices[i],s.charAt(i));
        }
        n=s1.toString();
        return n;
    }
}