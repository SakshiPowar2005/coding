class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> seen = new HashSet<>();
        while(n != 1)
        {
            if(seen.contains(n))
            {
                return false;
            }

            seen.add(n);

            int square = 0;
            while(n > 0)
            {
                int digit = n % 10;
                square += digit * digit;
                n = n / 10;
            }

            n = square;

        }

        return true;
    }
}
