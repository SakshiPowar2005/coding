class Complete {

    public static String Sandwiched_Vowel(String str) {
        
        char [] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < chars.length ; i++)
        {
            boolean inMiddle = (i > 0 && i < chars.length - 1);
            boolean isSandwichedVowel = 
            inMiddle && 
            isVowel(chars[i]) &&  // current is vowel
            !isVowel(chars[i - 1]) && // prev is consonant
            !isVowel(chars[i + 1]);  // next is consonant(not vowel)
            
            if(!isSandwichedVowel)
            {
                sb.append(chars[i]);
            }
            
        }
        
        return sb.toString();
    }
    
    private static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
