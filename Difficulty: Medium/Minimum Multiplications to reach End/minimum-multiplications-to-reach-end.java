// User function Template for Java
class pair
{
    int first;
    int second;
    pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        // Your code here
        if(start==end) return 0;
        int dist [] = new int [100000];
        for(int i=0;i<100000;i++)
        {
            dist[i]=(int)1e9;
        }
        dist[0]=start;
        int mod = 100000;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(start,0));
        // dijkastra 
        while(!q.isEmpty())
        {
            int node = q.peek().first;
            int step = q.peek().second;
            q.remove();
            for(int it : arr)
            {
                int num = (it*node)%mod;
                if(step+1<dist[num])
                {
                    dist[num]=step+1;
                    if(num==end) return step+1;
                    q.add(new pair(num,step+1));
                }
            }
        }
        return -1;
    }
}
