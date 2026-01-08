class Solution {
    public int minNumberOperations(int[] target) {

        int ans = target[0];
        int prev = target[0];
        int n = target.length;

        for(int i = 0; i < n; i++)
        {
            if(target[i] > prev)
            {
                ans += target[i] - prev;
            }

            prev = target[i];
        }

        return ans;
    }
}
