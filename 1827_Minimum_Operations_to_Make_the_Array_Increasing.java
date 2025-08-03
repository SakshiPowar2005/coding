// class Solution {
//     public int minOperations(int[] nums) {
        
//         int operation = 0;
//         int n = nums.length;
//         int [] ans = new int[n];
//         ans[0] = nums[0];

//         for(int i = 1; i < n ;i++)
//         {
//             if(nums[i] <= ans[i - 1])
//             {
//                 ans[i] = ans[i - 1] + 1;
//                 operation += ans[i] - nums[i];
//             }

//             else
//             {
//                 ans[i] = nums[i];
//             }

//         }

//         return operation;
//     }
// }

class Solution {
    public int minOperations(int[] nums) {
      
        int len=nums.length;
        int arr[]=new int[len];
        int count=0;
      
        for(int i=0; i<len; i++){
            arr[i] = nums[i];
        }
      
        for(int i=0; i<len-1; i++){
            if(arr[i+1] <= arr[i]){
                arr[i+1] = arr[i]+1;
            }
        }
      
        for(int i=0; i<len; i++){
            count+=arr[i]-nums[i];
        }
      
        return count;
    }
}
