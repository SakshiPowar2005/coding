// class Solution {
//     public boolean isPalindrome(String s) {
        
//         s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
//         int i = 0;
//         int j = s.length() - 1;

//         while(i <= j)
//         {
//             if(s.charAt(i) != s.charAt(j))
//             {
//                 return false;
//             }

//             i++;
//             j--;
//         }

//         return true;
//     }
// }



// optimal solution

class Solution
{
    public boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
        }

        for(int i = 0, j = sb.length() - 1; i <= j; i++, j--)
        {
            if(sb.charAt(i) != sb.charAt(j))
            {
                return false;
            }
        }

        return true;
    }
}
