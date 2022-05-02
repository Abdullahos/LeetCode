public class Solution {
    public int hammingWeight(int n) {
        int k = 0;
        String sn = Integer.toBinaryString(n);
        for(int i = 0 ; i < sn.length(); i++){
            if(sn.charAt(i) == '1')  k++;
        }
        return k;
    }
}