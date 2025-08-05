class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] res = new Integer[nums.length];
        for(int i = 0;i < nums.length; i++)
        {
            res[i] = nums[i]; // to apply custom sorting using a comparator
        }

        // Lambda Function for Sorting by Increasing Frequency
        Arrays.sort(res, (a, b) -> {
            if(freq.get(a).equals(freq.get(b)))
            {
                return Integer.compare(b, a);  // (b - a)
            }
            return Integer.compare(freq.get(a), freq.get(b)); // freq(a) - freq(b)
        });

        for(int i = 0;i < nums.length; i++)
        {
            nums[i] = res[i];
        }

        return nums;
    }
}
