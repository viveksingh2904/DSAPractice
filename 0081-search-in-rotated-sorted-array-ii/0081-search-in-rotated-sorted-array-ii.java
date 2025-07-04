class Solution {
    public boolean search(int[] nums, int target) {
         int pivot= findPivotWithDuplicate(nums);

        //if you do not find pivot, it means array is not rotated
        if(pivot == -1){
            //just do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found, we have found 2 asc sorted array
        //now we have pivot ,so now we find ans using pivot by some cases

        //case 1
        if(nums[pivot]== target){
            return true;
        }
        //case 2 -> if target is greater than start
       if (target >= nums[0]) {
             return binarySearch(nums, target, 0, pivot - 1);
        }


        //case 3 -> target is smaller than start else case
       return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }
    
     boolean binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }

     int findPivotWithDuplicate(int[] arr){
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
            //if element at middle , start, end are equal than just skip the duplicate
           if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
    // Check start+1 is in bounds
         if (start < end && arr[start] > arr[start + 1]) {
             return start;
         }
    start++;

    // Check end-1 is in bounds
    if (end > start && arr[end] < arr[end - 1]) {
        return end - 1;
    }
    end--;
}

            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start]== arr[mid] && arr[mid] > arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    
}