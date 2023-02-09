class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {
        return check(nums,target,0,0);  
    }
    public static int check(int a[],int target,int idx,int sum)
    {
        if(a.length==idx)
        {
            if(sum==target)
            {
                return 1;
            }
            return 0;
        }
        int x=check(a,target,idx+1,sum+a[idx]);
        int y=check(a,target,idx+1,sum-a[idx]);
        return x+y;
    }
}