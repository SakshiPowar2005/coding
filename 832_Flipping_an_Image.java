// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
        
//         int m = image.length; //rows length
//         int n = image[0].length; //columns length
//         //int[][] ans = new int[m][n];

//         for(int i = 0;i < m;i++)
//         {
//             for(int j = 0;j < n / 2;j++)
//             {
//                 int  temp = image[i][j];
//                 image[i][j] = image[i][n-1-j];
//                 image[i][n-1-j] = temp;
//             }
//         }

//         for(int i = 0 ;i < m ;i++)
//         {
//             for(int j = 0;j < n;j++)
//             {
//                 if(image[i][j] == 1)
//                 {
//                     image[i][j] = 0;
//                 }
//                 else
//                 {
//                     image[i][j] = 1;
//                 }
//             }
//         }

//         return image;
//     }
// }


class Solution
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int c = image[0].length;

        for(int[] row : image)
        {
            for(int i = 0;i < (c + 1) / 2;i++)
            {
                int temp = row[i] ^ 1;
                row[i] = row[c - 1 - i] ^ 1;
                row[c - 1 - i] = temp;
            }
        }

        return image;

    }
}
