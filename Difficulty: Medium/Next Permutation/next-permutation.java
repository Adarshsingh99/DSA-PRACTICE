// User function Template for Java

class Solution {
   public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
   public void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length-1;
        int gola_index = -1;
        int idx =-1;
        for(int i=n;i>0;i--)
        {
           if(arr[i]>arr[i-1])
           {
               gola_index=i-1;
               break;
           }
           
        }
        // next greator element of gola element
        if(gola_index!=-1){
        for(int i=n;i>gola_index;i--)
        {
            if(arr[gola_index]<arr[i])
            {
                idx=i;
                break;
                
            }
        }
        swap(arr,gola_index,idx);
    }
    reverse(arr,gola_index+1);
        
        
    }
    
}