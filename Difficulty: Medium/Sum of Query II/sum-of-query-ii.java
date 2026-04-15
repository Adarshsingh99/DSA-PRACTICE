import java.util.*;

class Solution {
    int[] seg;

    List<Integer> querySum(int n, int arr[], int q, int queries[]) {
        List<Integer> ans = new ArrayList<>();
        seg = new int[(4 * n)];

        build(0, 0, n-1, arr);

    for(int i=0;i< 2*q;i+=2)
    {
        int start = queries[i]-1; // becuase 0-indexing me check kr rhe h
        int end = queries[i+1]-1;
        ans.add(query(start,end,0,0,n-1));
    }

        return ans;
    }

    void build(int i, int l, int r, int arr[]) {
        if (l == r) {
            seg[i] = arr[l];
            return;
        }

        int mid = (l + r) / 2;

        build(2 * i + 1, l, mid, arr);
        build(2 * i + 2, mid + 1, r, arr);

        seg[i] = seg[2 * i + 1] + seg[2 * i + 2];
    }

    int query(int start, int end, int i, int l, int r) {
        if (r < start || l > end) return 0;

        if (l >= start && r <= end) return seg[i];

        int mid = (l + r) / 2;

        return query(start, end, 2 * i + 1, l, mid) +
               query(start, end, 2 * i + 2, mid + 1, r);
    }
}