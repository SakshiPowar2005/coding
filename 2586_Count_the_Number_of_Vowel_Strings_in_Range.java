class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        
        int count = 0;
        for(int i = left; i <= right; i++)
        {
            String word = words[i];
            char firstEle = word.charAt(0);
            char lastEle = word.charAt(word.length() - 1);

            if((firstEle == 'a' || firstEle == 'e' || firstEle == 'i' || firstEle == 'o' || firstEle == 'u') && (lastEle == 'a' || lastEle == 'e' || lastEle == 'i' || lastEle == 'o' || lastEle == 'u'))
            {
                count++;
            }
            
        }

        return count;
    }
}
