class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int total = 0;
        
        map.put(0,1);
        
        for(int i = 0; i <n; i++)
        {
            prefixSum += arr[i];
            
            if(map.containsKey(prefixSum - k))
            {
                total += map.get(prefixSum - k);
            }
            
            map.put(prefixSum,map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return total;    
        
    }
}
