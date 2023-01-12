class Solution {
    public int countNegatives(int[][] grid) {
        int s=0;
        int row = 0;
		int col = grid[0].length - 1;
		while (row < grid.length && col >= 0) 
        {
			if (grid[row][col] < 0) 
            {
			    s=s+(grid.length-row);
                col--;
			} 
            else 
            {
				row++;
			}
		}
		return s;
    }
}