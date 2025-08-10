class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        
        // int n = arr.length;
        // //int sum = 0;
        // int cnt = 0;
        // for(int i = 0; i < n;i++)
        // {
        //     int sum = 0;
        //     for(int j = i; j < n;j++)
        //     {
        //         sum += arr[j];
                
        //         if(sum == 0) cnt++;
        //     }
        // }
        
        // return cnt;
        
        int n = arr.length;
        int total = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        
        map.put(0, 1);
        
        for(int i = 0; i < n ;i++)
        {
            prefixSum += arr[i];
            
            if(map.containsKey(prefixSum))
            {
                total += map.get(prefixSum);
                map.put(prefixSum, map.get(prefixSum) + 1);
            }
            
            else
            {
                map.put(prefixSum, 1);
            }
        }
        
        return total;
        
    }
}
