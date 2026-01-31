class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        int n = deck.length;
        int[] result = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();
       
        for(int i = 0; i < n; i++)
        {
            dq.offer(i);
        }
           
          Arrays.sort(deck);

        for(int i = 0; i < n; i++)
        {
            int pos = dq.pollFirst();
            result[pos] = deck[i];

            if(!dq.isEmpty())
            {
                dq.offerLast(dq.pollFirst());
            }
        }

        return result;
    }
}
