class Solution {
    public String firstNonRepeating(String s) {
        
        Deque<Character> deque = new ArrayDeque<>();
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            freq[ch - 'a']++;
            deque.offer(ch);
            
            while(!deque.isEmpty() && freq[deque.peekFirst() - 'a'] > 1)
            {
                deque.pollFirst();
            }
            
            if(deque.isEmpty())
            {
                sb.append("#");
            }
            else
            {
                sb.append(deque.peekFirst());
            }
        }
        
        return sb.toString();
    }
}
