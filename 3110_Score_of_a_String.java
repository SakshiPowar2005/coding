class Solution {
    public int scoreOfString(String s) {
        
        int diff = 0;
        int[] count = new int[101];

            for(int i = 1; i < s.length(); i++)
            {
                int temp1 = s.charAt(i) - 'a';
                int temp2 = s.charAt(i - 1) - 'a'; 
                
                diff += Math.abs(temp1 - temp2);
            }

        return diff;
    }
}
