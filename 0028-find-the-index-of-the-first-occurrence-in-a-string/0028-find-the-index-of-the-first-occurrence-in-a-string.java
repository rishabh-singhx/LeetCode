class Solution {
    public int strStr(String haystack, String needle) {
        String s="";
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++)
        {
            s=haystack.substring(i,i+m);
            if(s.compareTo(needle)==0)
                return i;
        }
        return -1;
    }
}