class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int n = points.length;
        int sub = 0;

        for(int i = 1;i < n;i++)
        {
                sub = Math.max(sub,points[i][0] - points[i - 1][0]);
        }
        return sub;
    }
}
