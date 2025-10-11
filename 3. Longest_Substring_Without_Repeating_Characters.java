class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int[] hash = new int[256];
        int l = 0, r = 0;
        int maxlen = 0;
        Arrays.fill(hash, -1);
        while(r < n)
        {
            if(hash[s.charAt(r)] != -1)
            {
                if(hash[s.charAt(r)] >= l)
                {
                    l = Math.max(l,hash[s.charAt(r)] + 1);
                }
            }

            hash[s.charAt(r)] = r;
           // r++;
            int len = r - l + 1;
            maxlen = Math.max(maxlen, len);

            r++;

        }

        return maxlen;
    }
}
