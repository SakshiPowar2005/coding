class Solution {
    public boolean divideArray(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < n;i += 2)
        {
                if(nums[i] != nums[i + 1])
                {
                    return false;
                }
        }

        return true;
    }
}


// class Solution
// {
//     public boolean divideArray(int[] nums)
//     {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int num : nums)
//         {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for(int num : map.keySet())
//         {
//             if(map.get(num) % 2 != 0)
//             {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
