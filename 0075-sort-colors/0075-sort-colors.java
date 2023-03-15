class Solution {
    public void sortColors(int[] nums) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     int max=nums[i];
        //     int idx=i;
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[j]<max)
        //         {
        //             max=nums[j];
        //             idx=j;
        //         }
        //     }
        //     int t=nums[i];
        //     nums[i]=max;
        //     nums[idx]=t;
        // }
        
        int low=0,high=nums.length-1,idx=0,temp;
        while(idx<=high)
        {
            if(nums[idx]==2)
            {
                temp=nums[idx];
                nums[idx]=nums[high];
                nums[high]=temp;
                high--;
            }
           else if(nums[idx]==0)
            {
                temp=nums[idx];
                nums[idx]=nums[low];
                nums[low]=temp;
                low++;
                idx++;
            }
            else
            {
                idx++;
            }
        }
        
    }
}