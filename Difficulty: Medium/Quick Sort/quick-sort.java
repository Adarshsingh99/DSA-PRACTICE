//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().quickSort(arr, 0, n - 1);
            printArray(arr);
        }
    }
}
// } Driver Code Ends


class Solution {
    
    // function for swap.
    
    
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low>high)return;
        
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[high];
        int pi=low;
        for(int i=low;i<high;i++)
        {
            if(arr[i]<pivot)
            {
                int temp = arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp = arr[high];
        arr[high]=arr[pi];
        arr[pi]=temp;
        return pi;
        
    }
}
