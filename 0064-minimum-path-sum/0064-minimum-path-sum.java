class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Initialize dp griday with -1
        int[][] dp = new int[rows][cols];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return PathSum(grid, 0, 0, dp);
    }

    public static int PathSum(int[][] arr, int cr, int cc, int[][] dp) {
        if (cr == arr.length - 1 && cc == arr[0].length - 1) {
            return arr[cr][cc]; // Destination reached
        }

        if (cr >= arr.length || cc >= arr[0].length) {
            return Integer.MAX_VALUE; // Out of bounds
        }

        if (dp[cr][cc] != -1)
            return dp[cr][cc]; // Already computed

        int down = PathSum(arr, cr + 1, cc, dp);
        int right = PathSum(arr, cr, cc + 1, dp);

        return dp[cr][cc] = Math.min(down, right) + arr[cr][cc];
    }
}