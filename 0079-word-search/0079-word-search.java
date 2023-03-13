class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean ans=search(board,i,j,word,0);
                    
                    if(ans==true)
                        return ans;
                }
            }
        }
        return false;
    }
    
    public static boolean search(char[][] board,int i,int j,String word,int idx)
    {
        if(idx==word.length())
        {
            return true;
        }
        if(i<0 || j<0||i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx))
        {
            return false;
        }
        int r[]={0,-1,0,1};
        int c[]={-1,0,1,0};
        board[i][j]='*';
        boolean ans=false;
        for(int k=0;k<r.length;k++)
        {
            ans=search(board,i+r[k],j+c[k],word,idx+1);
            if(ans==true)
                return ans;
            
        }
        board[i][j]=word.charAt(idx);
        return false;
    }
}