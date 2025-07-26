class Solution {

    public boolean binarySearch(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)
            {
                return true;
            }
            else if(nums[mid] > target)
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return false;
    }


    public int arithmeticTriplets(int[] nums, int diff) {

        int cnt = 0;
        
        for(int num : nums)
        {
            if(binarySearch(nums, num + diff) && binarySearch(nums, num + 2 * diff))
            {
                cnt++;
            }
        }

        return cnt;
        
    }
}
