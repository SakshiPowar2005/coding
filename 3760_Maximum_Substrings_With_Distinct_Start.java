class Solution {
    public int maxDistinct(String s) {

        // HashSet<Character> set = new HashSet<>();
        // for(int i = 0; i < s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     set.add(ch);
        // }

        // return set.size();


        //optimal appraoch
        boolean[] freq = new boolean[26];
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            freq[ch - 'a'] = true;
        }

        int lenCount = 0;
        for(int j = 0; j < 26; j++)
        {
            if(freq[j])
            {
                lenCount++;
            }
        }

        return lenCount;
            
    }
}
