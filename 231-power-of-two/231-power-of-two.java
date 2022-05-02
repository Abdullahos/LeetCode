class Solution {
    public boolean isPowerOfTwo(int n) 
      {
        long sum = 1; 
        while( sum < n)
        {
            sum = sum * 2;
        }
        if( sum == n )
        {
            return true;
        }
        return false;
    }
    
}