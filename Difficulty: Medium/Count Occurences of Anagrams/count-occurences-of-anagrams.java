// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for (int i =0;i<pat.length();i++)
        {
           map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1); 
        }
        
        int count = map.size();
        
        int i =0;
        int j =0;
        int k = pat.length();
        
        while( j< txt.length())
        {
           if(map.containsKey(txt.charAt(j)))
           {
               map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
               
           
           
           if(map.get(txt.charAt(j))==0)
           {
               count--;
           }
           }
           
           if(j-i+1 < k)
           {
               j++; 
           }
           
           else if(j-i+1 == k)
           {
               if(count ==0 )
               {
                   ans++;
               }
               
               if(map.containsKey(txt.charAt(i)))
               {
                   if(map.get(txt.charAt(i))==0)
                   {
                       count++;
                   }
                   map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
               }
               
               
               i++;
               j++;
               
           }
           
        }
        
        return ans;
    }
}