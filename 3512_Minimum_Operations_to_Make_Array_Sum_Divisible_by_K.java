class Solution {
    public int minOperations(int[] nums, int k) {
        
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum += nums[i];
            ans = sum % k;
        }

        return ans;
    }
}
