//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution T = new Solution();

            ArrayList<Integer> res = T.boundaryTraversal(root);
            for (Integer num : res) System.out.print(num + " ");
            System.out.println();
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
    // check leaves node
    public boolean checkLeaf(Node root)
    {
        return root.left==null && root.right==null;
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
         if (!checkLeaf(node)) result.add(node.data);
        
        if(node == null)
        {
            return result;
        }
        
        addLeftNode(node.left,result);
        addLeaves(node,result);
        addRightNode(node.right,result);
        
        return result;
    }
    
    // 
    public void addLeftNode(Node node, ArrayList<Integer> result )
    {
        Node curr = node;
         
         while(curr!=null)
         {
             if(!checkLeaf(curr)){
             result.add(curr.data);
             }
             if(curr.left!=null) curr= curr.left;
             else curr= curr.right;
         }
    }
    
    //
    public void addRightNode(Node node, ArrayList<Integer> result )
    {
        Stack<Integer> st = new Stack<>();
         Node curr = node;
         while(curr!=null)
         {
             if(!checkLeaf(curr)){
             st.push(curr.data);
             }
             if(curr.right!=null) curr= curr.right;
             else curr= curr.left;
         }
         while(!st.isEmpty())
         {
             int top = st.pop();
             result.add(top);
         }
    }
    
    public void addLeaves(Node node ,ArrayList<Integer> result)
    {
        if (checkLeaf(node))
        {
            result.add(node.data);
            return;
        }
        
        if (node.left!=null){ 
            addLeaves(node.left,result);
            
        }
        if (node.right!=null)
        {
            addLeaves(node.right,result);
        }
    }
}
