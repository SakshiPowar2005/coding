class Solution {
    public int differenceOfSum(int[] nums) {
        
        int n = nums.length;
        int eleSum = 0;
        int digSum = 0;

        for(int num : nums)
        {
            eleSum += num;
            int temp = num;  //copy of original array

            while(temp > 0)
            {
                digSum += temp % 10;  //add last digt
                temp /= 10;  //remove last digt
            }
        }

        return Math.abs(eleSum - digSum);
    }
}
