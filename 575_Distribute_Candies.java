class Solution {
    public int distributeCandies(int[] candyType) {
        
        HashSet<Integer> set = new HashSet<>();
        int n = candyType.length;
        int minCandy = 0;
        for(int i = 0; i < n; i++)
        {
            set.add(candyType[i]);
        }

        return minCandy = Math.min(set.size(), n / 2);
    }
}
