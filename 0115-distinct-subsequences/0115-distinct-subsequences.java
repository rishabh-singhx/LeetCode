class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }	
        return DistinctSubsequences(s, t, 0, 0,dp);
    }
    public static int DistinctSubsequences(String s, String t, int i, int j,int[][] dp) {
		if (t.length() == j) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
		int inc = 0;
		int exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = DistinctSubsequences(s, t, i + 1, j + 1,dp);
		}
		exc = DistinctSubsequences(s, t, i + 1, j,dp);
		return dp[i][j] =  inc + exc;
	}
}