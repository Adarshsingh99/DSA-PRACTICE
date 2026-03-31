// User function Template for Java

class Solution {
    static Integer[][] dp ;
    // Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) {
        // Your code here
        dp = new Integer[a+1][b+1];
        return solve(0,0,a,b);
    }
    public static int solve(int i, int j, int a ,int b)
    {
        if(i==a-1 && j==b-1)
        {
            return 1;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(i<0 || i>=a || j <0 ||j>=b) return 0;
        int down = solve(i+1,j,a,b);
        int right = solve(i,j+1,a,b);
        return dp[i][j] = down + right;
    }
}