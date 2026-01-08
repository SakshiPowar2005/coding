class Solution {
    public int minAddToMakeValid(String s) {
        
        // Stack<Character> st = new Stack<>();
        // int n = s.length();
        // for(int i = 0; i < n; i++)
        // {
        //     char ch = s.charAt(i);
        //     if(ch == '(')
        //     {
        //         st.push(ch);
        //     }
        //     else{
        //         if(!st.isEmpty() && st.peek() == '(')
        //         {
        //             st.pop();
        //         }
        //         else{
        //             st.push(ch);
        //         }
        //     }
        // }

        // return st.size();



        //without stack(optimal)
        int open = 0;
        int add = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                open++;
            }
            else{
                if(open > 0)
                {
                    open--;
                }
                else
                {
                    add++;
                }
            }
        }

        return open + add;
    }
}
