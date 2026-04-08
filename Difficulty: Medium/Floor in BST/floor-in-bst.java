/*
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/
class Solution {
    public int findFloor(Node root, int x) {
        // code here
        int floor = -1;
        while(root!=null)
        {
            if(root.data==x) return root.data;
            
            if(root.data > x)
            {
                
                 root = root.left;
            }
            else
            {
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }
}
