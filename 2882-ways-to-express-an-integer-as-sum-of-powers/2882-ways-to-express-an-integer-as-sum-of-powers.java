class Solution {
    static final int MOD = 1_000_000_007;
    List<Integer> powers;
    int dp[][];
    public int numberOfWays(int n, int x) {
        powers = new ArrayList<>();
        int i = 1;
        while (true) {
            long pow = (long) Math.pow(i, x);
            if (pow > n) break;
            powers.add((int) pow);
            i++;
        }

        // Step 2: Initialize DP
        dp = new int[n + 1][powers.size() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        // Step 3: DFS from index 0
        return dfs(n, 0);
    }
    private int dfs(int remaining, int idx) {
        if (remaining == 0) return 1;
        if (remaining < 0 || idx >= powers.size()) return 0;

        if (dp[remaining][idx] != -1) return dp[remaining][idx];

        // Option 1: include this number
        int include = dfs(remaining - powers.get(idx), idx + 1);
        // Option 2: skip this number
        int skip = dfs(remaining, idx + 1);

        return dp[remaining][idx] = (int) ((include +  skip) % MOD);
    }
}