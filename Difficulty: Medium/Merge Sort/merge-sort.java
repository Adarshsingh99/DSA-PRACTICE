class Solution {
    
    void merge(int arr[], int l, int m , int r)
    {
         int L = m-l+1;
         int R = r-m;
         
         int Larr[]= new int[L];
         int Rarr[] = new int [R];
         int k=l;
         
         // store left side of array
         for(int i=0;i<L;i++)
         {
             Larr[i]=arr[k];
             k++;
         }
         // store right side of array
         for(int i=0;i<R;i++)
         {
             Rarr[i]=arr[k];
             k++;
         }
         
          k=l;
         int i=0;  // initial index of first array is 0
         int j=0;
         
         while(i<L && j<R)
         {
             if(Larr[i]<=Rarr[j])
             {
                 arr[k]=Larr[i];
                 i++;
                 k++;
             }
             else
             {
                arr[k]=Rarr[j];
                 j++;
                 k++; 
             }
         }
         
         // 
         while(i<L)
         {
            
                 arr[k]=Larr[i];
                 i++;
                 k++; 
         }
         
         while(j<R)
         {
            arr[k]=Rarr[j];
                 j++;
                 k++; 
         }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l==r) return;
        
        int mid = l+(r-l)/2;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }
}