class Solution {

    public boolean isPalindrome(String word)
    {
           int first = 0;
            int last = word.length() - 1;

            while(first <= last)
            {
                if(word.charAt(first) != word.charAt(last))
                {
                    return false;
                }

                first++;
                last--;
            }

            return true;
    }

    public String firstPalindrome(String[] words) {

        for(String word : words)
        {
            if(isPalindrome(word))
            {
                return word;
            }
        }

        return "";

    }
}
