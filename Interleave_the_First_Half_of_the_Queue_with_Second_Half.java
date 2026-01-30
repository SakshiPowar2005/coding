class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        
        if(q.size() % 2 != 0)
        {
            return;
        }
        
        int half = q.size() / 2;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < half; i++)
        {
            st.push(q.poll());
        }
        
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
        
        for(int i = 0; i < half; i++)
        {
            q.add(q.poll());
        }
        
        for(int i = 0; i < half; i++)
        {
            st.push(q.poll());
        }
        
        while(!st.isEmpty())
        {
            q.add(st.pop());
            q.add(q.poll());
        }
    }
}
