class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ll =new ArrayList<>();
		List<List<Integer>> ans =new ArrayList<>();
        boolean t[]=new boolean[nums.length];
        PrintAnswer(nums,ll,ans,t);
        return ans;
    }
    
    public static void PrintAnswer(int[] a,List<Integer> ll,List<List<Integer>> ans,boolean t[]) 
	{
		
		if(ll.size()==a.length)
		{
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 0; i < a.length; i++) 
		{
            if(t[i]==false)
            {
                t[i]=true;
                ll.add(a[i]);
			    PrintAnswer(a,ll,ans,t);
                ll.remove(ll.size()-1); 
                t[i]=false;
            }
		}
	}
}