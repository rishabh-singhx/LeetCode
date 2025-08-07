class Solution {

    public int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length;
        int dp[][] = new int[n][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        int a = firstchild(fruits, 0, fruits.length - 1, dp);
        int b = secondchild(fruits, fruits.length - 1, 0, dp);
        int c = 0;
        for (int i = 0; i < fruits.length; i++)
            c += fruits[i][i];
        return a + b + c;
    }

    public int firstchild(int[][] fruits, int i, int j, int[][] dp) {

        if (i == fruits.length - 1 && j == fruits.length - 1) {
            return 0;
        }
        if (i >= j || j > fruits.length - 1 || i > fruits.length - 1) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        int a = fruits[i][j] + firstchild(fruits, i + 1, j - 1, dp);
        int b = fruits[i][j] + firstchild(fruits, i + 1, j, dp);
        int c = fruits[i][j] + firstchild(fruits, i + 1, j + 1, dp);
        return dp[i][j] = Math.max(a, Math.max(b, c));
    }

    public int secondchild(int[][] fruits, int i, int j, int dp[][]) {

        if (i == fruits.length - 1 && j == fruits.length - 1) {
            return 0;
        }
        if (i <= j || j > fruits.length - 1 || i > fruits.length - 1) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        int a = fruits[i][j] + secondchild(fruits, i - 1, j + 1, dp);
        int b = fruits[i][j] + secondchild(fruits, i, j + 1, dp);
        int c = fruits[i][j] + secondchild(fruits, i + 1, j + 1, dp);
        return dp[i][j] = Math.max(a, Math.max(b, c));
    }
}