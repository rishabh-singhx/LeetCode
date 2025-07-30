class Solution {
    public int longestSubarray(int[] nums) {
        int maxi=0;
        for(int n:nums){
            maxi=Math.max(maxi,n);
        }
        int c=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxi){
                c++;
                if(i==nums.length-1){
                    ans=Math.max(ans,c);
                }
            }
            else{
                ans=Math.max(ans,c);
                c=0;
            }
        }
        return ans;
    }
}