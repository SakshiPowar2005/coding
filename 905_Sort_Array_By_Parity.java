// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
        
//         int n = nums.length;
//         int[] res = new int[n];
//         int index = 0;

//         if(n == 1)
//         {
//             return nums;
//         }

//         for(int i = 0;i < n; i++)
//         {
//             if(nums[i] % 2 == 0)
//             {
//                 res[index] = nums[i];
//                 index++;
//             }

//         }

//         for(int i = 0; i < n; i++)
//         {
//             if(nums[i] % 2 != 0)
//             {
//                 res[index] = nums[i];
//                 index++;
//             }
//         }

//         return res;
//     }
// }

class Solution
{
    public int [] sortArrayByParity(int[] nums)
    {
        int left = 0, right = nums.length - 1;
        while(left < right)
        {
            if(nums[left] % 2 > nums[right] % 2)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if(nums[left] % 2 == 0) left++;
            else if(nums[right] % 2 == 1) right--;
        
        }

        return nums;
    }
}
