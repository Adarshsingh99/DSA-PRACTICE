/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

*/
class Solution {
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        // add your code here
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty())
        {
            Node node = q.remove();
            int sum=0;
            
            // i dont need to check for leaf node so 
            if(node.left==null && node.right==null) continue;
            if(node.left!=null) {
              
              q.add(node.left);
               sum+=node.left.data; 
            }
            if(node.right!=null)
            {
                q.add(node.right);
                sum+=node.right.data;
                
            }
            
            if(sum!=node.data) return 0;
        }
        
        return 1;
    }
}