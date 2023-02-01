class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<Integer> ll =new ArrayList<>();
		List<List<Integer>> ans =new ArrayList<>();
		possible_Sir(candidates,target,0,ll,ans);
		return ans; 
    }
    public static void possible_Sir (int[] a, int amount,int idx,List<Integer>                  ll,List<List<Integer>> ans) 
	{
		if(amount==0)
		{
            if(ans.contains(ll)==false)
			    ans.add(new ArrayList<>(ll));
			return;
		}
		if(amount<0)
			return;
		for(int i=idx;i<a.length;i++)
		{
			if(i==idx || a[i]!=a[i-1])
			{
				if(amount>=a[i])
				{
					ll.add(a[i]);
					possible_Sir(a,amount-a[i],i+1,ll,ans);
					ll.remove(ll.size()-1);
				}
			}
		}
	}
}