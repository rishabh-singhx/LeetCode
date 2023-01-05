class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String arr[]=text.split(" ");
    String broke[]=new String[brokenLetters.length()];
    for(int j=0;j<broke.length;j++)
    {
        broke[j]=Character.toString(brokenLetters.charAt(j));
    }
    int c=0,f=0;
    for(int i =0;i<arr.length;i++)
    {
        f=0;
        for(int j=0;j<broke.length;j++)
        {
            if(arr[i].contains(broke[j])==true)
            {
                f=1;
                break;
            }
        }
        if(f==0)
            c++;
    }
     return c;
    }
}