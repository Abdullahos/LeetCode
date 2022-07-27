class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1)  return 0;
        
        int i = 0;
        int left = 0;   //assuming nothing i 0 not null
        int current = nums[i];
        int right = sumArray(nums)-current;
        int last;
        //as long as we !find pivot and the still in the boundary of array
        while(!compare(right, left) && i+1 < nums.length){
            i++;
            last = current;
            current = nums[i];
            left += last;
            right -= current;
        }
        if(compare(right, left))    return i;
        return -1;
        
        
    }
    public boolean compare(int left, int right){
        return left == right;
    } 
    public int sumArray(int[] arr){
        
        int sum = 0 ;
        for(int i = 0 ; i < arr.length; i++){
            sum += arr[i];    
        }
        return sum;
    }
}