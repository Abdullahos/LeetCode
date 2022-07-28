/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t))  return true;
        List s1 = new ArrayList<Character>();
        List s2 = new ArrayList<Character>();
        
        for(int i =0 ; i<s.length(); i++){
            int index = s1.indexOf(s.charAt(i));
            //s1 list contains i th character of s
            if(index!=-1){
                //different mmaping s1->s2
                if(!s2.get(index).equals(t.charAt(i)))  return false;
            }
            //if s1 doesn't contain char at i, but s2 already has the corresponding value, return false
            else if(s2.contains(t.charAt(i)))   return false;
            else    {
                s1.add(s.charAt(i));
                s2.add(t.charAt(i));
            }
        }
        return true;
    }
    //time complexity
    //space complexity
    
}
*/
class Solution {   
     public boolean isIsomorphic(String s, String t) {
         if(s.equals(t))    return true;
         List s1 = new ArrayList<Character>();
         List s2 = new ArrayList<Character>();
         for(int i = 0 ; i < s.length(); i++){
                 if(!s1.contains(s.charAt(i)) && !s2.contains(t.charAt(i))){
                     s1.add(s.charAt(i));
                     s2.add(t.charAt(i));
                 }
                 else if(s1.contains(s.charAt(i))){
                     int index = s1.indexOf(s.charAt(i));
                     if(!s2.get(index).equals(t.charAt(i))) return false;
                 }
                 else return false; //s2 contains but s1 not
            
        }
         return true;
    }
}