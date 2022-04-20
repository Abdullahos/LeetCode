/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1; 
        int end = n;
        Random r = new Random();
        while(start<end){
            int idx = r.nextInt(end+1-start)+start;
            System.out.println(idx);
            if(isBadVersion(idx)){
                if(!isBadVersion(idx-1))    return idx;
                end = idx;
            }
            else    start = idx;
        }
        return start;
    }
}