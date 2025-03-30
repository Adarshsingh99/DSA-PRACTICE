//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Using a Set to remove duplicates
            Set<Integer> uniqueElements = new LinkedHashSet<>();
            for (String token : tokens) {
                uniqueElements.add(Integer.parseInt(token));
            }

            // Converting the set to an array
            int[] arr = new int[uniqueElements.size()];
            int idx = 0;
            for (int num : uniqueElements) {
                arr[idx++] = num;
            }

            // Finding and printing subsets
            ArrayList<ArrayList<Integer>> res = new Solution().subsets(arr);
            for (ArrayList<Integer> subset : res) {
                if (subset.size() == 0) {
                    System.out.println("[]");
                } else {
                    for (int num : subset) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        Arrays.sort(arr); // ✅ Step 1: Sort array for lexicographical order
        solve(0, arr, new ArrayList<>());
        return result;
    }

    private void solve(int start, int arr[], ArrayList<Integer> temp) {
        result.add(new ArrayList<>(temp));
        for(int i = start;i<arr.length;i++)
        {
            temp.add(arr[i]);
            solve(i+1,arr,temp);
            temp.remove(temp.size()-1);
        }
    }
}

