class Solution {
    int findCeil(Node root, int x) {
        int ceil = -1;
        
        while (root != null) {
            
            if (root.data == x) {
                return root.data;
            }
            
            if (root.data < x) {
                root = root.right;
            } else {
                ceil = root.data;   
                root = root.left;
            }
        }
        
        return ceil;
    }
}