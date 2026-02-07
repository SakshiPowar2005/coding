class Solution {
    public int findLHS(int[] nums) {
        
        int n = nums.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet())
        {
            if(map.containsKey(key + 1))
            {
                result = Math.max(result, map.get(key) + map.get(key + 1));
            }
        }

        return result;
    }
}
