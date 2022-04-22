class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int counts = 0;
        //parse over the array
        while(i<nums.length-counts){    //O(N-N0) 
            if(nums[i]==0){
                counts++;
                //shifting
                for(int j = i; j<nums.length-counts; j++){  //O(N-N0)
                    nums[j] = nums[j+1];
                }
                //setting the duplicated item due to shifting to 0
                nums[nums.length-counts] = 0;
            }
            else    i++;
        }
    }
}
//space complexity O(1)
//time complexity O((N_N0)^2)