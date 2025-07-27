class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

     Set<Integer> set1 = new HashSet<>();
     Set<Integer> set2 = new HashSet<>();
     int cnt1 = 0;
     int cnt2 = 0;

     for(int nums : nums1)
     {
        set1.add(nums);
     }   

     for(int nums : nums2)
     {
        set2.add(nums);
     }

     for(int nums : nums1)
     {
        if(set2.contains(nums))
        {
            cnt1++;
        }
     }

     for(int nums : nums2)
     {
        if(set1.contains(nums))
        {
            cnt2++;
        }
     }

        return new int[] {cnt1,cnt2};
    }
}
