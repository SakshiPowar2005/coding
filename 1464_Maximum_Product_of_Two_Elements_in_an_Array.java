// class Solution {
//     public int maxProduct(int[] nums) {
        
//         int n = nums.length;
//         int product = 0;

//         Arrays.sort(nums);

//         product = (nums[n - 1] - 1) * (nums[n - 2] - 1);
       
//         return product;
//     }
// }

class Solution
{
    public int maxProduct(int[] nums)
    {
        int n = nums.length;
        int product = 0;
        int largest = 0;
        int secondLargest = 0;

        for(int i = 0;i < n; i++)
        {
            if(nums[i] > largest)
            {
                secondLargest = largest;
                largest = nums[i];
            }
            else
            {
                secondLargest = Math.max(secondLargest, nums[i]);
            }
        }

        product = (secondLargest - 1) * (largest - 1);

        return product;
    }
}
