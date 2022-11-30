class Solution {
    public boolean areOccurrencesEqual(String s) {
        int a[]=new int[26];
        char c;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            a[c-97]++;
        }
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(a[i],max);
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0&&a[i]!=max)
                return false;
        }
        return true;
        
    }
}