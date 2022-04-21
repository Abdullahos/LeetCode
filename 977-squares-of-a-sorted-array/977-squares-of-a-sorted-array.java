class Solution {
    static void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    static int partition(int[] arr, int low, int high)
{
     
    // pivot
    int pivot = arr[high];
     
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
         
        // If current element is smaller
        // than the pivot
        if (arr[j] < pivot)
        {
             
            // Increment index of
            // smaller element
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
    static int[] quickSort(int[] arr, int low, int high)
{
    if (low < high)
    {
         
        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = partition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
        return arr;
}
    public int[] square(int[] nums){
        for(int i = 0 ; i < nums.length; i++)
            nums[i] = nums[i]*nums[i];
        return nums;
    }
    public int[] sortedSquares(int[] nums) {
        int[] res = square(nums);
        return quickSort(res,0,res.length-1);
    }
}
//space complexity O(1)
//time complexity   O( n + n log(n) )