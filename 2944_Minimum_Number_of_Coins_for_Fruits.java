class Solution {
    public int minimumCoins(int[] prices) {

        int n = prices.length;
        int[] ans = new int[n + 1];
        ans[n] = 0;
        for(int i = n - 1; i >= 0; i--)
        {
            int minCoins = Integer.MAX_VALUE;
            for(int j = i + 1; j <= Math.min(2 * i + 2, n); j++)
            {
                minCoins = Math.min(minCoins, ans[j]);
            }

            ans[i] = minCoins + prices[i];
        }

        return ans[0];
    }
}
