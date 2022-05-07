/*
class Solution {
    public  boolean binarySearchRecursive(int[] array, int key, int start, int end) {
        int middle = (start + end) / 2;

        if (end < start) {
            return false;
        }

        if (key < array[middle]) {
            return binarySearchRecursive(array, key, start, middle - 1);
        } else if (key > array[middle]) {
            return binarySearchRecursive(array, key, middle + 1, end);
        } else if (key == array[middle]) {
            return true;
        }

        return false;
    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++)
              if(binarySearchRecursive(nums,nums[i],i+1,nums.length))   return true;
        return false;
    }
}
//time complexity 	O(n*log(n)) + O(log n) ->  O(n*log n)
//space complexity  O(log2(n))
*/
class Solution {
        public boolean containsDuplicate(int[] nums) {
            if(nums.length <= 1)    return false;
            Arrays.sort(nums);
            for(int i = 0; i<nums.length-1; i++){
                if(nums[i]==nums[i+1])    return true;
            }
            return false;
        }
}