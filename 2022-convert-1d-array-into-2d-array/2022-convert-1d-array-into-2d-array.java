class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len=original.length;
        if(len==m*n)
        {
            int a[][]=new int[m][n];
            int count=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=original[count];
                    count++;
                }
            }
            return a;
        }
        int b[][]=new int[0][0];
        return b;
    }
}