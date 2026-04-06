

class Solution {
    void mirror(Node root) {
        // code here
                LinkedList<Node> q = new LinkedList<Node>();
       
        if(root != null){
            // Push the root node...
            q.add(root);
        }
        // Loop till queue is empty...
        while(!q.isEmpty()){
            // Dequeue front node...
            Node temp = q.poll();
            // Enqueue left child of the popped node...
            if(temp.left != null)
                q.add(temp.left);
            // Enqueue right child of the popped node
            if(temp.right != null)
                q.add(temp.right);
            // Swapping process...
            Node curr = temp.left;
            temp.left = temp.right;
            temp.right = curr;
    }
    }
}