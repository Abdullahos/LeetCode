class Solution {
    public int[] square(int[] nums){
        for(int i = 0 ; i < nums.length; i++)
            nums[i] = nums[i]*nums[i];
        return nums;
    }
    public int[] sortedSquares(int[] nums) {
        int[] res = square(nums);
        Arrays.sort(res);
        return res;
    }
}
//space complexity O(n)
//time complexity   O(n+olog(n))