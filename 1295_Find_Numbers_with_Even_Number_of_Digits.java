class Solution {
    public int findNumbers(int[] nums) {
        
        //int digit = 0;
        int index = 0;
        for(int num : nums)
        {
            int cnt = 0;
            if(num < 10)
            {
                continue;
            }
            else if(num >= 10)
            {
                while(num > 0)
                {
                   //digit = num % 10;
                   cnt++;
                   num = num / 10;
                }
            }
            
            if(cnt % 2 == 0)
            {
                index++;
            }
        } 

        return index;
    }
}
