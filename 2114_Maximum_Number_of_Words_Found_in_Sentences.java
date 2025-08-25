class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxNum = 0;
        for(String s : sentences)
        {
            int words = s.split(" ").length;  
            maxNum = Math.max(maxNum, words);  
        }
    
         return maxNum;
    }
}
