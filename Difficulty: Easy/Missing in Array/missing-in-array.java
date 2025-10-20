class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        // code here
        int search =1;
        int i=0;
        while(i<arr.length && arr[i]==search)
        {
            i++;
            search++;
        }
        return search;
    }
}