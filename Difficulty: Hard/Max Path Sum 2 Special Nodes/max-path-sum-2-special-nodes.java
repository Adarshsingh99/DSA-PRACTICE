class Solution {

    int result = Integer.MIN_VALUE;

    int maxPathSum(Node root) {
        int val = solve(root);

        // skew tree case handle
        if (root.left == null || root.right == null) {
            result = Math.max(result, val);
        }

        return result;
    }

    public int solve(Node root) {

        if (root == null) return 0;

        // leaf node
        if (root.left == null && root.right == null) {
            return root.data;
        }

        int l = solve(root.left);
        int r = solve(root.right);

        // 👉 temp = single path (return)
        int temp;

        // 👉 ans = full path (only if both exist)
        int ans;

        if (root.left != null && root.right != null) {

            temp = Math.max(l, r) + root.data;

            ans = l + r + root.data;

            result = Math.max(result, ans);

            return temp;
        }

        // 👉 only one child exists
        if (root.left == null) {
            return r + root.data;
        } else {
            return l + root.data;
        }
    }
}