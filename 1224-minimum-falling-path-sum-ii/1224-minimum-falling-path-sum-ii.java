class Solution {
    public int minFallingPathSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MIN_VALUE);
		}
		for (int i = 0; i < grid.length; i++) {
			ans = Math.min(ans, minpathsum(grid, 0, i, dp));
		}
		return ans;
    }
    private static int minpathsum(int[][] arr, int i, int j, int[][] dp) {
		if (i == arr.length - 1) {
			return arr[i][j];
		}
		if (dp[i][j] != Integer.MIN_VALUE) {
			return dp[i][j];
		}

		int ans = Integer.MAX_VALUE;
		for (int k = 0; k < arr[0].length; k++) {
			if (j != k) {
				ans = Math.min(ans, minpathsum(arr, i + 1, k, dp));

			}
		}
		return dp[i][j] = ans + arr[i][j];
	}
}