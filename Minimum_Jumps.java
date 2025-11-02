class Solution {
    public int minJumps(int[] arr) {
        
        int n = arr.length;
        int totalJumps = 0;
        int farthest = 0;
        int destination = arr.length - 1;
        int jumpIndex = 0;
        
        if(arr.length == 1) return 0;
        if(arr[0] == 0) return -1;
        
        for(int i = 0; i < n - 1; i++)
        {
            if(i > farthest) return -1;
            
            farthest = Math.max(farthest, i + arr[i]);
            
            if(i == jumpIndex)
            {
                if(i == farthest) return -1;
                totalJumps++;
                jumpIndex = farthest;
                
                if(farthest >= destination)
                {
                    return totalJumps;
                }
            }
        }
        
        return totalJumps;
        
    }
}
