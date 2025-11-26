class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        
        // base case..
        if(low>= high) return;
        
        // find pivot index
        int pidx = partition(arr,low,high);
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1,high);
        
    }
    private int partition(int[] arr, int low, int high) {
        
        // pivot element
        int pivot = arr[high];
        int pidx =low;  // 
        
        for(int i=low;i<high;i++)
        {
            if(arr[i]<=pivot)
            {
                swap(arr,i,pidx);
                pidx++;
            }
        }
        swap(arr,pidx,high);  // remember this i dont know why this code
        return pidx;
    }
    
    private void swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}