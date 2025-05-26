/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    public static boolean isSymmetric(Node root) {
        // your code here;
        Stack<Node> st = new Stack<>();
        st.push(root.left);
        st.push(root.right);
        while(!st.isEmpty())
        {
            Node right = st.pop();
            Node left = st.pop();
            
            if(right==null && left == null) continue;
            if(right == null || left == null || right.data != left.data) return false;
            
            st.push(left.left);
            st.push(right.right);
            st.push(left.right);
            st.push(right.left);
        }
        return true;
    }
}