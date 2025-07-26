class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] res = new char[s.length()];
        int n = indices.length;
        for(int i = 0; i < n ;i++)
        {
            res[indices[i]] = s.charAt(i);
        }

        return  new String(res);
    }
}
