
class GfG {
    static int st[];

    public static int[] constructST(int arr[], int n) {
        // Add your code here
        st = new int [4*n];
        build(0,0,n-1,arr);
        return st;
    }

    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st[], int n, int l, int r) {
        // Add your code here
        
        return query(l,r,0,0,n-1);
        
    }
    public static void build(int i, int l ,int r,int [] arr)
    {
        if(l==r)
        {
             st[i] = arr[l];
             return;
        }
        int mid = (l+r)/2;
        build(2*i+1,l,mid,arr);
        build(2*i+2,mid+1,r,arr);
        st[i] = Math.min(st[2*i+1],st[2*i+2]);
    }
    public static int query(int start, int end , int i, int l , int r)
    {
        if(r < start || l > end)
        {
            return Integer.MAX_VALUE;
        }
        else if(l >= start && r <= end)
        {
            return st[i];
        }
        int mid = (l+r)/2;
        
        return Math.min(query(start,end,2*i+1,l,mid), query(start,end,2*i+2,mid+1,r));
    }
}