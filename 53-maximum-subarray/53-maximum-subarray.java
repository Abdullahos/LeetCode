/*
    class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)    return nums[0];
        int max = Integer.MIN_VALUE;
        boolean ever = false;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]<=0 && ever)  continue;
            if(nums[i]>0)   ever = true;
            int counter = nums[i];
            if(counter>max) max = counter;
            for(int j = i+1; j<nums.length; j++){
                counter += nums[j];
                if(counter>max) max = counter;
            }
        }
        return max;
                
    }
}
*/
  class Solution {
    private int max = Integer.MIN_VALUE;

    public void rec(int[] nums, int start,int bestOffer){
        if(start < 0)   return;
        
        int newOffer = nums[start] + bestOffer;
        if(newOffer>max) max = newOffer;

        if(newOffer<0)  newOffer = 0;
        rec(nums, start-1, newOffer);
    }
    public int maxSubArray(int[] nums) {
        if(nums.length ==  1)   return nums[0];
        rec(nums, nums.length-1, 0);
        return max;
    }
  }