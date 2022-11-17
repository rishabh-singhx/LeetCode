class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return(Maximum_Sum(nums,k));
    }
    public static int Maximum_Sum(int arr[],int k)
	{
		int ans=0;
		int si=0,ei=0;
		int p=1;
		while(ei<arr.length) 
		{
			//grow
			p=p*arr[ei];
			//shrink
			while(p>=k&&si<=ei)
			{
				p=p/arr[si];
				si++;
			}
			ans=ans+(ei-si+1);
			ei++;
		}
		return ans;
	}
}