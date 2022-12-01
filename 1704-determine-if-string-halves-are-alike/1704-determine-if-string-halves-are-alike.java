class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toUpperCase();
        int c=0,d=0;;
        for(int i=0;i<(s.length()/2);i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                c++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                d++;
            }
        }
        if(c==d)
            return true;
        return false;
    }
}