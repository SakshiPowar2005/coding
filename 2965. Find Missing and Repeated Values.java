class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

     int miss = -1,repeat = -1;
     int n = grid.length;

     Map<Integer,Integer> map = new HashMap<>();
     for(int[] row : grid)
     {
        for(int num : row)
        {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
     }   

     for(int num = 1;num <= n * n;num++)
     {
        if(!map.containsKey(num))
        {
            miss = num;
        }
        else if(map.get(num) == 2)
        {
            repeat = num;
        }
     }

     return new int[] {repeat,miss};
    }
}
