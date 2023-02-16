class Solution {
    static int count=0;
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
		count=0;
        Printpath(board, 0, n);
        return count;
    }
    public static void Printpath(boolean[][] board, int row, int tq) {
		if (tq == 0) {
			count++;
            return;
		}
		if (row == board.length) {
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (isitpossible(board, row, col) == true) {
				board[row][col] = true;
				Printpath(board, row + 1, tq - 1);
				board[row][col] = false;
			}
		}
	}

	public static boolean isitpossible(boolean[][] board, int row, int col) {
		// upper Case
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}

		// left diagonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}
		// right diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
			r--;
		}
		return true;
	}
}