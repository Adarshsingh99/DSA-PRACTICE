// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        int start=0, end=arr.length-1;
        int ans =-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            
            if(arr[mid]==1)
            {
                ans=mid;
                end=mid-1;
            }
            
            else 
            start=mid+1;
        }
        return ans;
    }
}