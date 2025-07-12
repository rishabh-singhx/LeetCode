class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int zero = Min_Cost(cost, 0, dp);
        int one = Min_Cost(cost, 1, dp);
        return Math.min(one, zero);
    }
    public static int Min_Cost(int[] cost, int i, int[] dp) {
        if (i >= cost.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int first = Min_Cost(cost, i + 1, dp);// dp[i+1];
        int sec = Min_Cost(cost, i + 2, dp);// dp[i+2];
        return dp[i] = Math.min(first, sec) + cost[i];// dp[i] = Math.min(dp[i+1], dp[i+2])+cost[i];
    }
}