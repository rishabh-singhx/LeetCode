class Solution {
    static String key[]= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};	    
    public List<String> letterCombinations(String digits) {
        List<String> lst= new ArrayList<>();
        printkey(digits,"",lst);
        return lst;
    }
    public static void printkey(String ques, String ans,List<String> lst) 
	{
		if(ques.length()==0)
		{
			if(ans.length()==0)
                return;
            lst.add(ans);
            return;
		}
		char ch=ques.charAt(0); 
		String press=key[ch-'0'-1]; 
		for (int i = 0; i < press.length(); i++) 
		{
			printkey(ques.substring(1),ans + press.charAt(i),lst);
		}
	}
}