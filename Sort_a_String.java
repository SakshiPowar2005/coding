
class Solution {
    String sort(String s) {
        
        char [] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(chars);
        
        for(int i = 0; i < chars.length; i++)
        {
            sb.append(chars[i]);
        }
        
        return sb.toString(); 
    }
}
