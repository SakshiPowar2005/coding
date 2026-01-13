class Solution {
    public int minOperations(String[] logs) {
    
    // using stack brute force approach
    // Stack<String> st = new Stack<>();
    // for(int i = 0; i < logs.length; i++)
    // {
    //     String ch = logs[i];
    //     if(ch.equals("../"))
    //     {
    //         if(!st.isEmpty())
    //         {
    //             st.pop();
    //         }
    //     }
    //     else if(ch.equals("./")) continue;
    //     else
    //     {
    //         st.push(logs[i]);
    //     }
    // }

    // return st.size();



       // optimal approach
       int depth = 0;
       for(int i = 0; i < logs.length; i++)
       {
           String ch = logs[i];
           if(ch.equals("../"))
           {
            if(depth > 0) {
                depth--;
            }
            else
            {
                continue;
            }
           }
           else if(ch.equals("./")) continue;
           else
           {
            depth++;
           }
       } 

       return depth;
    }
}
