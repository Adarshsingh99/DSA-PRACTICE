// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int i=0, j=0, k=pat.length(),ans=0;
        HashMap<Character,Integer>map = new HashMap<>();
        for(int a=0;a<k;a++)
        {
            map.put(pat.charAt(a),map.getOrDefault(pat.charAt(a),0)+1);
        }
        int count=map.size();
        int n=txt.length();
        while(j<n)
        {
            char ch = txt.charAt(j);
            if(map.containsKey(ch))
            {
                map.put(ch,map.getOrDefault(ch,0)-1);
                if(map.get(ch)==0)
                {
                    count--;
                }
            }
            if(j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1==k){
                if(count==0) ans++;
                char left = txt.charAt(i);
                if(map.containsKey(left))
               {
                map.put(left,map.getOrDefault(left,0)+1);
                if(map.get(left)==1)
                {
                    count++;
                }
            }
            i++;
            j++;
            }
        }
        return ans;
    }
}