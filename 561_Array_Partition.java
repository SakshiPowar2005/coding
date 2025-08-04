class Solution {
    public int arrayPairSum(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
      // int mini = 0;

        for(int i = 0 ; i < n ; i += 2)
        {
            // if(n % i == 0 && i % 2 == 0)
            // {
            //     left = i;
            // }
            // else
            // {
            //     right = i;
            // }

            // mini = Math.min(nums[left], nums[right]);

            sum += nums[i];
        }

        return sum;
    }
}
