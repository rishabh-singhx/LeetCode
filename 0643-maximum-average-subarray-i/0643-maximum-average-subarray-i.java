class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0,sum=0;
        for(int i=0;i<k;i++)
            sum=sum+nums[i];
        ans=sum/k;
        for(int j=k;j<nums.length;j++)
        {
            sum=sum+nums[j]-nums[j-k];
            ans=Math.max(ans,sum/k);
        }
        return ans;
    }
}