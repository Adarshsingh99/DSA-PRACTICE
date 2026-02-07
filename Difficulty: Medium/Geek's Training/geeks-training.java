class Solution {
    
    public int solve(int day, int task , int mat[][] , int dp[][])
    {
        // base case
        if(day==0)
        {
            int max = 0;
            for(int i=0;i<3;i++)
            {
                if(i!=task)
                {
                   max = Math.max(max,mat[0][i]);
                }
                
            }
            return max;
        }
        
        // memoization
        
        if(dp[day][task]!=-1) return dp[day][task];
        
        
        // do stufffff
        int max =0;
        for(int i=0;i<3;i++)
        {
            if(i!=task)
            {
            //   points = mat[day][i] + solve(day-1,i,mat);
               max = Math.max(max, mat[day][i] + solve(day-1,i,mat ,dp));
            }
        }
        return dp[day][task] = max;
        
    }
    public int maximumPoints(int mat[][]) {
        // code here
        int n = mat.length;
        
        // 2d-dp
        int dp[][] = new int [n+1][4];
        
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<4;j++)
            {
                dp[i][j]=-1;
            }
        }
        
       return solve(n-1, 3, mat ,dp);
    }
}