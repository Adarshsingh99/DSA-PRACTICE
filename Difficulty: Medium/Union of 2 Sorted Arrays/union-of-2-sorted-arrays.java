

public class Solution {
    public  ArrayList<Integer> findUnion(int[] a, int[] b) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            
            if (a[i] == b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++; j++;
            } 
            else if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } 
            else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        // remaining elements of a
        while (i < n) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        // remaining elements of b
        while (j < m) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}