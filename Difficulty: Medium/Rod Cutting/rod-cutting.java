class Solution {
    public int cutRod(int[] price) {

        int n = price.length;
        Integer dp[][] = new Integer[n][n+1];

        return solve(0,0,price,n,dp);
    }

    public int solve(int i, int length, int[] price, int n, Integer dp[][])
    {
        if(length == n)
            return 0;

        if(i >= n)
            return 0;

        if(dp[i][length] != null)
            return dp[i][length];

        int take = 0;

        if(length + (i+1) <= n)
            take = price[i] + solve(i, length + (i+1), price, n, dp);

        int notTake = solve(i+1, length, price, n, dp);

        return dp[i][length] = Math.max(take, notTake);
    }
}