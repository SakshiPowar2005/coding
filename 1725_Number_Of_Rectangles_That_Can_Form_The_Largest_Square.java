class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        
        int n = rectangles.length;
        int[] k = new int[n];
        for(int i = 0;i < n;i++)
        {
            k[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }

        int max = 0;
        for(int i = 0;i < n;i++)
        {
            if(k[i] > max)
            {
                max = k[i];
            }
        }

        int cnt = 0;
        for(int j = 0;j < n;j++)
        {
            if(k[j] == max)
            {
                cnt++;
            }
        }

        return cnt;

    }
}
