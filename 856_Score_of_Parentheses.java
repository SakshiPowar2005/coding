class Solution {
    public int scoreOfParentheses(String s) {
        
        int result = 0;
        int layer = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                layer++;
            }
            else
            {
                if(s.charAt(i - 1) == '(')
                {
                    result += (int) Math.pow(2, layer - 1);
                }

                layer--;
            }
        }

        return result;
    }
}
