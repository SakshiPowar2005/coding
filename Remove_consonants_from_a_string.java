// User function Template for Java

class Solution {
    public String removeConsonants(String s) {
        // code here.
        
        char [] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < chars.length; i++)
        {
            if(isVowel(chars[i]))
            {
                sb.append(chars[i]);
            }
            
        }
        
        if(sb.length() == 0)
        {
            return "No Vowel";
        }
        
        return sb.toString();
    }
    
    private static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
