class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int n = nums.length;
        int diff = 0;
        int maxdiff = 0;
        for(int i = 0; i < n; i++)
        {
            int nextIndex = (i + 1) % n;
            diff = Math.abs(nums[i] - nums[nextIndex]);

            if(diff > maxdiff)
            {
                maxdiff = diff;
            }

        }

        return maxdiff;
    }
}
