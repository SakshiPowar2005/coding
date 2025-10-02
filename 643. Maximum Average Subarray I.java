class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        int maxsum = 0;
        for(int i = 0; i < k; i++)
        {
            sum += nums[i];
        }

        maxsum = sum;

        int start = 0;
        int end = k;
        while(end < nums.length)
        {
            sum -= nums[start];
            start++;

            sum += nums[end];
            end++;

            maxsum = Math.max(maxsum, sum);
        }

        return (double) maxsum / k;
    }
}
