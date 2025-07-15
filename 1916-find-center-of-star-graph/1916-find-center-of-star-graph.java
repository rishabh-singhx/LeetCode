class Solution {
    public int findCenter(int[][] edges) {
        int ans=0;
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<2;j++){
                if(l.contains(edges[i][j]))
                    return edges[i][j];
                else
                    l.add(edges[i][j]);
            }
        }
        return 0;
    }
}