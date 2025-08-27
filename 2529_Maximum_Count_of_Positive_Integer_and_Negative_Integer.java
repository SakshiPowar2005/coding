class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Find first index >= 0 (all before it are negative)
        int l = 0, h = n;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] < 0) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        int negCount = l; // number of negatives

        // Find first index > 0 (all after it are positive)
        l = 0; h = n;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] <= 0) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        int posCount = n - l; // number of positives

        return Math.max(negCount, posCount);
    }
}
