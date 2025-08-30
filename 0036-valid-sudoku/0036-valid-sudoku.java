class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if ((board[i][j] - 48) <= 9 && (board[i][j] - 48) >= 0) {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if ((board[j][i] - 48) <= 9 && (board[j][i] - 48) >= 0) {
                    if (set.contains(board[j][i])) {
                        return false;
                    }
                    set.add(board[j][i]);
                }
            }
        }

        int a[] = { 0, 0, 0, -1, -1, -1, 1, 1, 1 };
        int b[] = { 0, -1, 1, 0, -1, 1, 0, -1, 1 };
        int c[][] = { { 1, 1 }, { 1, 4 }, { 1, 7 }, { 4, 1 }, { 4, 4 }, { 4, 7 }, { 7, 1 }, { 7, 4 }, { 7, 7 } };
        for (int i = 0; i < 9; i++) {
            int x = c[i][0];
            int y = c[i][1];
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if ((board[x + a[j]][y + b[j]] - 48) <= 9 && (board[x + a[j]][y + b[j]] - 48) >= 0) {
                    if (set.contains(board[x + a[j]][y + b[j]])) {
                        return false;
                    }
                    set.add(board[x + a[j]][y + b[j]]);
                }
            }
        }
        return true;
    }
}