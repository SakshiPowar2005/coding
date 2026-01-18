class Solution {
    public String smallestSubsequence(String s) {
        
        int[] lastindex = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            lastindex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            int index = ch - 'a';
            if(seen[index]) continue;
            while(!st.isEmpty() && st.peek() > ch && i < lastindex[st.peek() - 'a'])
            {
                seen[st.pop() - 'a'] = false;
            }

            st.push(ch);
            seen[index] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
