class Solution {
    static int count=0;
    static String str="";
    public String getPermutation(int n, int k) 
    {
        count=0;
        str="";
        String ques="";
        for(int i=1;i<=n;i++)
            ques=ques+i;
       PrintAnswer(ques,"",k);
        return str;
    }
    
    public static void PrintAnswer(String ques, String ans,int k) 
	{
		
		if(ques.length()==0)
		{
			count++;
            if(count==k)
                str=ans;        
            return;
		}
		for (int i = 0; i < ques.length(); i++) 
		{
			String s1 = ques.substring(0,i); 
			String s2 = ques.substring(i+1);
			char ch = ques.charAt(i);
			if(count>k)
                return;
            PrintAnswer(s1+s2,ans+ch,k);
		}
	}
}