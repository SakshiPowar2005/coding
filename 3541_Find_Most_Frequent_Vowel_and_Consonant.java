class Solution {
    public int maxFreqSum(String s) {
        
        int[] isContain = new int[128];
        int maxVowel = 0;
        int maxConsonant = 0;
        int count1 = 0;
        int count2 = 0;
        int maxSum = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                isContain[ch]++;
                count1 = isContain[ch];
                maxVowel = Math.max(maxVowel, count1);
            }

            else if(ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u')
            {
                isContain[ch]++;
                count2 = isContain[ch];
                maxConsonant = Math.max(maxConsonant, count2);
            }

            maxSum = maxVowel + maxConsonant;
        }

        return maxSum;
    }
}
