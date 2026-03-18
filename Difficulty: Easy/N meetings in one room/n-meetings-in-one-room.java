class Solution {
   public class pair
    {
        int start;
        int end;
        pair(int s, int e)
        {
            start = s;
            end = e;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        
        pair [] meeting = new pair [n];
        for(int i=0;i<n ;i++)
        {
            meeting[i] = new pair(start[i] , end[i]);
        }
        
        // sort by end of time
        Arrays.sort(meeting , (a, b)->a.end - b.end);
        
        int ans =1;
        int prevEnd = meeting[0].end;
        for(int i=1;i<n ;i++)
        {
            if(meeting[i].start > prevEnd)
            {
                ans++;
                prevEnd = meeting[i].end;
            }
        }
        return ans;
    }
}
