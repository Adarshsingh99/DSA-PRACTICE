
class Solution {
    public int height(Node root) {
        // code here
        if(root==null) return 0;
        return maxDepth(root)-1;
        
    }
   
    public int maxDepth(Node root) {
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }
}