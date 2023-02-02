class Solution {
    public boolean exist(char[][] board, String word) 
    {
        for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[0].length; j++)
			{
				if(board[i][j]==word.charAt(0))
				{
					boolean ans=Word_Search(board,i,j,word,0);
					if(ans)
					{
						return ans;
					}
				}
			}
		}
		return false;  
    }
    
    public static boolean Word_Search(char[][] maze, int cr, int cc, String word, int idx) 
	{
		if(idx==word.length())
		{
			return true;
		}
		
		if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]!=word.charAt(idx))
		{
			return false;
		}
		
		int []r= {-1,1,0,0};
		int []c= {0,0,-1,1};
		maze[cr][cc]='*';
		boolean ans=false;
		
		for (int i = 0; i < c.length; i++) 
		{
			ans = Word_Search(maze, cr+r[i], cc+c[i], word, idx+1);
			{
				if(ans)
					return ans;
			}
		}
		maze[cr][cc]=word.charAt(idx);
		return false;
	}
}