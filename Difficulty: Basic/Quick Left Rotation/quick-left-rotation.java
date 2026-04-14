class Solution {
    void leftRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}