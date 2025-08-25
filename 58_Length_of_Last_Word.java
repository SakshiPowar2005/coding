// class Solution {
//     public int lengthOfLastWord(String s) {
        
//         s = s.trim();

//         String[] arr = s.split(" ");
       
//         return arr[arr.length - 1].length();
//     }
// }



// optimal code
class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim(); 

        int lastSpaceIndex = s.lastIndexOf(" ");

        String lastWord = s.substring(lastSpaceIndex + 1);

        return lastWord.length();
    }
}
