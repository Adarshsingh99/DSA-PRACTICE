// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
       int i=0;
       int j=0;
       while(j<arr.length)
       {
           if(arr[j]!=0)
           {
               i++;
               j++;
           }
           else{
               
               while(j<arr.length && arr[j]==0)
               {
                   j++;
               }
               if(j<arr.length){
               int temp = arr[i];
               arr[i]=arr[j];
               arr[j]= temp;
               
               i++;
               j=i;
               }
           }
       }
    }
}