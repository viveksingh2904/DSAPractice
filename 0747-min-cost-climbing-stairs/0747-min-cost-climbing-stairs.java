class Solution {
    public int minCost(int[] cost, int idx, int[] dp){
        if(idx==0 || idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]= cost[idx]+Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        // n is going from n-1 to 0
        int[] dp= new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
}