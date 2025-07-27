class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int n = names.length;
        Map<Integer,String> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++)
        {
            map.put(heights[i],names[i]);
        }
        
        Arrays.sort(heights);

        String[] sortedNames = new String[n];

        for(int i = n - 1 ; i >= 0 ; i--)
        {
            sortedNames[n - i - 1] = map.get(heights[i]);
        }

        return sortedNames;
    }
}
