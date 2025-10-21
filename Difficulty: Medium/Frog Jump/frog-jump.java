// User function Template for Java
class Solution {
    
    int[]dp;
    int minCost(int[] height) {
        // code here
      int n = height.length;
      
      dp = new int[n+1];
      for(int i=0;i<=n;i++)
      {
          dp[i]=-1;
      }
      
      return solve(height,0,n);
      
    }
    
    public int solve(int[]height, int start, int n){
        
        if(start>=n-1){
            return 0;
        }
         
         if(dp[start]!=-1) return dp[start];
         int mini = Integer.MAX_VALUE;
        
        for(int nextStep=start+1 ;nextStep<=start+2 && nextStep<n;nextStep++)
        {
           int cost = Math.abs(height[start]-height[nextStep])+solve(height,nextStep,n);
           mini = Math.min(cost,mini);
        }
        
        return dp[start]=mini;
    }
}