class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int cnt=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[j-1]){
                nums[i+1]=nums[j];
                i++;
                cnt++;
            }
        }
        return cnt;
    }
}