class Solution {
    static int count=0;
    public int findTargetSumWays(int[] nums, int target) 
    {
        count=0;
        check(nums,target,0,0);      
        return count;
    }
    public static void check(int a[],int target,int idx,int sum)
    {
        if(a.length==idx)
        {
            if(sum==target)
            {
                count++;
            }
            return;
        }
        check(a,target,idx+1,sum+a[idx]);
        check(a,target,idx+1,sum-a[idx]);
    }
}