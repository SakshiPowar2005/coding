class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        int[] count = new int[26];

        if(m != n)
        {
            return false;
        }

        for(int i = 0; i < n; i++)
        {
            count[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < m; i++)
        {
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++)
        {
            if(count[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}
