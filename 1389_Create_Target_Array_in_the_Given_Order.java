class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int n = index.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i < n;i++)
        {
            list.add(index[i],nums[i]);
        }

        int[] target = new int[n];

        for(int i = 0;i < list.size();i++)
        {
            target[i] = list.get(i);
        }

        return target;
    }
}
