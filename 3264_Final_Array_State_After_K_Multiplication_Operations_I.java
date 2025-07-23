class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        int n = nums.length;
        int[] ans = nums.clone(); //copy nums arrray

        while(k-- > 0)
        {
            int min = 0;
            for(int i = 1;i < n;i++)
            {
                if(ans[i] < ans[min])
                {
                    min = i;
                }
            }

            ans[min] = ans[min] * multiplier;
        }
        
        return ans;
    }
}
