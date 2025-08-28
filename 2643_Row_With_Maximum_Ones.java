class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int maxOnes = -1;
        int rowIndex = 0;
        for(int i = 0; i < mat.length; i++)
        {
            int count = 0;
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                {
                    count++;
                }

                if(count > maxOnes)
                {
                    maxOnes = count;
                    rowIndex = i;
                }

            }
        }

        return new int[]{rowIndex, maxOnes};
    }
}
