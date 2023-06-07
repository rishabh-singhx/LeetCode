class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int dp[][]=new int[dungeon.length][dungeon[0].length];
        for(int d[]:dp)
            Arrays.fill(d,-1);
        return calculate(dungeon,0,0,dp);
    }
    public int calculate(int[][] dungeon,int cr,int cc,int[][] dp) {
        if(cr==dungeon.length || cc==dungeon[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(cr==dungeon.length-1 && cc==dungeon[0].length-1)
        {
            return dungeon[cr][cc]>0?1:1-dungeon[cr][cc];
        }
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        
        int right=calculate(dungeon,cr,cc+1,dp);
        int down=calculate(dungeon,cr+1,cc,dp);
        int hp=Math.min(down,right)-dungeon[cr][cc];
        return dp[cr][cc]=hp>0?hp:1;
        
    }
}