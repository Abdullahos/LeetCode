class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final int size = 26;
        //the following solution may fails for duplication letters in s2
        /*if(s2.length()<s1.length())   return false;
        int i = 0 ;
        int minIdx = s2.length()-1;
        int maxIdx = 0;
        while(i<s1.length()) {
            int idx = s2.indexOf(s1.charAt(i));
            if(idx == -1)   return false;
            if(idx<minIdx)  minIdx = idx;
            if(idx>maxIdx)  maxIdx = idx;
            i++;
        }  
        System.out.println(minIdx+" "+maxIdx);
        return (maxIdx-minIdx+1)==s1.length()? true:false;
    */
        if(s2.length()<s1.length())   return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        int[] freqs_1 = new int[size];
        
        for(char cc1: c1){
            freqs_1[cc1-'a']++;
        }
        
        for(int i = 0 ; i<s2.length()-s1.length()+1; i++){
            int [] freqs_2 = new int[size];
            for(int j = 0; j<s1.length(); j++){
                freqs_2[s2.charAt(i+j)-'a']++;
            }
            boolean ever = true;
            for(int j = 0; j<size; j++){
                if(freqs_1[j]!=freqs_2[j])  {
                    ever = false;
                    break;
                }
            }
            if(ever)    return true;
        }
        return false;
    }
}
//time complexity O(N1*N2)
//space complexity O(1)