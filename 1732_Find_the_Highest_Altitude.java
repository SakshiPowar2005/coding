class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        int[] ans = new int[n + 1];
        
        ans[1] = gain[0];
        for(int i = 1;i < n;i++)
        {
            ans[i + 1] = gain[i] + ans[i];
        }

        Arrays.sort(ans);
        int maxValue = ans[n];
        return maxValue;
    }
}
