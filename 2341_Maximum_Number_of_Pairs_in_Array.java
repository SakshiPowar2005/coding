class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        int [] freq = new int[101];
        int count = 0;

        if(nums.length == 1)
        {
            return new int[]{0,1};
        }
        
        if(nums.length == 2 && nums[0] == nums[1])
        {
            return new int[]{1,0};
        } 

        for(int i = 0; i < nums.length; i++)
        {
            freq[nums[i]]++;

            if((freq[nums[i]] % 2) == 0)
            {
                count++;
            }
        }

        return new int[]{count, nums.length - 2 * count};
    }
}
