class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String newstr[]=new String[str.length];
        for(int i=0;i<str.length;i++)
        {
            int n=Character.getNumericValue(str[i].charAt(str[i].length()-1));
            newstr[n-1]=str[i].substring(0,str[i].length()-1);
        }
        String result=String.join(" ",newstr);
        return result;
    }
}