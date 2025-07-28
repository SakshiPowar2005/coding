class Solution {
    public int diagonalSum(int[][] mat) {
        
        int ans = 0;

        int m = mat.length;
        
        for(int i = 0; i < m ; i++)
        {
            ans += mat[i][i];
            ans += mat[m - 1 - i][i];
        }

        if(m % 2 != 0)
        {
            ans -= mat[m / 2][m / 2];
        }

        return ans;
    }
}
