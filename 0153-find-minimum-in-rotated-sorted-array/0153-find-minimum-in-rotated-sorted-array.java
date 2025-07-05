class Solution {
    public int findMin(int[] nums) {
          int pivot = findPivot(nums);

        // If pivot not found, array is not rotated
        if (pivot == -1) {
            return nums[0];
        }

        // Minimum element is at (pivot + 1) % length
        return nums[(pivot + 1) % nums.length]; //for edge case we use modulus agar pivot last element ho toh
    }
    int findPivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start) / 2;
            //4 cases over there
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end=mid-1;
            } else{
                start=mid+1;
            }
        }
        return -1;
    }
}