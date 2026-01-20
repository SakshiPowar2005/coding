class Solution {
    public int firstUniqChar(String s){

        // int[] freq = new int[26]; 
        // Queue<Integer> queue = new ArrayDeque<>();

        // for(int i = 0; i < s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     freq[ch - 'a']++;
        //     queue.offer(i);
        // }

        // while(!queue.isEmpty())
        // {
        //     int index = queue.peek();
        //     if(freq[s.charAt(index) - 'a'] == 1)
        //     {
        //         return index;
        //     }

        //     queue.poll();
        // }

        // return -1;

        
  
        //optimal approach
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(freq[s.charAt(i) - 'a'] == 1)
            {
                return i;
            }
        }

        return -1;
    }
  
}
