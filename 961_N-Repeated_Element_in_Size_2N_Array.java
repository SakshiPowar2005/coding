// class Solution {
//     public int repeatedNTimes(int[] nums) {
        
//         Map<Integer, Integer> map = new HashMap<>();
//         int ele = 0;
//         for(int num : nums)
//         {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for(Map.Entry<Integer, Integer> entry : map.entrySet())
//         {
//             if(entry.getValue() == nums.length / 2)
//             {
//                 ele = entry.getKey();
//             }
//         }

//         return ele;
//     }
// }


// most optimal solution
class Solution
{
    public int repeatedNTimes(int[] nums)
    {
      //compare elements with their neighbors that are distance 1, 2, or 3 away
        for(int k = 1; k <= 3; k++)
        {
            for(int i = 0; i < nums.length - k; i++)
            {
                if(nums[i] == nums[i + k])
                {
                    return nums[i];
                }
            }
        }

        throw null;
    }
}
