class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0;
        int ans=0;
        for(int i=0;i<accounts.length;i++)
        {
            s=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                s=s+accounts[i][j];
            }
            ans=Math.max(s,ans);
        }
        return ans;
    }
}