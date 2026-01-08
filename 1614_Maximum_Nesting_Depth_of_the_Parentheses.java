class Solution {
    public int maxDepth(String s) {

        int maxDepth = 0;
        int depth = 0;
        int n = s.length();

        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }
            else if(ch == ')')
            {
                depth--;
            }

        }

        return maxDepth;
    }
}
