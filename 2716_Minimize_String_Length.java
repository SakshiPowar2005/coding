class Solution {
    public int minimizedStringLength(String s) {
        boolean[] isSeen = new boolean[26];
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(!isSeen[ch - 'a'])
            {
                isSeen[ch - 'a'] = true;
                count++;
            }
        }

        return count;
    }
}
