class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);

        for(int i = 0;i < n;i++)
        {
            map.putIfAbsent(temp[i],i);
        }

        int[] ans = new int[n];

        for(int i = 0;i < n;i++)
        {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}
