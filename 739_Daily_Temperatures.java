class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Deque<Integer> st = new ArrayDeque<>();
        int n = temperatures.length;
        int[] hotterDay = new int[n];

        for(int index = n - 1; index >= 0; index--)
        {
            while(!st.isEmpty() && temperatures[index] >= temperatures[st.peek()])
            {
                st.pop();
            }

            if(st.isEmpty())
            {
                hotterDay[index] =  0;
            }
            else{
                hotterDay[index] = st.peek() - index;
            }

            st.push(index);
        }

        return hotterDay;
        
    }
}
