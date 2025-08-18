// class Solution {
//     public boolean isIsomorphic(String s, String t) {
        
//         Map<Character, Character> map = new HashMap<>();
        
//         if(s.length() != t.length())
//         {
//             return false;
//         }

//         for(int i = 0; i < s.length(); i++)
//         {
//             if(map.containsKey(s.charAt(i)))
//             {
//                 if(!map.get(s.charAt(i)).equals(t.charAt(i)))
//                 {
//                     return false;
//                 }
//             }

//             else
//             {
//                 if(map.containsValue(t.charAt(i)))
//                 {
//                     return false;
//                 }

//                 map.put(s.charAt(i), t.charAt(i));
//             }

//         }

//         return true;
//     }
// }



class Solution {

    public boolean isIsomorphic(String s, String t) {
        
        int[] indexS = new int[200]; // Stores index of characters in string s
        int[] indexT = new int[200]; // Stores index of characters in string t
        
        int len = s.length();
        
        if(len != t.length()) {
            return false;
        }
        
        for(int i = 0; i < len; i++) {
 
           if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {

                return false; 
            }
            
            indexS[s.charAt(i)] = i + 1; 
            indexT[t.charAt(i)] = i + 1; 
        }
        
        return true;
    }
}
