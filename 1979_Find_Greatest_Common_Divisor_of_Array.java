// class Solution {
//     public int findGCD(int[] nums) {
        
//         int n = nums.length;
//         int result = 0;
//         Arrays.sort(nums);
//         int smallest = nums[0];
//         int largest = nums[n - 1];

//         for(int i = 1;i < n;i++)
//         {
//             result = GCD(smallest, largest);
//         }

//         return result;

//     }

//     private int GCD(int a, int b)
//     {
//         if(b == 0)  return a;
//         return GCD(b, a % b);
//     }
// }


class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
