class Solution {
    public List<Integer> lexicalOrder(int n) 
    {
        List<Integer> lst = new ArrayList<>(); 
        Print_No(0,n,lst); 
        return lst;
    }
    public static void Print_No(int curr, int n,List<Integer> lst ) 
	{
		if(curr>n)
			return;
		if(curr!=0)
            lst.add(curr);
		int i=0;
		if(curr==0)
			i=1;
		for (; i<=9 ; i++) 
		{
			Print_No(curr*10+i,n,lst);
		}
	}
}