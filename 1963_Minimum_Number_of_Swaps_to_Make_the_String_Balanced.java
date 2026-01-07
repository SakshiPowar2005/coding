class Solution {
    public int minSwaps(String s) {

        // Stack<Character> st = new Stack<>();
        // int n = s.length();
        // for(int i = 0; i < n; i++)
        // {
        //     char ch = s.charAt(i);
        //     if(ch == '[')
        //     {
        //         st.push(ch);
        //     }
        //     else if(!st.isEmpty())
        //     {
        //         st.pop();
        //     }
        // }

        // return (st.size() + 1) / 2;

       

       
    // without stack
    int stacksize = 0;
    for(int i = 0; i < s.length(); i++)
    {
        char ch = s.charAt(i);
        if(ch == '['){
            stacksize++;
        }
        else
        {
            if(stacksize > 0){
                stacksize--;
            }
        }
    }

    return (stacksize + 1) / 2;
        
    }
}
