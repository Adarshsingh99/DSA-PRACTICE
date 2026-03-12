class Solution {
     List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates,target,arr);
        return res;
    }
    public void solve(int i , int[] candidates, int target , ArrayList<Integer> arr)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(arr));
            return;
        }
         
         for(int k = i;k<candidates.length;k++)
         {
            // remove duplicates
            if(k > i && candidates[k]==candidates[k-1])
            {
                continue;
            }
            // pruning -- when elements are greator then target..
            if(candidates[k] > target)
            {
                break;
            }
           arr.add(candidates[k]);
           solve(k+1,candidates , target-candidates[k] ,arr );
           arr.remove(arr.size()-1);
         }
    }
}