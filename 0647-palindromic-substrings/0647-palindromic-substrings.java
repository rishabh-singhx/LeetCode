class Solution {
    static int count=0;
    public int countSubstrings(String s) 
    {
        count=0;
        generate_substring(s);
        return count;
    }
    public static void generate_substring(String s) 
	{
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j <=s.length(); j++) 
			{
				String x=s.substring(i,j);
				if(palindrome(x))
						count++;
			}
		}
	}
	public static boolean palindrome(String s)
	{
		for (int j = s.length()-1,i=0;i<j; i++, j--) 
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
}