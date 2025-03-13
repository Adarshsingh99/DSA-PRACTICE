//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static void reverse(int arr[],int idx)
    { 
        int right = arr.length-1-idx;
       if(idx>=right)return ;
       
       int temp = arr[idx];
       arr[idx]= arr[right];
       arr[right]=temp;
       
       reverse(arr,idx+1);
       
       
        
    }
    public void reverseArray(int arr[]) {
        // code here
        reverse(arr,0);
    }
}