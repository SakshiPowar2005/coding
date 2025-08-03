class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int[][] ans = new int[m + n][2];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n)
        {
            if(nums1[i][0] == nums2[j][0])
            {
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;

            }
            else if(nums1[i][0] < nums2[j][0])
            {
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1];
                i++;

            }
            else
            {
                ans[k][0] = nums2[j][0];
                ans[k][1] = nums2[j][1];
                j++;

            }

            k++;
        }

        // add remaining value from nums1 
        while(i < m)
        {
            ans[k][0] = nums1[i][0];
            ans[k][1] = nums1[i][1];
            i++;
            k++;

        }

        // add remaining value from nums2
        while(j < n)
        {
            ans[k][0] = nums2[j][0];
            ans[k][1] = nums2[j][1];
            j++;
            k++;

        }
        
        // copy  of filled rows to the final result
        int[][] result = new int[k][2];
        for(int a = 0; a < k; a++)
        {
            result[a][0] = ans[a][0];
            result[a][1] = ans[a][1];
        }

        return result;

    }
}
