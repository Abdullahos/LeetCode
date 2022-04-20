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
            if(start>end)   return start;
            int mid = (start+end)/2;
            if(target == arr[mid])  return mid;
            if(target>arr[mid]) start = mid+1;
            else end =  mid-1;
        }
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        return BinarySearch.binarySearch(nums, 0, nums.length-1, target);
    }
}