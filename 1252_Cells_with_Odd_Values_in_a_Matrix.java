class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                mat[i][j] = 0;
            }
        }

        for(int i = 0; i < indices.length; i++)
        {
            int r = indices[i][0];
            int c = indices[i][1];

            for(int j = 0; j < n; j++)
            {
                mat[r][j]++;
            }

            for(int j = 0; j < m; j++)
            {
                mat[j][c]++;
            }
        }

        int cnt = 0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(mat[i][j] % 2 != 0)
                {
                    cnt++;
                }
            }
        }

        return cnt;

    }
}


// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {
        
//         int[][] ans = new int[m][n];

//         for (int i = 0; i < indices.length; i++) {
//             int r = indices[i][0]; // row index
//             int c = indices[i][1]; // column index

//             // increment all columns in row r
//             for (int j = 0; j < n; j++) {
//                 ans[r][j]++;
//             }

//             // increment all rows in column c
//             for (int j = 0; j < m; j++) {
//                 ans[j][c]++;
//             }
//         }

//         int cnt = 0;
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (ans[i][j] % 2 != 0) {
//                     cnt++;
//                 }
//             }
//         }

//         return cnt;
//     }
// }
