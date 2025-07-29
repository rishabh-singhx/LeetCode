class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] lastSeen = new int[32]; // For each bit, track latest index where it's set

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Update bit positions
            for (int bit = 0; bit < 32; bit++) {
                if ((nums[i] & (1 << bit)) != 0) {
                    lastSeen[bit] = i;
                }
            }

            // Find furthest bit index we need to cover from i
            int maxReach = i;
            for (int bit = 0; bit < 32; bit++) {
                maxReach = Math.max(maxReach, lastSeen[bit]);
            }

            res[i] = maxReach - i + 1;
        }

        return res;
    }
}
