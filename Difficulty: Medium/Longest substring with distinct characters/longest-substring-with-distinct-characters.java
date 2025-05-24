// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int length =0;
        int start=0;
        int n = s.length();
        int i=1;
        while(i<n)
        {
            char curr = s.charAt(i);
            int idx = start;
            while(idx<i)
            {
                if(s.charAt(idx)!=s.charAt(i))
                {
                    idx++;
                }
                else
                {
                    length= Math.max(length,i-start);
                    start=idx+1;
                    break;
                }
            }
            
            i++;
        }
         length = Math.max(length, n - start);
        return length;
        
    }
}