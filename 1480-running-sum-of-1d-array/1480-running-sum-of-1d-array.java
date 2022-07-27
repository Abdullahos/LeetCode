class Solution {
    public int[] runningSum(int[] nums) {
        int last = 0;
        for(int i = 0 ; i <nums.length; i++){
            nums[i] += last;
            last = nums[i];
        }
        return nums;
    }
}
//space complexity O(1)
//time complexity O(n)