class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int[][] maxNum = new int[grid.length - 2][grid[0].length - 2];
        for(int row = 0; row < grid.length - 2; row++)
        {
            for(int col = 0; col < grid[0].length - 2; col++)
            {
                maxNum[row][col] = findLocalMax(grid, row, col);
            }
        }

        return maxNum;
    }

    public int findLocalMax(int[][] grid, int row, int col)
    {
        int maxValue = 0;
        for(int x = row; x <= row + 2; x++)
        {
            for(int y = col; y <= col + 2; y++)
            {
                maxValue = Math.max(maxValue, grid[x][y]);
            }
        }

        return maxValue;
    }
}
