class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if(row*col==r*c)
        {
            int a[][]=new int[r][c];
            int b[]=new int[r*c];
            int count=0;
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    b[count]=mat[i][j];
                    count++;
                }
            }
            count=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    a[i][j]=b[count];
                    count++;
                }
            }
            return a;
        }
        return mat;
    }
}