// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int k = pat.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<pat.length();i++)
        {
            map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1);
        }
        int need = map.size();
        int i=0;
        int j=0;
        int count=0;
        while(j < txt.length())
        {
           char ch = txt.charAt(j);
           if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    need--;
                }
            }
           while(j-i+1==k)
           {
               if(need==0) count++;
               char c = txt.charAt(i);
               if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                    if (map.get(c) == 1) {
                        need++;
                    }
                }
               i++;
           }
           j++;
        }
        return count;
        
    }
}