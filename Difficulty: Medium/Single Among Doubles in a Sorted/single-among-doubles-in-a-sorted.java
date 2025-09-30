class Solution {
    int single(int[] arr) {
        // code here
        int start=0;
        int end =arr.length-1;
        while(start <end)
        {
            int mid=(start+end)/2;
            if(mid%2==1)mid--;
            if(arr[mid]==arr[mid+1])
            {
                start=mid+2;
            }
            else end=mid;
        }
        return arr[start];
    }
}