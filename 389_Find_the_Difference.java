// class Solution {
//     public char findTheDifference(String s, String t) {
        
//         int total = 0;
//         for(int i = 0; i < t.length(); i++)
//         {
//             total += t.charAt(i);
//         }

//         for(int i = 0; i < s.length(); i++)
//         {
//             total = total - s.charAt(i);
//         }

//         return (char) total;
//     }
// }



// optimal solution
class Solution
{
    public char findTheDifference(String s, String t)
    {
        int XOR = 0;

        for(char ch : s.toCharArray())
        {
            XOR ^= ch;
        }

        for(char ch : t.toCharArray())
        {
            XOR ^= ch;
        }

        return (char) XOR;
    }
}
