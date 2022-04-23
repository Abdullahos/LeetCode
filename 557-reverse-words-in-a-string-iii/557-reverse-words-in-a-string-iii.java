class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        String []tokens = s.split("(\\s)"); 
        for(int i = 0; i< tokens.length; i++) {  
            StringBuffer strbuff = new StringBuffer(tokens[i]);
            sb.append(strbuff.reverse());
            sb.append(" ");
        }
        return new String(sb).trim();
    }
}