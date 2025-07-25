class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] ans = s.split(" ");

       StringBuilder str = new StringBuilder();

       for(int i = 0;i < k;i++)
       {
        str.append(ans[i]);
        if(i != k - 1)
        {
            str.append(" ");
        }
       }

        return str.toString();
    }
}
