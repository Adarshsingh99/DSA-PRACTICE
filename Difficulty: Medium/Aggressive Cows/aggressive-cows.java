class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
 
       Arrays.sort(stalls);
       
       int start = 1;
       int end = stalls[stalls.length-1];
       
       while(start<=end)
       {
           int mid = (start+end)/2;
           if(possible(stalls,mid,k))
           {
               start=mid+1;
           }
           else
           {
               end=mid-1;
           }
       }
       return  end;
       
    }
    
    public boolean possible(int []stalls, int mini, int k)
    {
        int prev = stalls[0];
        int cow = 1;
        
        for(int i =1 ;i<stalls.length;i++)
        {
            if(stalls[i]-prev >=mini)
            {
                cow++;
                prev=stalls[i];
            }
            
            if(cow>=k) return true;
        }
        
        return false;
    }
}