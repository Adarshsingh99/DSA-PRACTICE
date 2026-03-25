

class Solution {
    public static int minCost(int[] arr) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Step 1: Add all elements
        for (int a : arr) {
            minHeap.add(a);
        }

        int cost = 0;

        // Step 2: Combine smallest two
        while (minHeap.size() > 1) {
            int x = minHeap.poll();
            int y = minHeap.poll();

            int sum = x + y;
            cost += sum;

            minHeap.add(sum);
        }

        return cost;
    }
}