class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) return true;
        int last_idx = -1;
        int current_idx;
        for(int i = 0; i < s.length(); i++){
            current_idx = t.indexOf(s.charAt(i),last_idx+1);//assuming that not considering same char more than once
            if(current_idx != -1 && current_idx>last_idx){
                last_idx = current_idx;
            }
            else return false;
        }
        return true;
    }
}