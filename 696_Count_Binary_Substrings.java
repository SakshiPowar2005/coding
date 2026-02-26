class Solution {
    public int countBinarySubstrings(String s) {
        
        int count = 0;
        int prevCount = 0;
        int currCount = 1; // first char itself form group of size 1
        for(int i = 1; i < s.length(); i++)
        {
            //same character
            if(s.charAt(i) == s.charAt(i - 1))
            {
                currCount++;
            }
            //diff character
            else
            {
                count += Math.min(prevCount, currCount);
                prevCount = currCount;
                currCount = 1; //new character itself starts a new group
            }
        }

        return count += Math.min(prevCount, currCount);
    }
}
