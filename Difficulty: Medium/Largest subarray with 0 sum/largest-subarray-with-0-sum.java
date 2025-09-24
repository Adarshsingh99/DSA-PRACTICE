class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int Ps = 0;
        int ans =0;
        
      map.put(0,-1);
        
        for(int i=0;i<arr.length;i++)
        {
            Ps+=arr[i];
            int tar = Ps-0;
            
            if(map.containsKey(tar))
            {
                ans = Math.max(ans, i - map.get(tar) );
            }
            else
            {
                map.put(Ps,i);
            }
        }
        return ans;
        
    }
}