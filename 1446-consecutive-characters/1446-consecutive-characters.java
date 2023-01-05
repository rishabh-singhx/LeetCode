class Solution 
{
    public int maxPower(String s) 
    {
        int max=0;
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=power(s.substring(i));
            max=Math.max(max,a[i]);
        }
        return max;
    }
    public static int power(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                return i+1;
            }
        }
        return s.length();
    }
}