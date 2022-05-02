public class Solution {
    /*
    public int hammingWeight(int n) {
        int k = 0;
        String sn = Integer.toBinaryString(n);
        for(int i = 0 ; i < sn.length(); i++){
            if(sn.charAt(i) == '1')  k++;
        }
        return k;
    }
    */
    public int hammingWeight(int n) {
        int k = 0;
        int mask = 1;
        
        for(int i = 0; i<32; i++){
            if((n & mask) != 0)   k++;
            mask <<= 1;
        }
        return k;
    }

}