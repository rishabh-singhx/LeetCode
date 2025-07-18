class Solution {
    public int coinChange(int[] coins, int amount) {
        return cc(coins, amount);
    }

    public int cc(int[] coins, int amount) {
        int max = amount + 1; // A large number used as "infinity"
        int[] dp = new int[amount + 1];

        // Initialize all values to max, except dp[0]
        for (int i = 1; i <= amount; i++) {
            dp[i] = max;
        }

        dp[0] = 0;

        // Fill dp array
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}