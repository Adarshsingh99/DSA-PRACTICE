class Solution {

    public void deleteMid(Stack<Integer> s) {
        int n = s.size();
        int k = (n / 2) + 1;  // correct middle position (1-based)
        solve(s, k);
    }

    public void solve(Stack<Integer> s, int k) {
        if(k == 1) {
            s.pop();
            return;
        }

        int temp = s.pop();
        solve(s, k - 1);
        s.push(temp);
    }
}