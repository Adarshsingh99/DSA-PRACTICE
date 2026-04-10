class Solution {
    ArrayList<Integer> ans = new ArrayList<>();

    ArrayList<Integer> boundaryTraversal(Node root) {
        if (root == null) return ans;

        // Step 1: Add root (if not leaf)
        if (!isleaf(root)) {
            ans.add(root.data);
        }

        // Step 2: Left boundary
        left(root.left);

        // Step 3: Leaf nodes
        leaf(root);

        // Step 4: Right boundary
        right(root.right);

        return ans;
    }

    // LEFT BOUNDARY
    public void left(Node root) {
        Node curr = root;

        while (curr != null) {
            if (!isleaf(curr)) {
                ans.add(curr.data);
            }

            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    // RIGHT BOUNDARY (reverse)
    public void right(Node root) {
        Node curr = root;
        ArrayList<Integer> temp = new ArrayList<>();

        while (curr != null) {
            if (!isleaf(curr)) {
                temp.add(curr.data);
            }

            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        // reverse add
        for (int i = temp.size() - 1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }

    // LEAF NODES
    public void leaf(Node root) {
        if (root == null) return;

        if (isleaf(root)) {
            ans.add(root.data);
            return;
        }

        leaf(root.left);
        leaf(root.right);
    }

    // CHECK LEAF
    public boolean isleaf(Node root) {
        return (root.left == null && root.right == null);
    }
}