class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int start = 0;
        int end = 0;
        int m = name.length();
        int n = typed.length();
        while(start < m && end < n)
        {
            if(name.charAt(start) == typed.charAt(end))
            {
                start++;
                end++;
            }
            else if(end > 0 && typed.charAt(end) == typed.charAt(end - 1))
            {
                end++;
            }
            else{
                return false;
            }
        }

        while(end < n)
        {
            if(typed.charAt(end) != typed.charAt(end - 1))
            {
                return false;
            }
            end++;
        }

        return true;
    }
}
