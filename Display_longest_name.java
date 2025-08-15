
class Solution {
    public String longest(List<String> arr) {
        
        int max_len = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).length() > arr.get(max_len).length())
            {
                max_len = i;
            }
        }
        
        return arr.get(max_len);
    }
}
