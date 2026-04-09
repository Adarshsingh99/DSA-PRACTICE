class pair {
    int size, largest, smallest;

    pair(int size, int largest, int smallest) {
        this.size = size;
        this.largest = largest;
        this.smallest = smallest;
    }
}

class Solution {

    static int largestBst(Node root) {
        return solve(root).size;
    }

    static pair solve(Node root) {

        // Base case
        if (root == null) {
            return new pair(0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        pair left = solve(root.left);
        pair right = solve(root.right);

        
        if (left.largest < root.data && root.data < right.smallest) {

            int size = left.size + right.size + 1;

            int smallest = Math.min(root.data, left.smallest);
            int largest = Math.max(root.data, right.largest);

            return new pair(size, largest, smallest);
        }

        return new pair(
            Math.max(left.size, right.size),
            Integer.MAX_VALUE,
            Integer.MIN_VALUE
        );
    }
}