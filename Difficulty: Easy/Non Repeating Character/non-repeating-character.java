class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for (char curr: s.toCharArray())
        {
            map.put(curr,map.getOrDefault(curr,0)+1);
            
            
        }
         for(char curr: s.toCharArray())
         {
            if(map.get(curr)==1)
            return curr;
         }
         return '$';
    }
}
