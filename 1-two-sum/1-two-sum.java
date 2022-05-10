class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complement = new HashMap<>(); 
        for(int i = 0 ; i < nums.length; i++){
            if(complement.containsKey(nums[i]))    return new int[]{i,complement.get(nums[i])};
            complement.put(target-nums[i],i);
        }
        return new int[2];
    }
}