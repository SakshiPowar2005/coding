class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int [] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;

        while(left <= right)
        {
            int leftSqu = nums[left] * nums[left];
            int rightSqu = nums[right] * nums[right];

            if(leftSqu > rightSqu)
            {
                ans[k] = leftSqu;
                left++;
            }
            else
            {
                ans[k] = rightSqu;
                right--;
            }

            k--;
        }

        return ans;
    }
}
