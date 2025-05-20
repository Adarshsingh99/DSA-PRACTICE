// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int profit =0;
        int buy =prices[0];
        int i=1;
        while(i<prices.length)
        {
            if(prices[i] < prices[i-1])
            {
                profit+=(prices[i-1]-buy);
                buy=prices[i];
            }
             if(i==prices.length-1)
        {
           profit+=(prices[i]-buy); 
        }
            i++;
            
        }
       
        return profit;
    }
}