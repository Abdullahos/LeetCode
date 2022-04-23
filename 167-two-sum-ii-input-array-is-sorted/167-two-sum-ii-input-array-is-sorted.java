class BinarySearch {
    /*public int binarySearch(int[] arr, int start, int end, int target){
        if(start>end)   return -1;
        int mid = (start+end)/2;
        if(target == arr[mid])  return mid;
        if(target>arr[mid]) return binarySearch(arr, mid+1,end, target);
        return binarySearch(arr, start, mid-1, target);
    }
    */
    public static int binarySearch(int[] arr, int start, int end, int target){
        while(true){
            if(start>end)   return -1;
            int mid = (start+end)/2;
            if(target == arr[mid])  return mid;
            if(target>arr[mid]) start = mid+1;
            else end =  mid-1;
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            int j = BinarySearch.binarySearch(nums,i+1,nums.length-1,comp);
            if(j!=-1){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
        }
        return res;
    }
}