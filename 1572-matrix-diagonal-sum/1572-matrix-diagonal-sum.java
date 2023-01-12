class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=s+mat[i][i];
        }
        for(int i=0;i<n;i++)
        {
            s=s+mat[i][n-1-i];
        }
        if(n%2==0)
            return s;
        else
        {
            s=s-mat[n/2][n/2];
            return s;
        }
    }
}