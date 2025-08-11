class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod = 1000_000_007;
        int temp = n;
        List<Integer> l = new ArrayList<>();
        int k = 0;
        while(n>0){
            if((n&1)!=0)
                l.add((1<<k)%mod );
            n = n>>1;
            k++;
        }
        System.out.println(l);
        int [] ans = new int[queries.length];
        Arrays.fill(ans,1);
        for(int i=0;i<queries.length;i++){
            long prod = 1;
            for(int j = queries[i][0];j<=queries[i][1];j++){
                prod = (prod * l.get(j)) % mod;
            }
            ans[i]=(int)prod;
        }
        return ans;
    }
}