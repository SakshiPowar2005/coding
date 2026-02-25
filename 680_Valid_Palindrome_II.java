class Solution {
    public boolean validPalindrome(String s) {
        
        int start = 0;
        int end = s.length() - 1;
        while(start < end)
        {
            char ch = s.charAt(start);
            char ch1 = s.charAt(end);

            if(ch != ch1)
            {
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }

            start++;
            end--;
        }

        return true;
    }

    public boolean isPalindrome(String s, int start, int end)
    {
        while(start < end)
        {
            char ch = s.charAt(start);
            char ch1 = s.charAt(end);

            if(ch != ch1)
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
