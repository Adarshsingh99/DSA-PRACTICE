class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        // change matrix to adjecency list 
         List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Convert edge list to adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v); // directed edge u -> v
        }
        
        int[] vis = new int[V];
        for(int i=0;i<V;i++)
        {
           vis[i]=0; 
        }
        int [] pathVis = new int [V];
        for(int i=0;i<V;i++)
        {
            pathVis[i]=0;
        }
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
                if (dfs(i,adjList,vis,pathVis)==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int node,List<List<Integer>> adjList, int[]vis,int[]pathVis)
    {
  
        vis[node]=1;
        pathVis[node]=1;
        
        for(int it : adjList.get(node))
        {
            if(vis[it]==0)
            {
                if (dfs(it,adjList,vis,pathVis)==true)
                {
                    return true;
                }
            }
            else if (pathVis[it]==1)
                {
                    return true;
                }
        }
        pathVis[node]=0;
        return false;
    }
}