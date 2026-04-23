class Solution {
    static int n;
    static Integer[][]dp;
    static int matrixMultiplication(int arr[]) {
        // code here
        n = arr.length;
      dp = new Integer[n][n];
        int ans = solve(arr,1,n-1);
        return ans;
    }
    static int solve(int []arr ,int i ,int j)
    {
        if(i >= j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int min = Integer.MAX_VALUE;
        
        for(int k = i;k<j;k++)
        {
            int temp = solve(arr,i,k)+solve(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            min = Math.min(temp,min);
        }
        return dp[i][j] =min;
    }
}