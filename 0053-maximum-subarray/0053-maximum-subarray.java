class Solution {
    public int kadane(int[]arr){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
        if(currentSum>maxSum){
            maxSum=currentSum;
        }
        if(currentSum<0){
            currentSum=0;
        }
        }
        return maxSum;

    }
    public int maxSubArray(int[] nums) {
         return kadane(nums);
    }
}