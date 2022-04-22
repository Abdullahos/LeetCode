class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int counts = 0;
        while(i<nums.length-counts){
            if(nums[i]==0){
                counts++;
                for(int j = i; j<nums.length-counts; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-counts] = 0;
            }
            else    i++;
        }
    }
}