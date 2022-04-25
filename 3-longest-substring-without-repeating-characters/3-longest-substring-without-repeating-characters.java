//assume case sensitive
//assume all is character
class Solution {
    
    public int lengthOfLongestSubstring(String s) {
       
        if(s.length()<=1)   return s.length();
        
        List list = new ArrayList<Character>();
        int max_size = 0;
        for(int i = 0; i<s.length(); i++){
            int j = i;
            int size = 0; 
            while(j<s.length() && !list.contains(s.charAt(j))){
                size++;
                list.add(s.charAt(j));
                j++;
            }
            list = new ArrayList<Character>();
            if(size > max_size) max_size = size;
        }
        return max_size;
    
        /*
        if(s.length()<=1)   return s.length();
        Map m = new HashMap<Character, Integer>();
        int max_size = 0;
        int i = 0;
        while(i<s.length()){
            int j = i;
            int size = 0; 
            while(j<s.length() && !m.containsKey(s.charAt(j))){
                size++;
                m.put(s.charAt(j),j);
                j++;
            }
            if(size > max_size) max_size = size;
            if(j>=s.length())   return max_size;
            int new_i = (int)m.get(s.charAt(j));
            i = new_i+1;
            m = new HashMap<Character, Integer>();
        }
        return max_size;
        */
    }
    
}