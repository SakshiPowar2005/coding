class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int prev = -n; 
        int[] res = new int[n];
        // left to right
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == c)
            {
                prev = i;
            }
            res[i] = i - prev;
        }

        int previous = 2 * n; 
        // right to left
        for(int i = n - 1; i >=  0; i--)
        {
            if(s.charAt(i) == c)
            {
                previous = i;
            }

            res[i] = Math.min(res[i], previous - i);
        }

        return res;
    }
}
