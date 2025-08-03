// class Solution {
//     public int heightChecker(int[] heights) {
        
//         int n = heights.length;
//         int[] expected = new int[n];
//         for(int i = 0;i < n ; i++)
//         {
//             expected[i] = heights[i];
//         }

//         Arrays.sort(expected);

//         int cnt = 0;
//         for(int i = 0; i < n; i++)
//         {
//             if(heights[i] != expected[i])
//             {
//                 cnt++;
//             }
//         }

//         return cnt;
//     }
// }

class Solution
{
    public int heightChecker(int[] heights)
    {
        // creates a shallow copy of the heights array
        int[] expected = heights.clone(); // or use heights.copyOf(heights, heights.length)
        
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0 ; i < expected.length ; i++)
        {
            if(heights[i] != expected[i])
            {
                count++;
            }

        }

        return count;

    }
}
