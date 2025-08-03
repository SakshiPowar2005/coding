// class Solution
// {
//     public boolean canAliceWin(int[] nums)
//     {
//         int n = nums.length;
//         int largest = Integer.MIN_VALUE;

//         for(int i = 0 ; i < n ;i++)
//         {
//             largest = Math.max(largest, nums[i]);
//         }

//         int sum = 0;
//         for(int i = 0 ; i < n ;i++)
//         {
//             sum += nums[i];
//         }

//         int total = sum - largest;

//         if(total == largest)
//         {
//             return false;
//         }

//         return true;
//     }
// }

class Solution
{
    public boolean canAliceWin(int[] nums)
    {
        int cnt1 = 0;
        int cnt2 = 0;
        int n = nums.length;

        for(int i = 0;i < n;i++)
        {
            if(nums[i] < 10)
            {
                cnt1 += nums[i];
            }

            else
            {
                cnt2 += nums[i];
            }
        }

        return cnt1 != cnt2;
    }
}
 
