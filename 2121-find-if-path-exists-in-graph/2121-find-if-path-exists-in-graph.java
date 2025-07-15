class Solution {
    private HashMap<Integer,HashSet<Integer>> map;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashSet<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println(map); 
        return hashpath(source,destination,new HashSet<>());
    }

    public boolean hashpath(int src, int dis, HashSet<Integer> visited) {
        if (src == dis) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src)) {
            if (!visited.contains(nbrs)) {
                boolean ans = hashpath(nbrs, dis, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        //visited.remove(src);
        return false;
    }
}