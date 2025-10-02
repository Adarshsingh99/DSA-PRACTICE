

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size(); // number of vertices
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();
        
        // In case graph is disconnected
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                DFS(i, vis, adj, ls);
            }
        }
        return ls;
    }
    
    private void DFS(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);
        
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                DFS(it, vis, adj, ls);
            }
        }
    }
}
