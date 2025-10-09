class Solution {
      static  List<Integer>[] constructadj(int V, int [][] edges){
        
        List<Integer>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        
        return adj;
    } 
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<Integer> [] adj = constructadj(V,edges);
        
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        int vis[]=new int[V];
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
                if(dfs(adj,-1,i,vis)==true)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
    
    public boolean dfs(List<Integer>[] adj,int parent,int node,int[] vis)
    {
        vis[node]=1;
        for(int it : adj[node])
        {
            if(vis[it]==0)
            {
                if(dfs(adj,node,it,vis))
                {
                    return true;
                }
                
            }
             else if(parent!=it)
            {
               return true;
             }
            
        }
        return false;
    }
    
}