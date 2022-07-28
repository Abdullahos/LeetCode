/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        
        HashMap<Character,Integer> freqs = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            freqs.put( c , freqs.getOrDefault(c,0)+1 );

        }
        //go throw t
        for(int i = 0 ; i<t.length(); i++){
            char c = t.charAt(i);
            if(freqs.containsKey(c)){
                if(freqs.get(c)==1) freqs.remove(c);
                else    freqs.put(c,freqs.get(c)-1);
            }
            else    return false;
        }
        //iterate over the freqs to make sure all freqs now are 0s
        if(freqs.size()!=0)   return false;
        return true;
    }
}
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s_freqs = new int[256];
        int[] t_freqs = new int[256];
        
        for(int i = 0 ; i < s.length(); i++){
            s_freqs[s.charAt(i)]++;    
        }
        for(int i = 0 ; i < t.length(); i++){
            t_freqs[t.charAt(i)]++;
        }
        for(int i = 0 ; i < s_freqs.length; i++){
            if(s_freqs[i] != t_freqs[i])    return false;
        }
        return true;
    }
}