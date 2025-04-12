//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends




class Solution {

    static ArrayList<String> ans = new ArrayList<>();

    public static void solve(String s, int n, int lastdigit, int N) {
        if (n == 0) {
            if (s.length() == N)
                ans.add(s);
            return;
        }

        solve(s + "0", n - 1, 0, N); // always allowed

        if (lastdigit == 0) {
            solve(s + "1", n - 1, 1, N); // only if previous was 0
        }
    }

    public static List<String> generateBinaryStrings(int n) {
        ans.clear(); // Important to avoid duplicates
        solve("", n, 0, n);
        return ans;
    }
}

     
     