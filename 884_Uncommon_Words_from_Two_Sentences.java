class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();
        String [] arr1 = s1.split(" ");
        for(String word : arr1)
        {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String [] arr2 = s2.split(" ");
        for(String word : arr2)
        {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        for(String key : map.keySet())
        {
            if(map.get(key) == 1)
            {
                list.add(key);
            }
        }

        return list.toArray(new String[0]);
    }
}
