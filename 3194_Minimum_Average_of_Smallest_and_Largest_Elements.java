class Solution {
    public double minimumAverage(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        
        double[] arr = new double[n / 2];
        
        for (int i = 0; i < n / 2; i++)
        {
            arr[i] = (nums[i] + nums[n - 1 - i]) / 2.0;
        }

        Arrays.sort(arr);
        
        return arr[0];

    }
}
