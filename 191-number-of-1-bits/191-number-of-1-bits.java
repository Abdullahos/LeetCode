import java.math.BigInteger;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int k = 0;
        String sn = Integer.toBinaryString(n);
        BigInteger num = new BigInteger(sn);
        String s = String.valueOf(num);
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '1')  k++;
        }
        return k;
    }
}