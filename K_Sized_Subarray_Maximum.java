class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            if(!deque.isEmpty() && deque.peekFirst() <= i - k) deque.pollFirst();
            
            while(!deque.isEmpty() && arr[deque.peekLast()] <= arr[i])
            {
                deque.pollLast();
            }
            
            deque.offer(i);
            
            if(i >= k - 1)
            {
                list.add(arr[deque.peekFirst()]);
            }
        }
        
        return list;
    }
}
