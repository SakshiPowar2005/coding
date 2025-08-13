// class Solution {
//     public int duplicateNumbersXOR(int[] nums) {
        
//         int result = 0;
//         Map<Integer, Integer> map =  new HashMap<>();

//         for(int num : nums)
//         {
//             map.put(num, map.getOrDefault(num, 0) + 1);

//             if(map.get(num) == 2)
//             {
//                 result ^= num;   
//             }

//         }

//         return result;

//     }
// }



// most optimal
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans=0;
        int a[]=new int[51];
        for(int i:nums)
        {
            a[i]++;
        }
        for(int i=1;i<=50;i++)
        {
            if(a[i]==2)
            {
                ans^=i;
            }
        }
        return ans;
    }
}
