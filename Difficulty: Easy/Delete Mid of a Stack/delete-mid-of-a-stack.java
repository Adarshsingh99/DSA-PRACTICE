//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            Stack<Integer> myStack = new Stack<>();
            int n = temp.length;
            // adding elements to the stack
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(temp[i]);
                myStack.push(x);
            }
            Solution obj = new Solution();
            obj.deleteMid(myStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek() + " ");
                myStack.pop();
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
//  static void insertAtlast(Stack<Integer> st , int element)
//     {
//         if(st.isEmpty())
//         {
//             st.push(element);
//             return;
//         }
        
//         int temp = st.pop();
//         insertAtlast(st,element);
//         st.push(temp);
//       }
    
    // function for reverseing stack
    // static void reverse(Stack<Integer> st)
    // {
    //     if(st.isEmpty())
    //     {
    //         return;
    //     }
        
        
    //     int temp = st.pop();
    //     reverse(st);
    //     insertAtlast(st,temp);
    // }
    
    static void solve(Stack<Integer> s , int middle)
    {
        if(s.size()==middle)
        {
            s.pop();
            return;
        }
        
        
        int temp = s.pop();
        solve(s,middle);
        s.push(temp);
        
    }
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int middle = (s.size()+1)/2;
        solve(s,middle);
        // reverse(s);
    }
}
