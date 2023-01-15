class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a[]=new int[26];
        for(int i=0;i<letters.length;i++)
            a[letters[i]-97]++;
        for(int i=(target-97)+1;i<a.length;i++)
        {
            if(a[i]>0)
                return (char)(i+97);
        }
        for(int i=0;i<=(target-97)+1;i++)
        {
            if(a[i]>0)
                return (char)(i+97);
        }
        return 'a';
    }
}