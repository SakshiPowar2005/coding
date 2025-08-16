class Solution {
    String ReverseSort(String s) {
        
        char [] chars = s.toCharArray();
        Arrays.sort(chars);
        
        StringBuilder sb = new StringBuilder(new String(chars));
        
        sb.reverse();
        
        return sb.toString();
    }
}
