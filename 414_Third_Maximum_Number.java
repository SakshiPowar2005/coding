class Solution {
    public int thirdMax(int[] nums) {
        
        // int count = 1;
        // Arrays.sort(nums);
        // for(int i = nums.length - 2; i >= 0; i--)
        // {
        //     if(nums[i] != nums[i + 1])
        //     {
        //         count++;
        //     }

        //     if(count == 3)
        //     {
        //         return nums[i];
        //     }
        // }

        // return nums[nums.length - 1];



        //optimal approach
        Long first = null;
        Long second = null;
        Long third = null;
        for(int num : nums)
        {
            if(first != null && num == first || second != null && num == second || third != null && num == third )
            {
                continue;
            }

            if(first == null || num > first)
            {
                third = second;
                second = first;
                first = (long) num; 
            }
            else if(second == null || num > second)
            {
                third = second;
                second = (long) num;
            }
            else if(third == null || num > third)
            {
                third = (long) num;
            }
        }

        return third == null ? first.intValue(): third.intValue();
    }
}
