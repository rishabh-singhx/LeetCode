class Solution {
    public int waysToSplitArray(int[] nums) {
        int s=0;
        int n= nums.length;
        long left[]=new long[n];
        long right[]=new long[n];
        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
            left[i]=nums[i]+left[i-1];
        for(int i=n-2;i>=0;i--)
            right[i]=nums[i]+right[i+1];
        for(int i=0;i<n-1;i++)
        {
            if(left[i]>=right[i+1])
                s++;
        }
        return s;
    }
}