class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
        Map<Integer, Integer> map = new HashMap<>();

        // add item from first array
        for(int[] item : items1)
        {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }

        // add item from second array
        for(int[] item : items2)
        {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            ans.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        // sort the ans by key
        ans.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

    return ans;

    }
}
