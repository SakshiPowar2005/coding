// No need to use HashMap when values are small and bounded:


// class Solution {
//     public int sumOfUnique(int[] nums) {
        
//         int sum = 0;
//         Map<Integer,Integer> map = new HashMap<>();

//         for (int num : nums) {
//             if (map.containsKey(num)) {
//                  map.put(num, map.get(num) + 1);
//             } else {
//                    map.put(num, 1);
//                }
//         }

//         // traverse through all the key-value pairs in the map
//         for(Map.Entry <Integer, Integer> entry : map.entrySet())
//         {
//             if(entry.getValue() == 1)
//             {
//                 sum += entry.getKey();
//             }
//         }

//         return sum;
//     }
// }


class Solution
{
    public int sumOfUnique(int[] nums)
    {

        int[] ans = new int[101];
        for(int i = 0;i < nums.length; i++)
        {
            ans[nums[i]]++;
        }

        int sum = 0;
        for(int i = 0;i < 101; i++)
        {
            if(ans[i] == 1)
            {
                sum += i;
            }
        }

        return sum;

    }
}
