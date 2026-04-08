
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // code here
       solve(root1);
       solve(root2);
       Collections.sort(ans);
       return ans;
    }
    public void solve(Node root)
    {
        if(root== null) return;
        ans.add(root.data);
        solve(root.left);
        solve(root.right);
    }
}