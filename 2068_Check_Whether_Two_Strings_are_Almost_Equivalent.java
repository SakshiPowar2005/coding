class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        int len = word1.length();
        int[] freq = new int[26];

        for(int i = 0; i < len; i++)
        {
            freq[word1.charAt(i) - 'a']++;
            freq[word2.charAt(i) - 'a']--;
        }

        int max = 0;
        for(int i = 0; i < 26; i++)
        {
            max = Math.max(max, Math.abs(freq[i]));
        }

        if(max > 3)
        {
            return false;

        }

        return true;
    }
}
