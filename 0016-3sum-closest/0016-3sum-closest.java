class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;

        int max_diff=Integer.MAX_VALUE;
        int res_sum=0;

        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;

            while(left<right){
                int total = nums[i] + nums[left] + nums[right];
                int d= Math.abs(target-total);

                if(max_diff>d){
                    max_diff=d;
                    res_sum=total;
                }
                if(total==target){
                    return res_sum;
                }
                if(total<target){
                    left++;
                }else{
                    right--;
                }  
            }
        }
        return res_sum;
    }
}