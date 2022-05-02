class Solution {
    public boolean isPowerOfTwo(int n) {
       double res = new Double(String.format("%.10f",Math.log(n)/Math.log(2)));
    System.out.println(res);
       return res%1==0;
    }
}