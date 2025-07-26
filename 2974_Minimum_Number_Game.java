class Solution {
    public int[] numberGame(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.sort(nums);

        for(int i = 0 ; i < n ; i = i + 2)
        {
            ans[i] = nums[i + 1];
            ans[i + 1] = nums[i];
        }
        
        return ans;
    }
}
