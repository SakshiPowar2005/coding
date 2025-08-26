class Solution {
    public int maximumStrongPairXor(int[] nums) {
        
        int max = 0;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i ; j < nums.length; j++)
            {
                int k = Math.abs(nums[i] - nums[j]);
                int m = Math.min(nums[i], nums[j]);
                
                if(k <= m)
                {
                    max = Math.max(max, nums[j] ^ nums[i]);
                }
            }
        }

        return max;
    }
}
