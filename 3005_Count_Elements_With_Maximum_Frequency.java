class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxfreq = 0;
        for(int freq : map.values())
        {
            maxfreq = Math.max(maxfreq, freq);
        }

        int freqOfMaxFreq = 0;
        for(int freq : map.values())
        {
            if(freq == maxfreq)
            {
                freqOfMaxFreq++;
            }
        }

        return freqOfMaxFreq * maxfreq;
    }
}
