class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
                ans.add(i);
            }
        }

        return ans;
        
    }
}
