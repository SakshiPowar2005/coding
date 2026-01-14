class Solution {
    public String removeDuplicates(String s) {
        
        // using stack
        // Stack<Character> st = new Stack<>();
        // for(int i = 0; i < s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     if(st.isEmpty())
        //     {
        //         st.push(ch);
        //     }
        //     else
        //     {
        //         if(ch == st.peek())
        //         {
        //             st.pop();
        //         }
        //         else
        //         {
        //             st.push(ch);
        //         }
        //     }
        // }

        // StringBuilder sb = new StringBuilder();
        // for(char c : st)
        // {
        //     sb.append(c);
        // }
        // return sb.toString();



         // optimal solution
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            int len = sb.length();
            if(len > 0 && sb.charAt(len - 1) == ch)
            {
                sb.deleteCharAt(len - 1);
            }
            else
            {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
