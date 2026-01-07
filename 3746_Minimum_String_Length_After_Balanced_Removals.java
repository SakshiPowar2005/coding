class Solution {
    public int minLengthAfterRemovals(String s) {
        
    //   Stack<Character> st = new Stack<>();
    //   for(int i = 0; i < s.length(); i++)
    //   {
    //     char ch = s.charAt(i);
    //     if(!st.isEmpty() && ((ch == 'b' && st.peek() == 'a') || (ch == 'a' && st.peek() == 'b')))
    //     {
    //         st.pop();
    //     }
    //     else
    //     {
    //         st.push(ch);
    //     }
    //   } 

    //   return st.size();

    

    
    // optimal code
    int count_a = 0;
    int count_b = 0;
    int n = s.length();

    for(int i = 0; i < n; i++)
    {
        char ch = s.charAt(i);
        if(ch == 'a') count_a++;
        else count_b++;
    }

    int minimum = Math.min(count_a, count_b);

    return n - 2 * minimum;

    }
}
