class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        HashSet<Integer> set = new HashSet<>();
        for(int num : friends)
        {
            set.add(num);
        }

        int[] result = new int[friends.length];
        int index = 0;

        for(int num : order)
        {
            if(set.contains(num))
            {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
}
