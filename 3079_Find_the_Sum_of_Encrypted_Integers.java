class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        
        int digit = 0;
        int sum = 0;
        
        for(int num : nums)
        {
            int max = 0;

            // if(num < 10)
            // {
            //     sum += num;
            // }

            int count = String.valueOf(num).length();
            while(num > 0)
            {
                // if(num % 10 != 0)
                // {
                    digit = num % 10;
                    max = Math.max(max, digit);
                    num = num / 10;
                // }

            }

            int result = 0;
            for(int j = 0; j < count; j++)
            {
                result = result * 10 + max;
            }

            sum += result;
        }

        return sum;
    }
}
