class Solution {
    public String sortSentence(String s) {
        s=" "+s;
        StringBuilder s1 = new StringBuilder(s);
        int i=1;
        String s2="";
        int m,n,z;
        while(true)
        {
            n=s1.indexOf(String.valueOf(i));
            if(n==-1)
                break;
            z=n;
            while(true)
            {
                n--;
                if(s1.charAt(n)==' ')
                {
                    m=n;
                    break;
                }
            }
            i++;
            s2=s2 + (s1.substring(m+1,z)).toString() +" ";
        }
        s2=s2.substring(0,s2.length()-1);
        return s2;
    }
}