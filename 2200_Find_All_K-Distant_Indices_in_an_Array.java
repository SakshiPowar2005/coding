class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int x = 0;
            for(int j = 0; j < n; j++)
            {
                if(nums[j] == key)
                {
                    x = Math.abs(i - j);
                    if(x <= k)
                    {
                        list.add(i);
                        break;
                    }
                }
            }
        }

        //Collections.sort(list);

        return list;
    }
}
