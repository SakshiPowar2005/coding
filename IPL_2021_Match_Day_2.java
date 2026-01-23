class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++)
        {
            if(!deque.isEmpty() && deque.peekFirst() <= i - k)
            {
                deque.pollFirst();
            }
            
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
