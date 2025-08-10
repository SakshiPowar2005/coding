//greedy approach

class Solution {
    static List<Integer> minPartition(int N) {
        
        int[] currency = {2000,500,200,100,50,20,10,5,2,1};
        
        int notes = 0, i = 0;
        List<Integer> ans = new ArrayList<>();
        
        while(N > 0)
        {
            notes = N / currency[i];
            while(notes > 0)
            {
                ans.add(currency[i]);
                notes--;
            }
            
            N %= currency[i];
            i++;
        }
        
        return ans;
        
    }
}
