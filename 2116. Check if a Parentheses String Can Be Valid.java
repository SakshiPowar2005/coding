class Solution {
    public boolean canBeValid(String s, String locked) {

        int balance = 0;
        int n = s.length();
        
        if(n % 2 != 0) return false;

        // left to right
        for(int i = 0; i < n; i++)
        {
            if(locked.charAt(i) == '1')
            {
                if(s.charAt(i) == '(') balance++;
                else
                {
                    balance--;
                }
            }
            else
            {
                balance++;
            }

            if(balance < 0) return false;
        }

        // right to left
        int balan = 0;
        for(int i = n - 1; i >= 0; i--)
        {
            if(locked.charAt(i) == '1')
            {
                if(s.charAt(i) == ')')
                {
                    balan++;
                }
                else
                {
                    balan--;
                }
            }
            else
            {
                balan++;
            }

            if(balan < 0) return false;
        }

        return true;
    }
}
