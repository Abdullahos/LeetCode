class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        char tempChar = ' ';
        for(int i = 0; i<size/2; i++){
            tempChar = s[i];
            s[i] = s[size-1-i];
            s[size-1-i] = tempChar;
        }
    }

}
//space complexity O(1)
//time complexity O(n/2)