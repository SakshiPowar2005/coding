class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];

        Arrays.sort(nums);

        for(int i = 1;i < n;i++)
        {
            nums[i] += nums[i - 1];
        } 

        for(int i = 0;i < m;i++)
            {
                int j = Arrays.binarySearch(nums,queries[i]);
                ans[i] = Math.abs(j + 1);
            }

        return ans;
    }
}
