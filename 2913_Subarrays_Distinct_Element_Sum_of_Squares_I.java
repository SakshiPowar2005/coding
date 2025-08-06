class Solution {
    public int sumCounts(List<Integer> list) {
        
        int n = list.size();
        int result = 0;
        int[] freq = new int[101];

        for(int i = 0;i < n; i++)
        {
            int distinct = 0;
            Arrays.fill(freq, 0);

            for(int j = i; j < n; j++)
            {
                int num = list.get(j);

                if(freq[num] == 0)
                {
                    distinct++;

                }

            freq[num]++;
            result += distinct * distinct;
            }
        }

        return result;

    }
}
