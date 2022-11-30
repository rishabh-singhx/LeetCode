class Solution {
    public String toLowerCase(String s) {
        char c;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>64&&c<91)
                c=(char)(c+32);
            str=str+Character.valueOf(c);
        }
        return str;
    }
}