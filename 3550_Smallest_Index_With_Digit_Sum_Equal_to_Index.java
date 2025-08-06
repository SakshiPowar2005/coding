class Solution
{
    public int smallestIndex(int[] nums)
    {
        for(int i = 0;i < nums.length; i++)
        {
            if(nums[i] < 10 && nums[i] == i)
            {
                return i;
            }

            else if(nums[i] >= 10)
            {
                int digit = 0;
                while(nums[i] > 0)
                {
                    digit += nums[i] % 10;
                    nums[i] = nums[i] / 10;
                }

                if(digit == i)
                {
                    return i;
                }
            }
        }

        return -1;
    }
}
