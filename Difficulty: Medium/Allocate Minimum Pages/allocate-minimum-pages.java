class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        int left = 0;
        int right=0;
        for(int a : arr)
        {
            left = Math.max(left,a);
            right+=a;
        }
        while(left<right)
        {
            int mid = (left + right)/2;
            if(possible(arr,k,mid))
            {
                right=mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return right;
    }
    public boolean possible(int arr[], int k , int max)
    {
        int st = 1;
        int book = 0;
        for(int ar: arr)
        {
        if(ar+book > max)
        {
            st++;
            book=ar;
        }
        else
        {
            book+=ar;
        }
        }
        return st<=k;
    }
}