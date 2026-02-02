class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i  = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int majority = nums[0];
        int maxValue = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > maxValue)
            {
                maxValue = entry.getValue();
                majority = entry.getKey(); 
            }     
        }

        return majority;
    }
}
