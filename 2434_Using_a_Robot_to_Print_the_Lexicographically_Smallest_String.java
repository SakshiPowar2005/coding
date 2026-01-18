class Solution {
    public String robotWithString(String s) {
        
        int n = s.length();
        char[] minCharToRight = new char[n];
        minCharToRight[n - 1] = s.charAt(n - 1);
        for(int i = n - 2; i >= 0; i--)
        {
            minCharToRight[i] = (char) Math.min(s.charAt(i), minCharToRight[i + 1]);
        }

        Deque<Character> st = new ArrayDeque<>();
        StringBuilder paper = new StringBuilder();
        
        int i = 0;
        while(i < n)
        {
            st.push(s.charAt(i));
            char minchar;
            if((i + 1) < n)
            {
                minchar = minCharToRight[i + 1];
            }
            else
            {
                minchar = s.charAt(i);
            }

            while(!st.isEmpty() && st.peek() <= minchar)
            {
                paper.append(st.pop());
            }
            i++;
        }

        while(!st.isEmpty())
        {
            paper.append(st.pop());
        }

        return paper.toString();
    }
}
