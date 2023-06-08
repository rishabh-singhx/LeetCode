class Solution {
    public int maxCoins(int[] nums) {
        int arr[]=new int[nums.length+2];
        arr[0]=arr[arr.length-1]=1;
        for(int i=1;i<arr.length-1;i++)
            arr[i]=nums[i-1];
        int dp[][]=new int[arr.length][arr.length];
        for(int d[]:dp) Arrays.fill(d,-1);
        return Burst(arr,0,arr.length-1,dp);
        
    }
    public int Burst(int arr[],int si,int ei,int[][] dp){
        if(si==ei-1) return 0;
        int ans=Integer.MIN_VALUE;
        if(dp[si][ei]!=-1) return dp[si][ei];
        for(int k=si+1;k<ei;k++)
        {
            int left=Burst(arr,si,k,dp);
            int right=Burst(arr,k,ei,dp);
            int self=arr[si]*arr[k]*arr[ei];
            ans=Math.max(ans,left+right+self);
        }
        return dp[si][ei]=ans;
    }
}