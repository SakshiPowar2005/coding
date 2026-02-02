class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // int n = nums.length;
        // for(int i = 0; i < n; i++)
        // {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // for(Map.Entry<Integer, Integer> entry : map.entrySet())
        // {
        //     if(entry.getValue() > n / 3)
        //     {
        //         list.add(entry.getKey());
        //     }
        // }

        // return list;




        //optimal approach
        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;

        for(int num : nums)
        {
            if(num == cand1)
            {
                count1++;
            }
            else if(num == cand2)
            {
                count2++;
            }
            else if(count1 == 0)
            {
                cand1 = num;
                count1++;
            }
            else if(count2 == 0)
            {
                cand2 = num;
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        int coun1 = 0, coun2 = 0;
        for(int num : nums)
        {
            if(num == cand1)
            {
                coun1++;
            }
            else if(num == cand2)
            {
                coun2++;
            }
        }

        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        if(coun1 > n / 3) list.add(cand1);
        if(coun2 > n / 3) list.add(cand2);


       return list;

    }
}
