class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        int ans =(int) Math.pow(2,n);
        return ans-1;
    }
}
