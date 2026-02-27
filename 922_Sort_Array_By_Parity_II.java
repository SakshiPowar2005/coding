class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        int[] even_odd_arr = new int[n];
        int evenIndex = 0;
        int oddIndex = 1;

        for(int i = 0; i < n; i++)
        {
            if(nums[i] % 2 == 0)
            {
                even_odd_arr[evenIndex] = nums[i];
                evenIndex += 2;
            }
            else
            {
                even_odd_arr[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }

        return even_odd_arr;
    }
}
