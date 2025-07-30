class Solution {
    int maxOr=0;
    int count=0;
    public int countMaxOrSubsets(int[] nums) {
        subsequence(nums,0,0);
        return count;
    }
    public void subsequence(int[] nums, int index, int currentOr) {
        if (index == nums.length) {
            if (currentOr == maxOr) {
                count++;
            } else if (currentOr > maxOr) {
                maxOr = currentOr;
                count = 1;
            }
            return;
        }

        // Include nums[index]
        subsequence(nums, index + 1, currentOr | nums[index]);

        // Exclude nums[index]
        subsequence(nums, index + 1, currentOr);
    }
}