class Solution {
    int m,n;
    ArrayList<String>  res = new ArrayList<>();
    int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    String s = "RLDU";
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        m = maze.length;
        n = maze[0].length;
        
            // if(maze[0][0] == 0) {
            // res.add("-1");
            // return res;
        // }
        boolean vis [][] = new boolean [m][n];
        vis[0][0] = true; 
        String path = "";
        solve(0,0,path,vis,maze);
       
         Collections.sort(res);
         return res;
    }
    public void solve(int i, int j, String path , boolean[][] vis ,int[][] maze)
    {
        // if he reach 
        if(i==m-1 && j==n-1)
        {
            res.add(path);
            return;
        }
        for(int k=0;k<4;k++)
        {
            int new_i = i+dir[k][0];
            int new_j = j+dir[k][1];
            
            if(new_i < m && new_i >=0 && new_j<n && new_j>=0 && maze[new_i][new_j]!=0 && !vis[new_i][new_j])
            {
                vis[new_i][new_j]=true;
                
                solve(new_i,new_j,path+s.charAt(k),vis,maze);
                // BackTrack
                vis[new_i][new_j] = false;
            }
        }
    }
}