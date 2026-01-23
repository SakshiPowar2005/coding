class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        
        List<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        
        while(index < k)
        {
            if(arr[index] < 0)
            {
                deque.offer(arr[index]);
            }
            
            index++;
        }
        
        if(deque.isEmpty())
        {
            list.add(0);
        }
        else
        {
            list.add(deque.peek());
        }
        
        for(int i = 1; i < arr.length - k + 1; i++)
        {
            if(arr[i - 1] < 0)
            {
                deque.poll();
            }
            
            if(arr[i + k - 1] < 0)
            {
                deque.offer(arr[i + k - 1]);
            }
            
            if(deque.isEmpty())
            {
                list.add(0);
            }
            else{
                list.add(deque.peek());
            }
        }
        
        return list;
    }
}
