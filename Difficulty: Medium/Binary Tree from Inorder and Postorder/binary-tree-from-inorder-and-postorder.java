class Solution {
    Node buildTree(int[] inorder, int[] postorder) {
        // code here
       HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
       return solve(inorder, 0, inorder.length-1,postorder,0,postorder.length-1,map);
    }
    Node solve(int[] inorder , int inStart,int inEnd , int[] postorder , int postStart , int postEnd , HashMap<Integer,Integer> map)
    {
        if(inStart>inEnd || postStart>postEnd)
        {
            return null;
        }
        
        Node root = new Node(postorder[postEnd]);
        // index of root in the inorder
        int idx = map.get(root.data);
        // left SUbtree size
        int leftSize  = idx-inStart;
        // right Subtree size
        int rightSize = inEnd - idx;
        
         root.left = solve(inorder,inStart, idx-1, postorder, postStart,(postStart+leftSize-1),map);
        root.right = solve(inorder,idx+1,inEnd,postorder, postEnd-rightSize,postEnd-1,map);
        return root; 
    }
}