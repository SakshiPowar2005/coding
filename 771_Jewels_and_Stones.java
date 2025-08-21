// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
        
//         Set<Character> set = new HashSet<>();

//         int cnt = 0;
//         for(char ch : jewels.toCharArray())
//         {
//             set.add(ch);
//         }

//         for(int i = 0; i < stones.length(); i++)
//         {
//             if(set.contains(stones.charAt(i)))
//             {
//                 cnt++;
//             }
//         }

//         return cnt;
//     }
// }


class Solution
{
public int numJewelsInStones(String jewels, String stones)
{
    boolean[] isContain = new boolean[128];

    for(char ch : jewels.toCharArray())
    {
        isContain[ch] = true;
    }

    int count = 0;
    for(char ch : stones.toCharArray())
    {
        if(isContain[ch])
        {
            count++;
        }
    }

    return count;
}
}
