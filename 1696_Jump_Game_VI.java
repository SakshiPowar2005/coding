class Solution {
    public int maxResult(int[] nums, int k) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;

        int[] dp = new int[n];
        dp[0] = nums[0];

        dq.offer(0);

        for(int i = 1; i < n; i++)
        {
            if(dq.peekFirst() < i - k)
            {
                dq.pollFirst();
            }

            dp[i] = nums[i] + dp[dq.peekFirst()];

            while(!dq.isEmpty() && dp[dq.peekLast()] <= dp[i])
            {
                dq.pollLast();
            }

            dq.offer(i);
        }

        return dp[n - 1];
    }
}
