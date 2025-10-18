class Solution {
    public boolean isBalanced(String num) {
        
        int evenIndices = 0;
        int oddIndices = 0;
        for(int i  = 0; i < num.length(); i++)
        {
            if(i % 2 == 0)
            {
                evenIndices += num.charAt(i) - '0';
            }
            else
            {
                oddIndices += num.charAt(i) - '0';
            }
        }

        return oddIndices == evenIndices;
    }
}
