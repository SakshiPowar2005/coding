class Solution {
    public int countPairs(int[] nums, int k) {
        
        int cnt = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] == nums[i] && ((i * j) % k) == 0)
                {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
