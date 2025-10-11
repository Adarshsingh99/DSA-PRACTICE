class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        
        if(arr.length<k)
        {
            return -1;
        }
        
        int n=arr.length;
        
        int low =arr[0];
        for(int i=1;i<n;i++)
        {
            if(low < arr[i])
            low=arr[i];
        }
        
        int high =0;
        for(int i=0;i<n;i++)
        {
            high+=arr[i];
        }
        
        while(low<=high)
        {
            int mid = (low+high)/2;
            
            if(possible(arr,mid,k))
            {
                low = mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
    
    public boolean possible(int[]arr,int mid, int k)
    {
        int count=1;
        int pages=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(pages+arr[i]<=mid)
            {
                pages+=arr[i];
            }
            else
            {
                count++;
                pages=arr[i];
            }
        }
        return count>k;
    }
}