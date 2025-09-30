class Solution {
    ArrayList<String>ans = new ArrayList<>();
    
    public ArrayList<String> binstr(int n) {
        // code here
        solve("",n);
        return ans;
    }
    public void solve(String s,int n)
    {
        if(s.length()==n)
        {
            ans.add(s);
            return;
        }
         solve(s+"0",n);
         solve(s+"1",n);
        
        
    }
}
