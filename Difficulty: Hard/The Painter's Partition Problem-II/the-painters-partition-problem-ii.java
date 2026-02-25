class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int left = 0;
        int right = 0;
        for(int a : arr)
        {
            left = Math.max(a , left);
            right+=a;
        }
        while(left<right)
        {
            int mid = (left+right)/2;
            if(possible(arr,k, mid))
            {
                right = mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return right;
    }
    public Boolean possible(int arr[] ,int k , int max)
    {
        int painters = 1;
        int sum =0;
        for(int a : arr)
        {
            if(a+sum > max)
            {
                painters++;
                sum = a;
            }
            else
            {
                sum+=a;
            }
        }
        return painters <=k;
    }
}
