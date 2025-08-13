// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
        
//         Arrays.sort(nums);
//         int n = nums.length;
//         List<Integer> list = new ArrayList<>();

//         for(int i = 0; i < n; i++)
//         {
//             if(nums[i] == target)
//             {
//                 list.add(i);
//             }
            
//         }

//         return list;
//     }
// }


class Solution
{
    public List<Integer> targetIndices(int[] nums, int target)
    {
        List<Integer> list = new ArrayList<>();
        int smaller = 0;  // count of numbers less than target
        int larger = 0;    // count of numbers largerto target
        int n = nums.length;

        for(int i = 0; i < n; i++)
        {
            if(nums[i] < target)
            {
                smaller++;
            }
            else if(nums[i] > target)
            {
                larger++;
            }
        }

        for(int i = smaller; i <= n - larger - 1; i++)
        {
            list.add(i);
        }
        
        return list;
    }
}
