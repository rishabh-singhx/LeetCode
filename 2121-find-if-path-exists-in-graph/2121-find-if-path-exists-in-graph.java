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
        return BFS(source,destination);
    }

    public boolean BFS(int src, int des) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            // 1. remove
            int rv = q.poll();
            // 2. Ignore if already visited
            if (visited.contains(rv)) {
                continue;
            }
            // 3.marked visited
            visited.add(rv);
            // 4. self work
            if (rv == des) {
                return true;
            }
            // 5. add nbrs unvisited
            for (int nbrs : map.get(rv)) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

}