class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max=0;
        int i=0;
        int j=0;
        int sum=0;
        while(j<arr.length)
        {
            sum+=arr[j];
            
            // got k size window
            if(j-i+1==k)
            {
                max= Math.max(max, sum);
            }
            else if(j-i+1 > k)
            {
                sum-=arr[i];
                max= Math.max(max, sum);
                i++;
            }
            j++;
        }
        return max;
    }
}