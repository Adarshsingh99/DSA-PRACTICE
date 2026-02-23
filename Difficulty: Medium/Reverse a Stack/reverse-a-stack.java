class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())
        {
            return;
        }
        int temp = st.pop();
        reverseStack(st);
        insertAtBottom(st,temp);
    }
    public static void insertAtBottom(Stack<Integer> st, int temp)
    {
        if(st.isEmpty())
        {
            st.push(temp);
            return;
        }
        
        int val = st.pop();
        insertAtBottom(st,temp);
        st.push(val);
    }
}
