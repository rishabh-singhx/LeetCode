class Solution {
    public List<List<String>> partition(String s) 
    {
        List<String> ll =new ArrayList<>();
		List<List<String>> ans =new ArrayList<>();
		check(s,ll,ans);
		return ans;
    }
    public static void check(String ques, List<String> ll,List<List<String>> ans) 
	{
		if(ques.length()==0)
		{
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) 
		{
			String part=ques.substring(0,i);
			if(palindrome(part))
			{
				ll.add(part);
				check(ques.substring(i),ll,ans);
				ll.remove(ll.size()-1);
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