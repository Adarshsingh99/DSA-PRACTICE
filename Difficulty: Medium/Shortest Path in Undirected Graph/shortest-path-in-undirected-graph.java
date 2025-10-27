 class Pair
{
    int first;
    int second;
    Pair(int first, int second)
    {
        this.first=first;
        this.second = second;
    }
};
class Solution {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int V = adj.size();
        int dist [] = new int [V];
        // sare distance ko infinte initialize kr diya
        for(int i=0;i<V ;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
 // from src the distance always start with zero
      dist[src]=0;
      Queue<Pair>q = new LinkedList<>();
      q.offer(new Pair(src,dist[src]));
      
      
      while(!q.isEmpty())
      {
          int node = q.peek().first;
          int d = q.peek().second;
          q.remove();
          
          // store only min distance
          dist[node]=d;
          // check for his neighbour
          for(int it : adj.get(node))  // ? i ki jagah node ko check karung
          {
            // agar jo distance update karne jaa rha wo less hai to 
            
            if(d+1<dist[it])  // @ye check kar lena jo value 
            // dalne jaa rha hu kya wo pahle se dali hui value se chhoti hai 
            {
                dist[it]=d+1;
                q.offer(new Pair(it,dist[it]));
            }
 // object hai to new lagana bhul jata hu
          
          }
      }
      // for rest k liye -1;
      for(int i=0;i<V;i++)
      {
          if(dist[i]==Integer.MAX_VALUE)
          {
              dist[i]=-1;
          }
      }
 
        return dist;
    }
}
