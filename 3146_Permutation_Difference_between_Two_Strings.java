class Solution {
    public int findPermutationDifference(String s, String t) {
        
        int permutationdiff = 0;
        for(int i = 0; i < s.length(); i++)
        {
           permutationdiff += Math.abs(s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i)));
        }

        return permutationdiff;
    }
}
