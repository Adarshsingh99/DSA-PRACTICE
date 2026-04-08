

class Solution {
    public boolean search(Node root, int key) {
        // code here
        while(root!=null)
        {
            if(root.data==key)
            {
                return true;
            }
            if(root.data < key)
            {
                root=root.right;
            }
            else {
                root= root.left;
            }
        }
        return false;
        
    }
}