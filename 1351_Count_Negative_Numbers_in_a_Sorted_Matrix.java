// class Solution {
//     public int countNegatives(int[][] grid) {
        
//         int cnt = 0;
//         for(int[] row : grid)
//         {
//             for(int value : row)
//             {
//                 if(value < 0)
//                 {
//                     cnt++;
//                 }
//             }
//         }

//         return cnt;
//     }
// }



//optimal approach
class Solution
{
    public int countNegatives(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int row = m - 1;
        int col = 0;
        int result = 0;

        while(row >= 0 && col < n)
        {
            if(grid[row][col] >= 0)
            {
                col++;
            }
            else
            {
                result += (n - col);
                row--;
            }
        }

        return result;
    }
}
