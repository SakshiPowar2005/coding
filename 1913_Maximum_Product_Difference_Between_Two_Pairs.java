// class Solution {
//     public int maxProductDifference(int[] nums) {
        
//         Arrays.sort(nums);
//         int n = nums.length;
//         int min = nums[0] * nums[1];
//         int max = nums[n - 1] * nums[n - 2];
//         int product = max - min;

//         return product;
//     }
// }



class Solution
{
    public int maxProductDifference(int[] nums)
    {
        int largest = 0,secondLargest = 0;
        int smallest = Integer.MAX_VALUE,secondSmallest = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i = 0;i < n;i++)
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

        for(int i = 0;i < n;i++)
        {
            if(nums[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = nums[i];
            }
            else
            {
                secondSmallest = Math.min(secondSmallest, nums[i]);
            }
        }

        int product = (secondLargest * largest) - (secondSmallest * smallest);

        return product;

    }
}
