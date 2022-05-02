class Solution {
    public boolean isPowerOfTwo(int n) {
       double res = new Double(String.format("%.10f",Math.log(n)/Math.log(2)));
       return res%1==0;
    }
}