class Solution {
    public int[] findSum(int n) {
        
        int[] sum = new int[2];
        int evenSum = 0, oddSum = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                oddSum += i;
            }
            else
            {
                evenSum += i;
            }
        }
        
        return new int[]{oddSum, evenSum};
        
    }
}
