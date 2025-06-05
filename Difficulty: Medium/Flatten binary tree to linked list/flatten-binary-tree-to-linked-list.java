// User function Template for Java

class Solution {
    public static void flatten(Node root) {
        // code here
       while(root!=null)
       {
           
           if(root.left==null)
           {
               root=root.right;
           }
           else
           {
               Node curr = root.left;
               while(curr.right!=null)
               {
                   curr= curr.right;
               }
               
               curr.right=root.right;
               root.right = root.left;
               
               root.left=null;;
               root= root.right;
           }
           
       }
    }
}