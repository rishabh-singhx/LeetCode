class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int max=nums[i];
            int idx=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<max)
                {
                    max=nums[j];
                    idx=j;
                }
            }
            int t=nums[i];
            nums[i]=max;
            nums[idx]=t;
        }
        
    }
}