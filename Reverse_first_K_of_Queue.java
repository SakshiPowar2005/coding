class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        
        Stack<Integer> st = new Stack<>();
        
        if(k > q.size()) return q;
        for(int i = 0; i < k; i++)
        {
            st.push(q.poll());
        }
        
        while(!st.isEmpty())
        {
            q.offer(st.pop());
        }
        
        int size = q.size();
        for(int i = 0; i < size - k; i++)
        {
            q.offer(q.poll());
        }
        
        return q;
        
    }
}
