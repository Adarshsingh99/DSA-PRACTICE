class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int left = 1;
        int right = stalls[n-1]-stalls[0];
        while(left <=right)
        {
            int mid = (left+right)/2;
            if(possible(stalls, k , mid))
            {
                left = mid+1;
            }
            else 
            {
                right = mid-1;
            }
        }
        return left-1;
    }
    public Boolean possible(int arr[] , int k ,int dist)
    {
        int cow = 1;
        int lastpos = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-lastpos >= dist)
            {
                cow++;
                lastpos = arr[i];
            }
        }
        return cow>=k;
    }
}