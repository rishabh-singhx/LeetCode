class Solution {

    public int numDistinct(String s, String t) {
        int[][] memo = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                memo[i][j] = -1;
            }
        }
        return countWays(s, t, 0, 0, memo);
    }

    private int countWays(String s, String t, int i, int j, int[][] memo) {
        // Base Case 1: t is fully matched
        if (j == t.length()) return 1;

        // Base Case 2: s is exhausted before t
        if (i == s.length()) return 0;

        // Memoized result
        if (memo[i][j] != -1) return memo[i][j];

        int ans = 0;

        if (s.charAt(i) == t.charAt(j)) {
            // Match case: use it or skip it
            ans = countWays(s, t, i + 1, j + 1, memo) + countWays(s, t, i + 1, j, memo);
        } else {
            // No match: skip current char in s
            ans = countWays(s, t, i + 1, j, memo);
        }

        memo[i][j] = ans;
        return ans;
    }


    //Bottom Up Approach
    // public int numDistinct(String s, String t) {
    //     int m = s.length();
    //     int n = t.length();
        
    //     int[][] dp = new int[m + 1][n + 1];
        
    //     // Base case: empty t
    //     for (int i = 0; i <= m; i++) dp[i][0] = 1;
        
    //     for (int i = 1; i <= m; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             if (s.charAt(i - 1) == t.charAt(j - 1)) {
    //                 dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
    //             } else {
    //                 dp[i][j] = dp[i - 1][j];
    //             }
    //         }
    //     }
    //     return dp[m][n];
    // }
}
