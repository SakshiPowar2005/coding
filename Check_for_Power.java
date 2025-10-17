class Solution {
    public boolean isPowerOfAnother(int X, int Y) {
        
        if(X <= 1) return false;
        while(Y != 1)
        {
            if(Y % X != 0)
            {
                return false;
            }
            
            Y = Y / X;
        }
        
        return true;
        
    }
}
