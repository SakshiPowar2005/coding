class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        int n = nums.length;
        int max = 0;
        int maxele = -1;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] > maxele)
            {
                maxele = nums[i];
            }
        }
        
        while(k > 0)
        {
            max += maxele;
            maxele++;
            k--;

        }

        return max;
    }
}
